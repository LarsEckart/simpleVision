package com.simplevision.lens;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class LensControllerTest {

  @InjectMocks
  private LensController controller;
  @Mock
  private LensService service;

  @Test
  public void createLens() {
    LensView lens = new LensView();

    controller.create(lens);

    verify(service).create(lens);
  }

  @Test
  public void findLensById() {
    LensView lens = new LensView();

    when(service.findLensById(anyLong())).thenReturn(lens);

    assertEquals(lens, controller.findLensById(1));
  }

}
