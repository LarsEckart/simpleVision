package com.simplevision.prescription;

import org.springframework.stereotype.Service;

@Service
class PrescriptionService {

  private final PrescriptionRepository prescriptionRepository;

  private final PrescriptionMapper prescriptionMapper;

  public PrescriptionService(PrescriptionRepository prescriptionRepository,
      PrescriptionMapper prescriptionMapper) {
    this.prescriptionRepository = prescriptionRepository;
    this.prescriptionMapper = prescriptionMapper;
  }

  public Prescription create(PrescriptionView prescription) {
    return prescriptionRepository.save(prescriptionMapper.map(prescription));
  }

  public PrescriptionView findPrescriptionById(long id) {
    return prescriptionMapper.map(prescriptionRepository.findById(id).get());
  }

}
