package com.example.drools.decision.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VehicleRequest {
    //private String customerNumber;
    private Integer vehicleAge;
    private Integer cubicCapacity;
    private RTOZone rtoZone;
}
