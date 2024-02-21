package com.example.esercizio7;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStudents;
    @Column(nullable = false, name = "Student name")
    private String firstName;
    @Column(nullable = false, name = "Student last name")
    private String lastName;
    @Column(unique = true, nullable = false, name = "Email address")
    private String email;

}
