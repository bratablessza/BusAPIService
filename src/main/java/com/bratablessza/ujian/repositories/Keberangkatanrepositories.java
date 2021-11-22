package com.bratablessza.ujian.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



import com.bratablessza.ujian.model.IdAndNamaAndKelasAndHargaAndTanggalAndDeskripsiAndTerminalAwalAndTerminalAkhir;
import com.bratablessza.ujian.model.Keberangkatan;


@Repository
public interface Keberangkatanrepositories extends JpaRepository<Keberangkatan, Long>{
@Query(value = " SELECT (keberangkatan.id),(bus.nama_perusahaan) AS perusahaan,(keberangkatan.kelas),\r\n"
		+ "(keberangkatan.harga),(keberangkatan.tanggal)AS waktu,(jurusan.deskripsi) FROM jurusan \r\n"
		+ "INNER JOIN keberangkatan on jurusan.id = keberangkatan.id_jurusan \r\n"
		+ "INNER JOIN bus ON keberangkatan.no_polisi = bus.nomor_polisi \r\n"
		+ "WHERE (jurusan.terminal_awal LIKE %?1% OR jurusan.terminal_akhir LIKE %?1%) AND keberangkatan.tanggal LIKE %?2% "
		+ "AND bus.kapasitas>(SELECT COUNT(no_polisi) FROM booking where booking.id_keberangkatan = keberangkatan.id ) ",nativeQuery = true)
List<IdAndNamaAndKelasAndHargaAndTanggalAndDeskripsiAndTerminalAwalAndTerminalAkhir> findHasilKeberangkatan(String terminal, String tanggal);



}
