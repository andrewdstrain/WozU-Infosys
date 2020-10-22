package com.wozu.day14.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Athlete {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String sport;
    private String team;

    public Athlete(java.lang.String firstName, java.lang.String lastName, java.lang.String sport, java.lang.String team) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sport = sport;
        this.team = team;
    }

    public Athlete() {

    }

    public Long getId() {
        return id;
    }

    public java.lang.String getFirstName() {
        return firstName;
    }

    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }

    public java.lang.String getLastName() {
        return lastName;
    }

    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }

    public java.lang.String getSport() {
        return sport;
    }

    public void setSport(java.lang.String sport) {
        this.sport = sport;
    }

    public java.lang.String getTeam() {
        return team;
    }

    public void setTeam(java.lang.String team) {
        this.team = team;
    }
}
