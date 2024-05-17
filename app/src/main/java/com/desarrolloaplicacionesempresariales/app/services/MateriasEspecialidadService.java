package com.desarrolloaplicacionesempresariales.app.services;

import com.desarrolloaplicacionesempresariales.app.entities.MateriasPorEspecialidad;
import com.desarrolloaplicacionesempresariales.app.repositories.MateriasEspecialidadRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MateriasEspecialidadService {

    @Autowired
    private MateriasEspecialidadRepository materiasEspecialidadRepository;

    public List<MateriasPorEspecialidad> getMateriaByEspecialidad(Integer id) {
        return materiasEspecialidadRepository.findByEspecialidadId(id);
    }
}
