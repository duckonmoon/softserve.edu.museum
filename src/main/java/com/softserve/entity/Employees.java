package com.softserve.entity;

import javax.persistence.*;

import java.util.List;
import java.util.Set;

/**
 * Created by shmidt on 16.07.17.
 */
@Entity
@NamedQueries(
        @NamedQuery(name = "Task05", query = "from Employees where position = 'guide'")
)
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEmployee;
    private String firstname;
    private String lastname;
    private String position;

    @OneToMany(mappedBy = "guide")
    private List<Excursions> excursions;

    @ManyToMany
    private List<Artpieces> artpieces;

    //constructor
    public Employees() {
    }

    //getters and setters

    public Long getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Long idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public List<Excursions> getExcursions() {
        return excursions;
    }

    public void setExcursions(List<Excursions> excursions) {
        this.excursions = excursions;
    }

    public List<Artpieces> getArtpieces() {
        return artpieces;
    }

    public void setArtpieces(List<Artpieces> artpieces) {
        this.artpieces = artpieces;
    }
}
