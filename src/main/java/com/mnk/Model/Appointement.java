package com.mnk.Model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "Appointement")

public class Appointement {
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;

	@Column(name = "Hospital")
	private String Hospital;

	@Column(name = "Date")
	private String date;

	@Column(name = "Time")
	private String time;

	@Column(name = "Doctor-Name")
	private String Doctor_name;

	@Column(name = "Speciality")
	private String speciality;

	@Column(name = "Address")
	private String Address;

	@Column(name = "Consultatnt Fee")
	private BigDecimal ConsultatntFee;

	public BigDecimal ConsultatntFee() {
		return ConsultatntFee;
	}

	public void ConsultatntFee(BigDecimal price) {
		this.ConsultatntFee = ConsultatntFee;
	}

	public String getHospital() {
		return Hospital;
	}

	public void setHospital(String hospital) {
		Hospital = hospital;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDoctor_name() {
		return Doctor_name;
	}

	public void setDoctor_name(String doctor_name) {
		Doctor_name = doctor_name;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

}
