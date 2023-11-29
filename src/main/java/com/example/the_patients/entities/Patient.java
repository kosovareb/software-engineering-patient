package com.example.the_patients.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String fatherName;
    private String motherName;
    private String email;
    private String address;
    private String phone;
    private String insuranceProvider;
    private String medicalHistory;
    private LocalDate dateOfBirth;
    private String gender;
    private String occupation;
    private String maritalStatus;
}
