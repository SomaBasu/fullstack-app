package com.healthcare.appointmentservice.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcare.appointmentservice.dto.AppointmentDto;
import com.healthcare.appointmentservice.entity.Appointment;
import com.healthcare.appointmentservice.service.AppointmentService;

@RestController
@RequestMapping("/api")
public class AppointmentController {
	
	@Autowired
	AppointmentService appointmentService;
	
	@GetMapping("/test")
	public String getTEst() {
		
		return "AppointmentController getTEst()";
		
	}
	
	@PostMapping("/bookings")
	public Appointment bookAppointment(@RequestBody AppointmentDto appointmentDto) {
		return appointmentService.bookAppointment(appointmentDto);
	}
	
	@GetMapping("/bookings")
	public List<Appointment> viewAppointment(@RequestBody AppointmentDto appointmentDto) {
		return appointmentService.viewAppointment(appointmentDto);
	}
	
	@PutMapping("/bookings/{id}")
	public Appointment rescheduleAppointment(@PathVariable int id, @RequestBody AppointmentDto appointmentDto) {
		return appointmentService.reScheduleAppointment(id, appointmentDto);
	}
	
	@DeleteMapping("/bookings/{id}")
	public void cancelAppointment(@PathVariable int id) {
		appointmentService.cancelAppointment(id);
	}
}
