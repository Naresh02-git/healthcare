package com.mnk.service;

import org.springframework.http.ResponseEntity;

import com.mnk.Model.Doctor;

public interface DoctorService {

	public Doctor findByspeciality(String speciality);

	public Doctor findByHospital(String Hospital);

	ResponseEntity<Doctor> updateDoctor(Doctor doctor);

}
