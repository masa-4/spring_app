package com.example.webapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Id;

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "Name")
    public String username;

    @Column(name = "Email")
    public String Email;

    @Column(name = "Password")
    public String Password;

    // getters and setters
}
