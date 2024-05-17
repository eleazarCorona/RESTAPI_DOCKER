package com.desarrolloaplicacionesempresariales.app.services;

import com.desarrolloaplicacionesempresariales.app.entities.Especialidades;
import com.desarrolloaplicacionesempresariales.app.repositories.EspecialidadesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EspecialidadesService {

    @Autowired
    private EspecialidadesRepository especialidadesRepository;

    public List<Especialidades> getEspecialidadByCarrera(Integer id) {
        return especialidadesRepository.findByCarreraId(id);
    }
}
