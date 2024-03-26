package com.simplevision.core.service;

import com.simplevision.core.domain.Lens;
import com.simplevision.core.domain.Patient;
import com.simplevision.core.mapper.LensMapper;
import com.simplevision.core.mapper.PatientMapper;
import com.simplevision.core.repository.InfoRepository;
import com.simplevision.core.repository.LensRepository;
import com.simplevision.core.view.LensView;
import com.simplevision.core.view.PatientView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoService {

  @Autowired
  private InfoRepository repository;
  @Autowired
  private LensRepository lensRepository;
  @Autowired
  private PatientMapper patientMapper;
  @Autowired
  private LensMapper lensMapper;

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

  public Lens create(LensView lens) {
    return lensRepository.save(lensMapper.map(lens));
  }

  public LensView findLensById(long id) {
    return lensMapper.map(lensRepository.findById(id).get());
  }
}
