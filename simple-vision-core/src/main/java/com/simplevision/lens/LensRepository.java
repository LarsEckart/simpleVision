package com.simplevision.lens;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LensRepository extends CrudRepository<Lens, Long> {

}
