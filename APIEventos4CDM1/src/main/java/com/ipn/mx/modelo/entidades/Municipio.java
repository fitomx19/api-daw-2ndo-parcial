package com.ipn.mx.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@Entity
@Table (name = "Municipio")
public class Municipio implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "idMunicipio")
	private Long idMunicipio;
	
	@NotEmpty(message = "El nombre del Municipio es Obligatorio")
	@Size (min = 4, max = 50,message = "El valor debe de estar entre 4 y 50")
	@Column (name = "nombreEstado",nullable = false ,length = 50)
	private String nombreMunicipio;
	
	@NotNull(message = "El estado es obligatorio")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idEstado")
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	private Estado idEstado;
	
	
	
	

}
