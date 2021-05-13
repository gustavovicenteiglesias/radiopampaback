package com.radiopampa.app.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="programacion")
public class Programacion {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_programacion;
	
	private String nombre;
	
	private Integer  min_inicio;
	
	private Integer min_fin;
	
	private String imagen;
	
	@OneToOne(mappedBy="programacion")
	@JsonManagedReference("programacion-dias")
	private Dias dias;

	public Programacion() {
		super();
	}
	@JsonIgnore
	public Integer getId_programacion() {
		return id_programacion;
	}

	public void setId_programacion(Integer id_programacion) {
		this.id_programacion = id_programacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getMin_inicio() {
		return min_inicio;
	}

	public void setMin_inicio(Integer min_inicio) {
		this.min_inicio = min_inicio;
	}

	public Integer getMin_fin() {
		return min_fin;
	}

	public void setMin_fin(Integer min_fin) {
		this.min_fin = min_fin;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Dias getDias() {
		return dias;
	}

	public void setDias(Dias dias) {
		this.dias = dias;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
