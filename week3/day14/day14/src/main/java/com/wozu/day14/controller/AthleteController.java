package com.wozu.day14.controller;

import com.wozu.day14.model.Athlete;
import com.wozu.day14.service.AthleteService;
import com.wozu.day14.service.AthleteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class AthleteController {
    final AthleteService athleteService;

    @Autowired
    public AthleteController(AthleteService athleteService) {
        this.athleteService = athleteService;
    }


    @GetMapping("/get/athlete/{id}")
    public Optional<Athlete> getAthleteById(@PathVariable Long id) {
        return athleteService.getAthleteById(id);
    }

    @PostMapping("/post/athlete")
    public Athlete postAthlete(@RequestBody Athlete athlete) {
        athleteService.saveAthlete(athlete);
        return athlete;
    }
}
