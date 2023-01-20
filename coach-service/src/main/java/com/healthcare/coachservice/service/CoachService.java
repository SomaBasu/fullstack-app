package com.healthcare.coachservice.service;

import java.util.List;

import com.healthcare.coachservice.dto.CoachDto;
import com.healthcare.coachservice.entity.Coach;

public interface CoachService {
	
	Coach registerCoach(CoachDto coachDto );

	List<Coach> getAllCoaches();

	Coach getCoachById(int id);
}
