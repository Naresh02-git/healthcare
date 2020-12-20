package com.mnk.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mnk.Model.Patient;
import com.mnk.Repository.PatientRepo;

@Service
public abstract class PatientServiceImp implements PatientService {

	@Autowired
	private PatientRepo patientrepo;

	public Patient savepatient(Patient patient) {
		return patientrepo.save(patient);
	}

	public Patient fetchPatientById(Integer Id) {
		Optional<Patient> patientEntity = patientrepo.findById(Id);
		if (patientEntity.isPresent()) {
			return patientEntity.get();
		}

		return null;
	}

	public Patient fetchUserByIdEmailIdAndPassword(String tempemail, String tempPassword) {
		return patientrepo.findByEmailIdAndPassword(tempemail, tempPassword);
	}

}
