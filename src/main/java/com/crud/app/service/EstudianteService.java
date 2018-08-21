package com.crud.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.app.entity.Estudiante;
import com.crud.app.repo.EstudianteRepo;

@Service
public class EstudianteService {

	@Autowired
	EstudianteRepo estudianteRepo;
	
	public List<Estudiante> getAll(){
		return estudianteRepo.findAll();
	}

	public void save(Estudiante est) {
		estudianteRepo.save(est);
	}

	public void borrar(Integer id) {
		estudianteRepo.deleteById(id);
	}

	public Estudiante findOne(Integer id) {
		return estudianteRepo.findById(id).get();
	}
}
