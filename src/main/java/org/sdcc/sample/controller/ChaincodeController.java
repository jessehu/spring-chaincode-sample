package org.sdcc.sample.controller;

import org.sdcc.sample.repo.ChaincodeRepository;
import org.sdcc.sample.repo.SimpleAssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public class ChaincodeController {
   @Autowired
   SimpleAssetRepository simpleAssetRepo;
   @Autowired
   ChaincodeRepository ccRepo;
}
