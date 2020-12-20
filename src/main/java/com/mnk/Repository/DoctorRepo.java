package com.mnk.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mnk.Model.Doctor;

@Repository("DoctorRepo")
public interface DoctorRepo extends JpaRepository<Doctor,Long> {

	
	 public Doctor findByspeciality(String spcciality);
	 public Doctor findByHospital(String Hospital);
	 public Doctor findByName(String Name);
}
