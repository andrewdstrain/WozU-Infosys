package com.example.demo.controller;

import com.example.demo.model.Billionaire;
import com.example.demo.repo.BillionaireRepo;
import com.example.demo.service.BillionaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BillionaireController {
    final BillionaireService billionaireService;
    final BillionaireRepo billionaireRepo;

    @Autowired
    public BillionaireController(BillionaireService service, BillionaireRepo repo) {
        billionaireService = service;
        billionaireRepo = repo;
    }

    @PostMapping("/postBruce")
    public void postBruce() {
        billionaireService.saveBillionaire("Bruce", "Wayne", "CEO");
    }

    @GetMapping("/getAll")
    public List<Billionaire> getBruce() {
        return billionaireRepo.findAll();
    }
}
