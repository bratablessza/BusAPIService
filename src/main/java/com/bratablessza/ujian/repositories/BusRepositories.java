package com.bratablessza.ujian.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bratablessza.ujian.model.Bus;

@Repository
public interface BusRepositories extends JpaRepository<Bus, String>{

}
