package com.healthcare.appointmentservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healthcare.appointmentservice.entity.Appointment;

public interface AppointmentRepo extends JpaRepository<Appointment, Integer>{

}
