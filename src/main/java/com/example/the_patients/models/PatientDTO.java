package com.example.the_patients.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientDTO {
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
