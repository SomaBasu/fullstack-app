package com.healthcare.appointmentservice.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private LocalDate doa;
	private String slot;
	private int coachId;
	private int userId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getDoa() {
		return doa;
	}
	public void setDoa(LocalDate doa) {
		this.doa = doa;
	}
	public String getSlot() {
		return slot;
	}
	public void setSlot(String slot) {
		this.slot = slot;
	}
	public int getCoachId() {
		return coachId;
	}
	public void setCoachId(int coachId) {
		this.coachId = coachId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	

}
