package com.healthcare.coachservice.dto;

import java.time.LocalDate;
import java.util.Objects;

public class CoachDto {
	
	private String name;
	private String password;
	private LocalDate dob;
	private String gender;
	private String phone;
	private String speciality;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dob, gender, name, password, phone, speciality);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CoachDto other = (CoachDto) obj;
		return Objects.equals(dob, other.dob) && Objects.equals(gender, other.gender)
				&& Objects.equals(name, other.name) && Objects.equals(password, other.password)
				&& Objects.equals(phone, other.phone) && Objects.equals(speciality, other.speciality);
	}
	@Override
	public String toString() {
		return "CoachDto [name=" + name + ", password=" + password + ", dob=" + dob + ", gender=" + gender + ", phone="
				+ phone + ", speciality=" + speciality + "]";
	}
	
	
	
	
	
	
}
