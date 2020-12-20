package com.mnk.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mnk.Model.Patient;
import com.mnk.service.PatientService;

@RestController
@RequestMapping(value = "/patient")
public class PatientController {

	@Autowired
	private PatientService patientService;
	
	@GetMapping("/patientRegistartion")
	public Patient patientRegister(@RequestBody Patient patient) throws Exception {
		
		Integer tempID=patient.getId();
		if(tempID != null)
		{
			Patient patientObject =patientService.findById(tempID);
			if(patientObject != null) {
				throw new Exception ("user with "+tempID+" is already exist");
			}
		}
		
		Patient patientObject =null;
		
		patientObject= patientService.saveUser(patient);
		 return patientObject;
	}
		
	
	@PostMapping("/login")
	public Patient loginUser(@RequestBody Patient patient) {
		String tempEmailId =patient.getEmailId();
		String tempPass=patient.getPassword();
		Patient patientObject=null;
		if(tempEmailId != null && tempPass !=null) {
			
			patientService.fetchUserByIdEmailIdAndPassword(tempEmailId, tempPass);
			
		}
		return patientObject;
	}
}


