package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Client {

    @Id
    @GeneratedValue
    private long clientId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    // Direct data column for the relationship link
    @Column(nullable = false)
    private long advisorId;

    protected Client() {
    }

    public Client(long advisorId, String firstName, String lastName) {
        this.advisorId = advisorId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getClientId() {
        return clientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getAdvisorId() {
        return advisorId;
    }

    public void setAdvisorId(long advisorId) {
        this.advisorId = advisorId;
    }
}