package com.simplevision.lens;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class LensController {

  @Autowired
  LensService service;

  @PostMapping("/lens")
  public void create(@RequestBody LensView lens) {
    service.create(lens);
  }

  @GetMapping("/lens")
  public LensView findLensById(int id) {
    return service.findLensById(id);
  }
}
