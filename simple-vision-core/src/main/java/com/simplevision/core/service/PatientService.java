package com.simplevision.core.service;

import com.simplevision.core.domain.Patient;
import com.simplevision.core.mapper.PatientMapper;
import com.simplevision.core.repository.PatientRepository;
import com.simplevision.core.view.PatientView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

  @Autowired
  private PatientRepository repository;
  @Autowired
  private PatientMapper patientMapper;

  public PatientView findPatientById(long id) {
    return patientMapper.map(repository.findById(id).get());
  }

  public PatientView findPatientByEmail(String email) {
    return patientMapper.map(repository.findByEmail(email));
  }

  public PatientView findPatientByPhone(String phone) {
    return patientMapper.map(repository.findByPhoneNumber(phone));
  }

  public Patient create(PatientView patient) {
    return repository.save(patientMapper.map(patient));
  }
}
