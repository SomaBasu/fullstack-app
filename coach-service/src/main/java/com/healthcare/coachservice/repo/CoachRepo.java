package com.healthcare.coachservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healthcare.coachservice.entity.Coach;

public interface CoachRepo extends JpaRepository<Coach, Integer>{

}
