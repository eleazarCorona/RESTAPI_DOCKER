package com.desarrolloaplicacionesempresariales.app.repositories;

import com.desarrolloaplicacionesempresariales.app.entities.MateriasPorCarrera;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MateriasCarreraRepository extends JpaRepository<MateriasPorCarrera, Integer> {
    @Query("SELECT mc FROM MateriasPorCarrera mc WHERE mc.id_carrera = :id_carrera")
    List<MateriasPorCarrera> findByCarreraId(@Param("id_carrera") Integer id_carrera);

}
