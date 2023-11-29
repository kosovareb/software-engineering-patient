package com.example.the_patients.services;

import com.example.the_patients.models.PatientDTO;

import java.util.List;

public interface PatientService {

    boolean add(PatientDTO patientDTO);

    List<PatientDTO> getAll();

    PatientDTO getById(long id);

    boolean update(long id, PatientDTO updatedPatientDTO);

    boolean deleteById(long id);
}
