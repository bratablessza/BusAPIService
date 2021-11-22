package com.bratablessza.ujian.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name ="penumpang")
	public class Penumpang {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private String nik;
	
	private String nama;
	private String telepon;
	
	//norelasi
	
	@OneToOne(mappedBy = "nik")
	@JsonIgnore
	private Booking booking;
	}
