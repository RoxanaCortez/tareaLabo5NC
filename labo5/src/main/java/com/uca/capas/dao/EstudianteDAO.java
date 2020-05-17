package com.uca.capas.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.domain.Estudiante;

public interface EstudianteDAO {
	public List<Estudiante>findAll() throws DataAccessException;
	
	void insertar(Estudiante e) throws DataAccessException;
	
}