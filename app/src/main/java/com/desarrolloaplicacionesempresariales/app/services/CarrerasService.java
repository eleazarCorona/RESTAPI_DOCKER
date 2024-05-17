package com.desarrolloaplicacionesempresariales.app.services;

import com.desarrolloaplicacionesempresariales.app.entities.Carreras;
import com.desarrolloaplicacionesempresariales.app.repositories.CarrerasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarrerasService {

    @Autowired
    private CarrerasRepository carrerasRepository;

    public List<Carreras> getCarreras() {
        return carrerasRepository.findAll();
    }
}
