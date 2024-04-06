package com.simplevision.prescription;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.annotations.Type;

@Entity
class Prescription {

  @Id
  @Type(type="org.hibernate.type.UUIDCharType")
  private UUID id;
  private String leftSphere;
  private String leftCylinder;
  private String leftAxis;
  private String rightSphere;
  private String rightCylinder;
  private String rightAxis;
  private String PD;


  public String getLeftSphere() {
    return leftSphere;
  }

  public String getLeftCylinder() {
    return leftCylinder;
  }

  public String getLeftAxis() {
    return leftAxis;
  }

  public String getRightSphere() {
    return rightSphere;
  }

  public String getRightCylinder() {
    return rightCylinder;
  }

  public String getRightAxis() {
    return rightAxis;
  }

  public String getPD() {
    return PD;
  }

  public UUID getId() {
    return id;
  }

  public void setLeftSphere(String leftSphere) {
    this.leftSphere = leftSphere;
  }

  public void setLeftCylinder(String leftCylinder) {
    this.leftCylinder = leftCylinder;
  }

  public void setLeftAxis(String leftAxis) {
    this.leftAxis = leftAxis;
  }

  public void setRightSphere(String rightSphere) {
    this.rightSphere = rightSphere;
  }

  public void setRightCylinder(String rightCylinder) {
    this.rightCylinder = rightCylinder;
  }

  public void setRightAxis(String rightAxis) {
    this.rightAxis = rightAxis;
  }

  public void setPD(String pd) {
    this.PD = pd;
  }

  public void setId(UUID id) {
    this.id = id;
  }

}
