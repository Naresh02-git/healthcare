package com.mnk.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mnk.Model.Doctor;
import com.mnk.service.DoctorService;

@RestController
/* @RequestMapping(value = "/patient/{patient}/Doctor") */
@RequestMapping(value="/doctor")
public class DoctorController {

	@Autowired
	DoctorService doctorService;

	@RequestMapping(value = "/{Doctor_Name}/speciality", method = RequestMethod.PUT)
	public ResponseEntity<Doctor> updateDoctor(@PathVariable("speciality") String specialitty,
			@RequestBody Doctor doctor) throws Exception {
		return doctorService.updateDoctor(doctor);
	}

	@GetMapping
	public String test() {
		return "hello";
	}
}
