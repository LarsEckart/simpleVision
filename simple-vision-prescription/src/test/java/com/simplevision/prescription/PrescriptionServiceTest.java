package com.simplevision.prescription;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PrescriptionServiceTest {

  @Autowired
  private PrescriptionService service;

  @Test
  public void findPrescriptionById() {
    PrescriptionDetails od = new PrescriptionDetails();
    PrescriptionDetails os = new PrescriptionDetails();
    od.setSphere("rightSphere");

    PrescriptionView prescription = new PrescriptionView();
    prescription.setOD(od);
    prescription.setOS(os);
    prescription.setId(UUID.randomUUID());

    UUID id = service.create(prescription).getId();

    assertEquals("rightSphere", service.findPrescriptionById(id).getOD().getSphere());
  }

}
