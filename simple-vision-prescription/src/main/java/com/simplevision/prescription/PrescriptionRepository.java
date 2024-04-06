package com.simplevision.prescription;

import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface PrescriptionRepository extends CrudRepository<Prescription, UUID> {

}
