package org.sdcc.sample.repo;

import org.sdcc.sample.entity.Chaincode;
import org.springframework.data.repository.CrudRepository;

public interface ChaincodeRepository extends CrudRepository<Chaincode, Integer> {

}
