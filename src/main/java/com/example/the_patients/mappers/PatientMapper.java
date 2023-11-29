package com.example.the_patients.mappers;

import com.example.the_patients.entities.Patient;
import com.example.the_patients.models.PatientDTO;

import org.springframework.stereotype.Component;


@Component
public class PatientMapper {

    public Patient toEntity(PatientDTO from) {
        var to = new Patient();
        to.setId(from.getId());
        to.setName(from.getName());
        to.setSurname(from.getSurname());
        to.setFatherName(from.getFatherName());
        to.setMotherName(from.getMotherName());
        to.setEmail(from.getEmail());
        to.setAddress(from.getAddress());
        to.setPhone(from.getPhone());
        to.setInsuranceProvider(from.getInsuranceProvider());
        to.setMedicalHistory(from.getMedicalHistory());
        to.setDateOfBirth(from.getDateOfBirth());
        to.setGender(from.getGender());
        to.setOccupation(from.getOccupation());
        to.setMaritalStatus(from.getMaritalStatus());
        return to;
    }

    public PatientDTO toModel(Patient from) {
        var to = new PatientDTO();
        to.setId(from.getId());
        to.setName(from.getName());
        to.setSurname(from.getSurname());
        to.setFatherName(from.getFatherName());
        to.setMotherName(from.getMotherName());
        to.setEmail(from.getEmail());
        to.setAddress(from.getAddress());
        to.setPhone(from.getPhone());
        to.setInsuranceProvider(from.getInsuranceProvider());
        to.setMedicalHistory(from.getMedicalHistory());
        to.setDateOfBirth(from.getDateOfBirth());
        to.setGender(from.getGender());
        to.setOccupation(from.getOccupation());
        to.setMaritalStatus(from.getMaritalStatus());
        return to;
    }
}
