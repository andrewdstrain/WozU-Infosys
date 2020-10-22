package com.wozu.day14.repo;

import com.wozu.day14.model.Athlete;
import org.springframework.data.repository.CrudRepository;

public interface AthleteRepo extends CrudRepository<Athlete, Long> {
}
