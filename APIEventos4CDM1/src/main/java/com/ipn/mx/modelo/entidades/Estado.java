package com.ipn.mx.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Estado")
public class Estado implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "idEstado",nullable = false)
	private Long idEstado;
	
	@NotEmpty(message = "El nombre del Estado es Obligatorio")
	@Size (min = 4, max = 50,message = "El valor debe de estar entre 4 y 50")
	@Column (name = "nombreEstado",nullable = false)
	private String nombreEstado;
	
	
	
}
