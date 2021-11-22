package com.bratablessza.ujian.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bratablessza.ujian.model.Penumpang;

@Repository
public interface PenumpangRepositories extends JpaRepository<Penumpang, String> {
List<Penumpang> findByNik(String nik);

}
