package com.healthcare.appointmentservice.service;

import java.util.List;

import com.healthcare.appointmentservice.dto.AppointmentDto;
import com.healthcare.appointmentservice.entity.Appointment;


public interface AppointmentService {
	Appointment bookAppointment(AppointmentDto appoDto);
	Appointment reScheduleAppointment(int id, AppointmentDto appoDto);
	List<Appointment> viewAppointment(AppointmentDto appoDto);
	void cancelAppointment(int id);

}
