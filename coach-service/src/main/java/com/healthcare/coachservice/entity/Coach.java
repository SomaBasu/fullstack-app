package com.healthcare.coachservice.entity;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Coach {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String password;
	private LocalDate doa;
	private String gender;
	private String phone;
	private String speciality;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public LocalDate getDoa() {
		return doa;
	}
	public void setDoa(LocalDate doa) {
		this.doa = doa;
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
		return Objects.hash(doa, gender, id, name, password, phone, speciality);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coach other = (Coach) obj;
		return Objects.equals(doa, other.doa) && Objects.equals(gender, other.gender) && id == other.id
				&& Objects.equals(name, other.name) && Objects.equals(password, other.password)
				&& Objects.equals(phone, other.phone) && Objects.equals(speciality, other.speciality);
	}
	@Override
	public String toString() {
		return "Coach [id=" + id + ", name=" + name + ", password=" + password + ", doa=" + doa + ", gender=" + gender
				+ ", phone=" + phone + ", speciality=" + speciality + "]";
	}
	
	
	
	
	
	
	
}
