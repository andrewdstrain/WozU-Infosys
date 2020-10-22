package com.wozu.day14.service;

import com.wozu.day14.model.Athlete;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface AthleteService {
    Optional<Athlete> getAthleteById(Long id);
    Athlete getAthleteByFirstName(String firstName);
    Athlete saveAthlete(Athlete athlete);
    Optional<Athlete> removeAthlete(Long id);
}
