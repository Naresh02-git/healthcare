package com.mnk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.mnk.Exceptions.HospitalNotFoundException;
import com.mnk.Model.Doctor;
import com.mnk.Repository.DoctorRepo;

public abstract class DoctorServiceImp implements DoctorService {

	@Autowired
	private DoctorRepo doctorrepo;

	@Override
	public ResponseEntity<Doctor> updateDoctor(Doctor doctor) {

		if (doctor != null) {

			Doctor doctorEntity = findByspeciality(doctor.getSpeciality());
			if (doctorEntity == null) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}

			doctorEntity.setDoctor_name(doctor.getDoctor_name());
			doctorEntity.setSpeciality(doctor.getSpeciality());
			doctorEntity.setHospital(doctor.getHospital());
			doctorEntity.setAddress(doctor.getAddress());

			if (doctor.getEmail() != null)
				doctorEntity.setEmail(doctor.getEmail());

			doctorrepo.save(doctorEntity);
			return new ResponseEntity<Doctor>(doctor, HttpStatus.OK);
		}

		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}

	public Doctor FindByDoctor(Doctor doctor) throws HospitalNotFoundException, HospitalFoundException {

		if (doctor != null) {

			Doctor DocRes = findByHospital(doctor.getHospital());
			if (DocRes == null) {
				throw new HospitalNotFoundException("");
			}

			DocRes.setDoctor_name(doctor.getDoctor_name());
			DocRes.setSpeciality(doctor.getSpeciality());
			DocRes.setAddress(doctor.getAddress());
			if (doctor.getHospital() != null) {

				DocRes.setHospital(doctor.getHospital());
				doctorrepo.save(DocRes);
				return DocRes;
			}

			throw new HospitalFoundException();

		}
		return doctor;

	}
}