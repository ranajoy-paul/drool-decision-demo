package com.example.drools.decision.demo.controller;

import com.example.drools.decision.demo.model.GuideODRate;
import com.example.drools.decision.demo.model.VehicleRequest;
import com.example.drools.decision.demo.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class VehicleController {
 
    @Autowired
    private VehicleService vehicleService;

    @PostMapping("/getGuideODRate")
    public ResponseEntity<GuideODRate> getDiscount(@RequestBody VehicleRequest vehicleRequest) {
        GuideODRate guideODRate = vehicleService.getGuideODRate(vehicleRequest);
        return new ResponseEntity<>(guideODRate, HttpStatus.OK);
    }
}
