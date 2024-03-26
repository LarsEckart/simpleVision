package com.simplevision.prescription;

import com.simplevision.core.domain.Prescription;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrescriptionRepository extends CrudRepository<Prescription, Long> {

}
