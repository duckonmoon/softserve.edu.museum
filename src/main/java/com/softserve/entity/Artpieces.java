package com.softserve.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 *
 */
@Entity
public class Artpieces {

    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idArtpiece;
    private String author;
    @Column(nullable = false)
    private Long hall;
    private String material;
    private String technique;

    @ManyToMany(mappedBy = "artpieces")
    private List<Employees> employees;

    //constructor
    public Artpieces(){
    }

    //getters ans setters
    public List<Employees> getEmployeesList() {
        return employees;
    }

    public void setEmployeesList(List<Employees> employees) {
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getIdArtpiece() {
        return idArtpiece;
    }

    public void setIdArtpiece(Long idArtpiece) {
        this.idArtpiece = idArtpiece;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getHall() {
        return hall;
    }

    public void setHall(Long hall) {
        this.hall = hall;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTechnique() {
        return technique;
    }

    public void setTechnique(String technique) {
        this.technique = technique;
    }

    @Override
    public String toString(){
        return String.format("Artpiece name: " + getName()
                + " author " + getAuthor()
                + " hall " + getHall()
                + " material " + getMaterial()
                + " technique " + getTechnique());
    }
}
