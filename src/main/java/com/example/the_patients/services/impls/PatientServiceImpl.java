package com.example.the_patients.services.impls;

import com.example.the_patients.entities.Patient;
import com.example.the_patients.mappers.PatientMapper;
import com.example.the_patients.models.PatientDTO;
import com.example.the_patients.repositories.PatientRepository;
import com.example.the_patients.services.PatientService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PatientServiceImpl implements PatientService {

    private final PatientRepository repository;
    private final PatientMapper mapper;

    @Autowired
    public PatientServiceImpl(PatientRepository repository, PatientMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public boolean add(PatientDTO patientDTO) {
        var entity = mapper.toEntity(patientDTO);
        repository.save(entity);
        return true;
    }

    @Override
    public List<PatientDTO> getAll() {
        return repository.findAll().stream()
                .map(mapper::toModel)
                .collect(Collectors.toList());
    }

    @Override
    public PatientDTO getById(long id) {
        var optionalEntity = repository.findById(id);
        if (optionalEntity.isEmpty())
            throw new EntityNotFoundException("Patient not found with id " + id);
        var entity = optionalEntity.get();
        return mapper.toModel(entity);
    }

    @Override
    public boolean update(long id, PatientDTO updatedPatientDTO) {
        var optionalPatient = repository.findById(id);
        if (optionalPatient.isEmpty())
            throw new EntityNotFoundException("Patient not found with id " + id);

        var entity = optionalPatient.get();
        // Update the fields based on your PatientDTO structure
        entity.setName(updatedPatientDTO.getName());
        entity.setSurname(updatedPatientDTO.getSurname());
        // ... (update other fields)

        repository.save(entity);
        return true;
    }

    @Override
    public boolean deleteById(long id) {
        repository.deleteById(id);
        return true;
    }
}
