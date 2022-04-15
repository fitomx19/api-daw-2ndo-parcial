package com.ipn.mx.servicios;

import java.util.List;

import com.ipn.mx.modelo.entidades.Estado;

public interface EstadoService {
	public List<Estado> findAll();
	public Estado findById(Long id);
	public Estado save(Estado estado);
	public void delete(Long id);
}
