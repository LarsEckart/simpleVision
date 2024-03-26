package com.simplevision.prescription;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface PrescriptionRepository extends CrudRepository<Prescription, Long> {

}
