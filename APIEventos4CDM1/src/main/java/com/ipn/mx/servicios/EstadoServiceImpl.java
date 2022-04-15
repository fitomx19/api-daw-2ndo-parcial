package com.ipn.mx.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ipn.mx.modelo.dao.EstadoDAO;
import com.ipn.mx.modelo.entidades.Estado;

@Service
public class EstadoServiceImpl implements EstadoService {
	@Autowired
	EstadoDAO dao;
	
	public EstadoServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Estado> findAll() {
		return (List<Estado>) dao.findAll();
	}

	@Override
	@Transactional (readOnly = true)
	public Estado findById(Long id) {
		return dao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Estado save(Estado estado) {
		return dao.save(estado);
	}

	@Override
	public void delete(Long id) {
		dao.deleteById(id);
	}
}
