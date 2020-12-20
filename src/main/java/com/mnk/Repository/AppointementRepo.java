package com.mnk.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mnk.Model.Appointement;

@Repository("AppointementRepo")
public interface AppointementRepo extends JpaRepository<Appointement,Long> {

}
