package com.ipn.mx.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.ipn.mx.modelo.dao.MunicipioDAO;
import com.ipn.mx.modelo.entidades.Estado;
import com.ipn.mx.modelo.entidades.Municipio;

public class MunicipioServiceImpl implements MunicipioService{
	@Autowired
	MunicipioDAO daoMunicipio;
	
	public MunicipioServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Municipio> findAll() {
		return (List<Municipio>) daoMunicipio.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Municipio findById(Long id) {
		return daoMunicipio.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Municipio save(Municipio municipio) {
		return daoMunicipio.save(municipio);
	}

	@Override
	@Transactional
	public void delete(Long id) {	
		daoMunicipio.deleteById(id);
	}

	@Override
	public List<Estado> findAllEstados() {
		return null;// (List<Estado>) daoMunicipio.findAll();
	}

}
