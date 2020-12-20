package com.mnk.service;


import com.mnk.Model.Patient;

public interface PatientService {
	
	public Patient findById(Integer id);
	
	public Patient findByEmaiIdAndPassword(String email, String Password);

	public Patient saveUser(Patient patient);

	public Patient fetchUserByIdEmailIdAndPassword(String tempEmailId, String tempPass);
}
