package com.simplevision.prescription;

import java.util.Optional;
import java.util.UUID;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
class PrescriptionService {

  private final PrescriptionRepository prescriptionRepository;

  private final PrescriptionMapper prescriptionMapper;

  public PrescriptionService(PrescriptionRepository prescriptionRepository,
      PrescriptionMapper prescriptionMapper) {
    this.prescriptionRepository = prescriptionRepository;
    this.prescriptionMapper = prescriptionMapper;
  }

  @Transactional
public Prescription create(PrescriptionView prescription) {
    System.out.println("PrescriptionService.create " + prescription.getId());
    Prescription map = prescriptionMapper.map(prescription);
    System.out.println("PrescriptionService.map " + map.getId());
    Prescription savedPrescription = prescriptionRepository.save(map);
    System.out.println("PrescriptionService.save " + savedPrescription.getId());

    if (!savedPrescription.getId().equals(map.getId())) {
        throw new RuntimeException("The saved prescription ID does not match the provided ID");
    }

    Iterable<Prescription> all = prescriptionRepository.findAll();
    for (Prescription prescription2 : all) {
        System.out.println("PrescriptionService.all " + prescription2.getId());
    }
    return savedPrescription;
}

  public PrescriptionView findPrescriptionById(UUID id) {
    System.out.println("PrescriptionService.find " + id);
    Optional<Prescription> byId = prescriptionRepository.findById(id);
    Iterable<Prescription> all = prescriptionRepository.findAll();
    for (Prescription prescription : all) {
      System.out.println("PrescriptionService.all " + prescription.getId());
    }
    PrescriptionView map = prescriptionMapper.map(byId.get());


    return map;
  }

}
