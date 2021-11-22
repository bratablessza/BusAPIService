package com.bratablessza.ujian.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bratablessza.ujian.model.Booking;

@Repository
public interface BookingRepositories extends JpaRepository<Booking, Long>{
	List<Booking> findByNik(String nik);

	
}
