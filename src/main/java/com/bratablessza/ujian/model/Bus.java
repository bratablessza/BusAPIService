package com.bratablessza.ujian.model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


@Entity
@Table(name ="bus")
	public class Bus {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private String nomor_polisi;
	private int kapasitas;
	private String nama_supir;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "nama_perusahaan", referencedColumnName = "nama")
	private Perusahaan nama_perusahaan;
	
	
	
//	@OneToOne(mappedBy = "idjk")
//	@JsonIgnore
//	private PesertaEntity peserta;
//
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "idperserta", referencedColumnName = "id")
//	private PesertaEntity id;
//	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "idbatch", referencedColumnName = "idbatch")
//	private BatchEntity idbatch;
	
		
	}
