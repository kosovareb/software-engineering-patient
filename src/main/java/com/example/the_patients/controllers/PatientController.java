package com.example.the_patients.controllers;

import com.example.the_patients.models.PatientDTO;
import com.example.the_patients.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

    private final PatientService patientService;

    @Autowired
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping
    public boolean addPatient(@RequestBody PatientDTO patientDTO) {
        return patientService.add(patientDTO);
    }

    @GetMapping
    public List<PatientDTO> getAllPatients() {
        return patientService.getAll();
    }

    @GetMapping("/{id}")
    public PatientDTO getPatientById(@PathVariable long id) {
        return patientService.getById(id);
    }

    @PutMapping("/{id}")
    public boolean updatePatient(@PathVariable long id, @RequestBody PatientDTO updatedPatientDTO) {
        return patientService.update(id, updatedPatientDTO);
    }

    @DeleteMapping("/{id}")
    public boolean deletePatient(@PathVariable long id) {
        return patientService.deleteById(id);
    }
}
