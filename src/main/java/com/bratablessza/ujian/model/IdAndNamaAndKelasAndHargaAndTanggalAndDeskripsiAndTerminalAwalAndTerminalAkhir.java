package com.bratablessza.ujian.model;

public interface IdAndNamaAndKelasAndHargaAndTanggalAndDeskripsiAndTerminalAwalAndTerminalAkhir {
public long getId();
public String getPerusahaan();
public String getKelas();
public int getHarga();
public String getWaktu();
public String getDeskripsi();
//public String getId();

//"SELECT (keberangkatan.id),
//(perusahaan.nama),
//(keberangkatan.kelas),
//(keberangkatan.harga),
//(keberangkatan.tanggal),
//(jurusan.deskripsi) 
//FROM keberangkatan,jurusan,perusahaan WHERE 
//(jurusan.terminal_awal LIKE'%?1%' OR 
//jurusan.terminal_akhir LIKE'%?1%') 


}
