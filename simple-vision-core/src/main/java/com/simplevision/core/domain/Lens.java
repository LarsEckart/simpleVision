package com.simplevision.core.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "info")
class Lens implements ILens {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String lensMaterial;
  private String lensAdditions;
  private String lensStyle;

  @Override
  public long getId() {
    return id;
  }

  @Override
  public void setId(long id) {
    this.id = id;
  }

  @Override
  public String getLensMaterial() {
    return lensMaterial;
  }

  @Override
  public void setLensMaterial(String lensMaterial) {
    this.lensMaterial = lensMaterial;
  }

  @Override
  public String getLensAdditions() {
    return lensAdditions;
  }

  @Override
  public void setLensAdditions(String lensAdditions) {
    this.lensAdditions = lensAdditions;
  }

  @Override
  public String getLensStyle() {
    return lensStyle;
  }

  @Override
  public void setLensStyle(String lensStyle) {
    this.lensStyle = lensStyle;
  }
}
