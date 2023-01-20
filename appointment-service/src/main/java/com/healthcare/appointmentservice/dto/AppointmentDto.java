package com.healthcare.appointmentservice.dto;

import java.time.LocalDate;
import java.util.Objects;

public class AppointmentDto {
	
	private LocalDate doa;
	private String slot;
	private int coachId;
	private int userId;
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
	@Override
	public int hashCode() {
		return Objects.hash(coachId, doa, slot, userId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AppointmentDto other = (AppointmentDto) obj;
		return coachId == other.coachId && Objects.equals(doa, other.doa) && Objects.equals(slot, other.slot)
				&& userId == other.userId;
	}
	@Override
	public String toString() {
		return "AppointmentDto [doa=" + doa + ", slot=" + slot + ", coachId=" + coachId + ", userId=" + userId + "]";
	}
	
	

}
