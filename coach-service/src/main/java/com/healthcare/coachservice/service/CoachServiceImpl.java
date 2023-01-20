package com.healthcare.coachservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcare.coachservice.dto.CoachDto;
import com.healthcare.coachservice.entity.Coach;
import com.healthcare.coachservice.repo.CoachRepo;

@Service
public class CoachServiceImpl implements CoachService{

	@Autowired
	private CoachRepo coachRepo;
	
	@Override
	public Coach registerCoach(CoachDto coachDto) {
		Coach coach = new Coach();
		coach.setName(coachDto.getName());
		coach.setPassword(coachDto.getPassword());
		coach.setDoa(coachDto.getDob());
		coach.setGender(coachDto.getGender());
		coach.setPhone(coachDto.getPhone());
		coach.setSpeciality(coachDto.getSpeciality());
		
		return coachRepo.save(coach);
	}

	@Override
	public List<Coach> getAllCoaches() {
		return coachRepo.findAll();
	}

	@Override
	public Coach getCoachById(int id) {
		return coachRepo.findById(id).get();
	}

}
