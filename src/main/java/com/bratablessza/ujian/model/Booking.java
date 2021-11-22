package com.bratablessza.ujian.model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


@Entity
@Table(name ="booking")
	public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_keberangkatan", referencedColumnName = "id")
//	@JsonIgnore
	private Keberangkatan id_keberangkatan;

	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(unique = true, name = "nik", referencedColumnName = "nik")
//	@JsonIgnore
	private Penumpang nik;
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "nik", referencedColumnName = "nik")
//	@JsonIgnore
//	private Penumpang nik;
		
	
	private String tanggal;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_jurusan", referencedColumnName = "id")
	private Jurusan id_jurusan;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "nomor_polisi", referencedColumnName = "nomor_polisi")
	private Bus no_polisi;
	
	}
