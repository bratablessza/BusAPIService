package com.bratablessza.ujian.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bratablessza.ujian.model.Perusahaan;

@Repository
public interface PerusahaanRepositories extends JpaRepository<Perusahaan, String>{

}
