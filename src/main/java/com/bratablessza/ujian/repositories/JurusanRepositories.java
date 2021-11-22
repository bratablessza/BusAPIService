package com.bratablessza.ujian.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bratablessza.ujian.model.Jurusan;

@Repository
public interface JurusanRepositories extends JpaRepository<Jurusan, Long> {

}
