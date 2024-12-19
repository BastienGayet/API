package com.HR.example.API.model;

import jakarta.persistence.*;
import lombok.Data;

@Data // Lombok annotation to generate getters, setters, equals, hashcode, and toString
@Entity // JPA annotation to make this class an Entity
@Table(name = "employees") // JPA annotation to map this class to the employees table in the database
public class Employee {

    @Id // JPA annotation to make this field the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // JPA annotation to make this field auto-increment
    private Long id;

    @Column(name = "first_name") // JPA annotation to map this field to the first_name column in the database
    private String firstname;

    @Column(name = "last_name") // JPA annotation to map this field to the last_name column in the database
    private String lastname;

    private String mail;

    private String password;

}
