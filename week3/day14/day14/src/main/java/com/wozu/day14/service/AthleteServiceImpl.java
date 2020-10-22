package com.wozu.day14.service;

import com.wozu.day14.model.Athlete;
import com.wozu.day14.repo.AthleteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AthleteServiceImpl implements AthleteService {

    final AthleteRepo athleteRepo;

    @Autowired
    public AthleteServiceImpl(AthleteRepo athleteRepo) {
        this.athleteRepo = athleteRepo;
    }

    @Override
    public Iterable<Athlete> getAthletes() {
        return athleteRepo.findAll();
    }

    @Override
    public Optional<Athlete> getAthleteById(Long id) {
        return  athleteRepo.findById(id);
    }

    @Override
    public Athlete getAthleteByFirstName(String firstName) {
        return null;
    }

    @Override
    public Athlete saveAthlete(Athlete athlete) {
        athleteRepo.save(athlete);
        return athlete;
    }

    @Override
    public Optional<Athlete> removeAthlete(Long id) {
        Optional<Athlete> athlete = athleteRepo.findById(id);

        athleteRepo.deleteById(id);

        return athlete;
    }

    @Override
    public Athlete updateAthlete(Athlete athlete, Long id) {
        Optional<Athlete> optAthlete = athleteRepo.findById(id);
        if (optAthlete == null) return null;
        Athlete newAthlete = optAthlete.get();

        newAthlete.setFirstName(athlete.getFirstName());
        newAthlete.setLastName(athlete.getLastName());
        newAthlete.setTeam(athlete.getTeam());
        newAthlete.setSport(athlete.getSport());

        athleteRepo.save(newAthlete);
        return newAthlete;
    }
}
