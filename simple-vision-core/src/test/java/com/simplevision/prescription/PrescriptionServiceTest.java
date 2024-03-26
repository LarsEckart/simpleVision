package com.simplevision.prescription;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.simplevision.core.view.PrescriptionDetails;
import com.simplevision.core.view.PrescriptionView;
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

    long id = service.create(prescription).getId();

    assertEquals("rightSphere", service.findPrescriptionById(id).getOD().getSphere());
  }

}
