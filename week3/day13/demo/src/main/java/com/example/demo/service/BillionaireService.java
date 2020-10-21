package com.example.demo.service;

import com.example.demo.model.Billionaire;
import com.example.demo.repo.BillionaireRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillionaireService {
    @Autowired
    BillionaireRepo billionaireRepo;

    public void saveBillionaire(String firstName, String lastName, String career) {
        billionaireRepo.save(new Billionaire(firstName, lastName, career));
    }
}
