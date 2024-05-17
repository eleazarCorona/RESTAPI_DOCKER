package com.desarrolloaplicacionesempresariales.app.repositories;

import com.desarrolloaplicacionesempresariales.app.entities.Carreras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrerasRepository extends JpaRepository<Carreras, Integer> {
}
