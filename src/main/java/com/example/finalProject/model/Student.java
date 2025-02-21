package com.example.finalProject.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "student")
public class Student {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;

        @Column(name = "roll_number")
        private String rollNo;

        @Column(name = "name")
        private String name;

        @Column(name = "department")
        private String department;
        }

