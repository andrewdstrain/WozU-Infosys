package com.wozu.day14.controller;

import com.wozu.day14.model.Athlete;
import com.wozu.day14.service.AthleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
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

    @GetMapping("/get/athletes")
    public Iterable<Athlete> getAthletes() { return athleteService.getAthletes(); }

    @PostMapping("/post/athlete")
    public Athlete postAthlete(@RequestBody Athlete athlete) { return athleteService.saveAthlete(athlete); }

    @PutMapping("/put/athlete/{id}")
    public Athlete putAthlete(@RequestBody Athlete athlete, @PathVariable Long id) {
        return athleteService.updateAthlete(athlete, id);
    }

    @DeleteMapping("/delete/athlete/{id}")
    public Optional<Athlete> deleteAthleteById(@PathVariable Long id) { return athleteService.removeAthlete(id); }
}
