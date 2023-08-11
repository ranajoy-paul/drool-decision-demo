package com.example.drools.decision.demo.service;

import com.example.drools.decision.demo.model.GuideODRate;
import com.example.drools.decision.demo.model.VehicleRequest;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VehicleService {
 
    @Autowired
    private KieContainer kieContainer;
 
    public GuideODRate getGuideODRate(VehicleRequest vehicleRequest) {
        GuideODRate guideODRate = new GuideODRate();
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.setGlobal("guideODRate", guideODRate);
        kieSession.insert(vehicleRequest);
        kieSession.fireAllRules();
        kieSession.dispose();
        return guideODRate;
    }
}