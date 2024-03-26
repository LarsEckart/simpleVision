package com.simplevision.lens;

import org.springframework.stereotype.Service;

@Service
class LensService {

  private LensRepository lensRepository;
  private LensMapper lensMapper;

  public LensService(LensRepository lensRepository, LensMapper lensMapper) {
    this.lensRepository = lensRepository;
    this.lensMapper = lensMapper;
  }

  public Lens create(LensView lens) {
    return lensRepository.save(lensMapper.map(lens));
  }

  public LensView findLensById(long id) {
    return lensMapper.map(lensRepository.findById(id).get());
  }
}
