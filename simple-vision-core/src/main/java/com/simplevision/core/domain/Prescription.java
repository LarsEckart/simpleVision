package com.simplevision.core.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "info")
public class Prescription {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

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

  public long getId() {
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

  public void setId(long id) {
    this.id = id;
  }
}
