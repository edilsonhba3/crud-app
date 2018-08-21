package com.crud.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.app.entity.Estudiante;

public interface EstudianteRepo extends JpaRepository<Estudiante, Integer> {

}
