package com.bratablessza.ujian.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


@Entity
@Table(name ="perusahaan")
	public class Perusahaan {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
		private String nama;
		private String alamat;
		
		//norelasi
	}

