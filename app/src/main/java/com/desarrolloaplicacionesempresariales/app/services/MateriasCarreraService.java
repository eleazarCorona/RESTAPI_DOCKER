package com.desarrolloaplicacionesempresariales.app.services;

import com.desarrolloaplicacionesempresariales.app.entities.MateriasPorCarrera;
import com.desarrolloaplicacionesempresariales.app.repositories.MateriasCarreraRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MateriasCarreraService {

    @Autowired
    private MateriasCarreraRepository materiasCarreraRepository;

    public List<MateriasPorCarrera> getMateriasByCarrera(Integer id) {
        return materiasCarreraRepository.findByCarreraId(id);
    }
}
