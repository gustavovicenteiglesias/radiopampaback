package com.radiopampa.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="dias")
public class Dias {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_dias;
	private Integer dia0;
	private Integer dia1;
	private Integer dia2;
	private Integer dia3;
	private Integer dia4;
	private Integer dia5;
	private Integer dia6;
	
	@OneToOne
	@JoinColumn(name = "id_programacion")
	@JsonBackReference("programacion-dias")
	private Programacion programacion;

	public Dias() {
		super();
	}
	@JsonIgnore
	public Integer getId_dias() {
		return id_dias;
	}

	public void setId_dias(Integer id_dias) {
		this.id_dias = id_dias;
	}

	public Integer getDia0() {
		return dia0;
	}

	public void setDia0(Integer dia0) {
		this.dia0 = dia0;
	}

	public Integer getDia1() {
		return dia1;
	}

	public void setDia1(Integer dia1) {
		this.dia1 = dia1;
	}

	public Integer getDia2() {
		return dia2;
	}

	public void setDia2(Integer dia2) {
		this.dia2 = dia2;
	}

	public Integer getDia3() {
		return dia3;
	}

	public void setDia3(Integer dia3) {
		this.dia3 = dia3;
	}

	public Integer getDia4() {
		return dia4;
	}

	public void setDia4(Integer dia4) {
		this.dia4 = dia4;
	}

	public Integer getDia5() {
		return dia5;
	}

	public void setDia5(Integer dia5) {
		this.dia5 = dia5;
	}

	public Integer getDia6() {
		return dia6;
	}

	public void setDia6(Integer dia6) {
		this.dia6 = dia6;
	}

	public Programacion getProgramacion() {
		return programacion;
	}

	public void setProgramacion(Programacion programacion) {
		this.programacion = programacion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
