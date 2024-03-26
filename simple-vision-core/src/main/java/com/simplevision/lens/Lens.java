package com.simplevision.lens;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "info")
class Lens {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String lensMaterial;
  private String lensAdditions;
  private String lensStyle;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getLensMaterial() {
    return lensMaterial;
  }

  public void setLensMaterial(String lensMaterial) {
    this.lensMaterial = lensMaterial;
  }

  public String getLensAdditions() {
    return lensAdditions;
  }

  public void setLensAdditions(String lensAdditions) {
    this.lensAdditions = lensAdditions;
  }

  public String getLensStyle() {
    return lensStyle;
  }

  public void setLensStyle(String lensStyle) {
    this.lensStyle = lensStyle;
  }
}
