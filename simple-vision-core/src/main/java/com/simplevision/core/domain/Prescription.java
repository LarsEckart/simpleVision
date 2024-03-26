package com.simplevision.core.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "info")
public class Prescription implements IPrescription {

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


  @Override
  public String getLeftSphere() {
    return leftSphere;
  }

  @Override
  public String getLeftCylinder() {
    return leftCylinder;
  }

  @Override
  public String getLeftAxis() {
    return leftAxis;
  }

  @Override
  public String getRightSphere() {
    return rightSphere;
  }

  @Override
  public String getRightCylinder() {
    return rightCylinder;
  }

  @Override
  public String getRightAxis() {
    return rightAxis;
  }

  @Override
  public String getPD() {
    return PD;
  }

  @Override
  public long getId() {
    return id;
  }

  @Override
  public void setLeftSphere(String leftSphere) {
    this.leftSphere = leftSphere;
  }

  @Override
  public void setLeftCylinder(String leftCylinder) {
    this.leftCylinder = leftCylinder;
  }

  @Override
  public void setLeftAxis(String leftAxis) {
    this.leftAxis = leftAxis;
  }

  @Override
  public void setRightSphere(String rightSphere) {
    this.rightSphere = rightSphere;
  }

  @Override
  public void setRightCylinder(String rightCylinder) {
    this.rightCylinder = rightCylinder;
  }

  @Override
  public void setRightAxis(String rightAxis) {
    this.rightAxis = rightAxis;
  }

  @Override
  public void setPD(String pd) {
    this.PD = pd;
  }

  @Override
  public void setId(long id) {
    this.id = id;
  }
}
