package com.example.demo.repo;

import com.example.demo.model.Billionaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillionaireRepo extends JpaRepository<Billionaire, Integer> {
}
