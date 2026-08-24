package com.mx.Alumnos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.Alumnos.entidad.Alumno;
import java.util.List;


public interface AlumnoDao extends JpaRepository<Alumno, Long> {
    List<Alumno> findByNumeroCarrera(int numeroCarrera);
}
