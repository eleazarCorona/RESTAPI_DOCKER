package com.desarrolloaplicacionesempresariales.app.repositories;

import com.desarrolloaplicacionesempresariales.app.entities.Especialidades;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecialidadesRepository extends JpaRepository<Especialidades, Integer> {
    @Query("SELECT mc FROM Especialidades mc WHERE mc.id_carrera = :id_carrera")
    List<Especialidades> findByCarreraId(@Param("id_carrera") Integer id_carrera);
}
