package com.desarrolloaplicacionesempresariales.app.controllers;

import com.desarrolloaplicacionesempresariales.app.entities.Especialidades;
import com.desarrolloaplicacionesempresariales.app.entities.MateriasPorEspecialidad;
import com.desarrolloaplicacionesempresariales.app.services.EspecialidadesService;
import com.desarrolloaplicacionesempresariales.app.services.MateriasEspecialidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/especialidades")
public class EspecialidadesController {

    @Autowired
    private EspecialidadesService especialidadesService;

    @Autowired
    private MateriasEspecialidadService materiasEspecialidadService;

    @GetMapping("obtenerEspecialidadesCarrera/{id}")
    public List<Especialidades> getEspecialidadesCarrera(@PathVariable Integer id) {
        return especialidadesService.getEspecialidadByCarrera(id);
    }

    @GetMapping("obtenerMateriasEspecialidad/{id}")
    public List<MateriasPorEspecialidad> getMateriasEspecialidad(@PathVariable Integer id) {
        return materiasEspecialidadService.getMateriaByEspecialidad(id);
    }
}
