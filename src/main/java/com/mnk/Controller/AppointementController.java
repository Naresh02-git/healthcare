package com.mnk.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mnk.Methods.UtilityMethods;
import com.mnk.Model.Appointement;
import com.mnk.service.AppointService;
import com.mnk.service.DoctorService;
import com.mnk.service.PatientService;

@RestController
@RequestMapping(value = "/Appointement")
public class AppointementController {

	@Autowired
	AppointService appointService;

	PatientService paientService;

	DoctorService doctorService;

	private Object Appointement;

	private String hospital;

	private Object date;

	@RequestMapping(value = "/Appointements/patient/doctor", method = RequestMethod.PUT)
	public ResponseEntity<Appointement> getByAppointement(@PathVariable("patient") String patient_name,
			@PathVariable("Doctor") String doctor_name, @PathVariable("Doctor") String speciality) throws Exception {
		Appointement app = new Appointement();
		app.setAssignedPatient(patient_name);
		app.setAssignedDoctor(doctor_name);
		app.setSpeciality(speciality);
		app.setAppointementdate(date);

		ResponseEntity<Appointement> responseEntity = null;
		if (Appointement == null) {
			responseEntity = new ResponseEntity<Appointement>(
					UtilityMethods.getMessageBase(HttpStatus.NOT_FOUND, "Record not found"), HttpStatus.NOT_FOUND);

		} else {
			app.setDoctor_name(doctor_name);
			app.setSpeciality(speciality);
			app.setHospital(hospital);
			responseEntity = new ResponseEntity<Appointement>(app, HttpStatus.OK);
		}

		return responseEntity;
	}

	/*
	 * public Appointement findAppointmentByaDate(Appointement appointement) {
	 * 
	 * return appointement;
	 * 
	 * }
	 */

}
