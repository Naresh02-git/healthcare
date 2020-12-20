package com.mnk.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mnk.Model.Patient;

@Repository("PatientRepo")
public interface PatientRepo extends  CrudRepository<Patient,Integer> {

	Patient findByEmailIdAndPassword(String tempemail, String tempPassword);

}