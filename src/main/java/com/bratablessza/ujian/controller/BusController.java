package com.bratablessza.ujian.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bratablessza.ujian.model.Booking;
import com.bratablessza.ujian.model.IdAndNamaAndKelasAndHargaAndTanggalAndDeskripsiAndTerminalAwalAndTerminalAkhir;
import com.bratablessza.ujian.model.Penumpang;

import com.bratablessza.ujian.repositories.BookingRepositories;
import com.bratablessza.ujian.repositories.BusRepositories;
import com.bratablessza.ujian.repositories.JurusanRepositories;
import com.bratablessza.ujian.repositories.Keberangkatanrepositories;
import com.bratablessza.ujian.repositories.PenumpangRepositories;
import com.bratablessza.ujian.repositories.PerusahaanRepositories;

@RestController
@RequestMapping(value = "busbookingsystem")
public class BusController {
	
	@Autowired
	PenumpangRepositories penumpangRepo;
	
	@Autowired
	PerusahaanRepositories perusahaanRepo;
	
	@Autowired
	Keberangkatanrepositories keberangkatanRepo;
	
	@Autowired
	JurusanRepositories jurusanRepo;
	
	@Autowired
	BusRepositories busRepo;
	
	@Autowired
	BookingRepositories bookingRepo;
	
	@GetMapping(value ="penumpang")
	public List<Penumpang> TampilPenumpang(){
		return penumpangRepo.findAll();
	}
	

	
//	done
	@GetMapping(value = "getPenumpang/{niknya}")
	public String CariData(@PathVariable(value="niknya") String nik) {
		List<Penumpang> hasil =penumpangRepo.findByNik(nik);
		String out ="";
		if(hasil.isEmpty() == true) {
			 out = "Penumpang belum terdaftar,silakan buat akun.";
		} else {
			out = "Penumpang telah terdaftar";
		}
		return out;
	}
	
	
	@GetMapping(value = "findKeberangkatan")
	public List<IdAndNamaAndKelasAndHargaAndTanggalAndDeskripsiAndTerminalAwalAndTerminalAkhir> FindDataKeberangkatan(@RequestParam(value = "terminal") String terminal, @RequestParam(value = "tanggal") String tanggal){
		return keberangkatanRepo.findHasilKeberangkatan(terminal, tanggal);
		}
	
	@PostMapping(value ="booking")
	public String PostDataBooking(@RequestBody Booking buking) {
		bookingRepo.save(buking);
		return "Pemesanan bus berhasil";
	}
	
	@PostMapping(value="insertPenumpang")
	public String PostData(@RequestBody Penumpang penumpang) {
		penumpangRepo.save(penumpang);
		return "Data penumpang berhasil ditambahkan";
	}
	
	@DeleteMapping(value = "cancel")
	public String cancelBooking(@RequestParam(value = "id") long id) {
		bookingRepo.deleteById(id);
		return "Pemesanan dengan nomor id "+id+" telah dibatalkan";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
