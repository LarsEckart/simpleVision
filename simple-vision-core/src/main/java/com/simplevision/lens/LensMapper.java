package com.simplevision.lens;

import org.springframework.stereotype.Component;

@Component
class LensMapper {

  public Lens map(LensView lensView) {
    Lens lens = new Lens();
    lens.setLensMaterial(lensView.getMaterial());
    lens.setLensStyle(lensView.getStyle());
    lens.setLensAdditions(lensView.getAdditions());
    return lens;
  }

  public LensView map(Lens lens) {
    LensView lensView = new LensView();
    lensView.setMaterial(lens.getLensMaterial());
    lensView.setStyle(lens.getLensStyle());
    lensView.setAdditions(lens.getLensAdditions());
    return lensView;
  }
}
