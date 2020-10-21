package com.example.demo;

import com.example.demo.service.BillionaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    final BillionaireService billionaireService;

    @Autowired
    public Runner(BillionaireService billionaireService) {
        this.billionaireService = billionaireService;
    }

    @Override
    public void run(String... args) {
        billionaireService.saveBillionaire("Peter", "Parker", "student");
        billionaireService.saveBillionaire("Bruce", "Wayne", "CEO");
    }
}
