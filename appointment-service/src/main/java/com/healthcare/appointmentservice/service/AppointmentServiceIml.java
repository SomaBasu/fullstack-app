package com.healthcare.appointmentservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcare.appointmentservice.dto.AppointmentDto;
import com.healthcare.appointmentservice.entity.Appointment;
import com.healthcare.appointmentservice.repo.AppointmentRepo;

@Service
public class AppointmentServiceIml implements AppointmentService{
	
	@Autowired
	AppointmentRepo appointmentRepo;
	
	@Override
	public Appointment bookAppointment(AppointmentDto appoDto) {
		Appointment appointment = new Appointment();
		appointment.setDoa(appoDto.getDoa());
		appointment.setSlot(appoDto.getSlot());
		appointment.setCoachId(appoDto.getCoachId());
		appointment.setUserId(appoDto.getUserId());
		
		
		return appointmentRepo.save(appointment);
	}

	@Override
	public Appointment reScheduleAppointment(int id, AppointmentDto appoDto) {
		Appointment appointment = new Appointment();
		appointment.setId(id);
		appointment.setDoa(appoDto.getDoa());
		appointment.setSlot(appoDto.getSlot());
		appointment.setCoachId(appoDto.getCoachId());
		appointment.setUserId(appoDto.getUserId());
		return appointmentRepo.save(appointment);
	}

	@Override
	public void cancelAppointment(int id) {
		 appointmentRepo.deleteById(id);
	}

	@Override
	public List<Appointment> viewAppointment(AppointmentDto appoDto) {
		return appointmentRepo.findAll();
	}
	
	

}
