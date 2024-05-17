package com.desarrolloaplicacionesempresariales.app.services;

import com.desarrolloaplicacionesempresariales.app.entities.Carreras;
import com.desarrolloaplicacionesempresariales.app.repositories.CarrerasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarrerasService {

    @Autowired
    private CarrerasRepository carrerasRepository;

    public List<Carreras> getCarreras() {
        return carrerasRepository.findAll();
    }

    public Carreras crearCarrera(Carreras carrera) {
        return carrerasRepository.save(carrera);
    }

    public Carreras actualizarCarrera(Carreras carrera) {
        return carrerasRepository.save(carrera);
    }

    public Optional<Carreras> getCarreraById(Integer id) {
        return carrerasRepository.findById(id);
    }
}
