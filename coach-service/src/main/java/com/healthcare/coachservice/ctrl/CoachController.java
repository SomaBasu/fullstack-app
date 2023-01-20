package com.healthcare.coachservice.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcare.coachservice.dto.CoachDto;
import com.healthcare.coachservice.entity.Coach;
import com.healthcare.coachservice.service.CoachService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class CoachController {
	
	@Autowired
	private CoachService coachService;
	
	@GetMapping("/test")
	public String getTEst() {
		
		return "CoachController getTEst()";
		
	}
	
	@PostMapping("/coaches")
	public Coach registerCoach(@RequestBody CoachDto coachDto) {
		System.out.println(coachDto);
		
		return coachService.registerCoach(coachDto);
	}
	
	@GetMapping("/coaches")
	public List<Coach> getAllCoaches() {
		
		return coachService.getAllCoaches();
		
	}
	
	@GetMapping("/coaches/{id}")
	public Coach viewCoach(@PathVariable int id) {
		
		return coachService.getCoachById(id);
	}

}
