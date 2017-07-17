package com.softserve.entity;

import javax.persistence.*;

import java.util.Set;

/**
 * Created by shmidt on 16.07.17.
 */
@Entity
@NamedQueries({@NamedQuery(name = "Task07", query = "from Excursions as e where e.start>=? and e.end<=?"),
        @NamedQuery(name = "Task09" , query = "select count (*)from Excursions exc where exc.start >= ? AND exc.end <= ?")

})
public class Excursions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExcursion;
    private String start;
    private String end;

    @ManyToOne
    private Employees guide;

    //constructor
    public Excursions(){
    }

    //getters and setters
    public Long getIdExcursion() {
        return idExcursion;
    }

    public void setIdExcursion(Long idExcursion) {
        this.idExcursion = idExcursion;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Employees getGuide() {
        return guide;
    }

    public void setGuide(Employees guide) {
        this.guide = guide;
    }
}
