package com.ipn.mx.servicios;

import java.util.List;

import com.ipn.mx.modelo.entidades.Estado;
import com.ipn.mx.modelo.entidades.Municipio;



public interface MunicipioService {
	public List<Municipio> findAll();
	public Municipio findById(Long id);
	public Municipio save(Municipio municipio);
	public void delete(Long id);
	
	public List<Estado> findAllEstados();
}
