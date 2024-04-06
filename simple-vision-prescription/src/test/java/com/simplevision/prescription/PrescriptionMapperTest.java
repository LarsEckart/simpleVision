package com.simplevision.prescription;

import static org.junit.jupiter.api.Assertions.*;

import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrescriptionMapperTest {

  private PrescriptionMapper mapper;
  private Prescription prescription;

  private PrescriptionView prescriptionView;
  private PrescriptionDetails od;
  private PrescriptionDetails os;

  @BeforeEach
  public void setup() {
    mapper = new PrescriptionMapper();
    prescription = new Prescription();

    prescriptionView = new PrescriptionView();
    od = new PrescriptionDetails();
    os = new PrescriptionDetails();

    prescriptionView.setOS(os);
    prescriptionView.setOD(od);
  }

  @Test
  public void setId() {
    UUID id = UUID.randomUUID();
    prescription.setId(id);

    assertEquals(id, mapper.map(prescription).getId());
  }

  @Test
  public void setPD() {
    prescription.setPD("pd");

    assertEquals("pd", mapper.map(prescription).getPd());
  }

  @Test
  public void setLeftAxis() {
    prescription.setLeftAxis("leftAxis");

    assertEquals("leftAxis", mapper.map(prescription).getOS().getAxis());
  }

  @Test
  public void setLeftCylinder() {
    prescription.setLeftCylinder("leftCylinder");

    assertEquals("leftCylinder", mapper.map(prescription).getOS().getCylinder());
  }

  @Test
  public void setLeftSphere() {
    prescription.setLeftSphere("leftSphere");

    assertEquals("leftSphere", mapper.map(prescription).getOS().getSphere());
  }

  @Test
  public void setRightAxis() {
    prescription.setRightAxis("rightAxis");

    assertEquals("rightAxis", mapper.map(prescription).getOD().getAxis());
  }

  @Test
  public void setRightCylinder() {
    prescription.setRightCylinder("rightCylinder");

    assertEquals("rightCylinder", mapper.map(prescription).getOD().getCylinder());
  }

  @Test
  public void setRightSphere() {
    prescription.setRightSphere("rightSphere");

    assertEquals("rightSphere", mapper.map(prescription).getOD().getSphere());
  }

  @Test
  public void mapInfo_rightSphere() {
    od.setSphere("rightSphere");

    assertEquals("rightSphere", mapper.map(prescriptionView).getRightSphere());
  }

  @Test
  public void mapInfo_rightCylinder() {
    od.setCylinder("rightCylinder");

    assertEquals("rightCylinder", mapper.map(prescriptionView).getRightCylinder());
  }

  @Test
  public void mapInfo_rightAxis() {
    od.setAxis("rightAxis");

    assertEquals("rightAxis", mapper.map(prescriptionView).getRightAxis());
  }

  @Test
  public void mapInfo_leftSphere() {
    os.setSphere("leftSphere");

    assertEquals("leftSphere", mapper.map(prescriptionView).getLeftSphere());
  }

  @Test
  public void mapInfo_leftAxis() {
    os.setAxis("leftAxis");

    assertEquals("leftAxis", mapper.map(prescriptionView).getLeftAxis());
  }

  @Test
  public void mapInfo_leftCylinder() {
    os.setCylinder("leftCylinder");

    assertEquals("leftCylinder", mapper.map(prescriptionView).getLeftCylinder());
  }

  @Test
  public void mapInfo_pd() {
    prescriptionView.setPd("pd");

    assertEquals("pd", mapper.map(prescriptionView).getPD());
  }

  @Test
  public void mapInfo_id() {
    UUID id = UUID.randomUUID();
    prescriptionView.setId(id);

    assertEquals(id, mapper.map(prescriptionView).getId());
  }

}
