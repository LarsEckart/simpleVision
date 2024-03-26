package com.simplevision.prescription;

import com.simplevision.core.service.InfoService;
import com.simplevision.core.view.LensView;
import com.simplevision.core.view.PatientView;
import com.simplevision.core.view.PrescriptionView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class PrescriptionController {

  @Autowired
  private InfoService service;

  @GetMapping("/prescription/{id}")
  public PrescriptionView findPrescriptionById(@PathVariable("id") int id) {
    return service.findPrescriptionById(id);
  }

  @PostMapping("/prescription")
  public void create(@RequestBody PrescriptionView prescription) {
    service.create(prescription);
  }

}
