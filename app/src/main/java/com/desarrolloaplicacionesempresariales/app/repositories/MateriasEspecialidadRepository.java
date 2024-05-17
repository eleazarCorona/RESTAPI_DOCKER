package com.desarrolloaplicacionesempresariales.app.repositories;

import com.desarrolloaplicacionesempresariales.app.entities.MateriasPorEspecialidad;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriasEspecialidadRepository extends JpaRepository<MateriasPorEspecialidad, Integer> {
    @Query("SELECT mc FROM MateriasPorEspecialidad mc WHERE mc.id_especialidad = :id_especialidad")
    List<MateriasPorEspecialidad> findByEspecialidadId(@Param("id_especialidad") Integer id_especialidad);
}
