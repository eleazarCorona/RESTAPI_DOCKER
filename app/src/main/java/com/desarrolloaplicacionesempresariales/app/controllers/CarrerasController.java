package com.desarrolloaplicacionesempresariales.app.controllers;

import com.desarrolloaplicacionesempresariales.app.entities.Carreras;
import com.desarrolloaplicacionesempresariales.app.entities.MateriasPorCarrera;
import com.desarrolloaplicacionesempresariales.app.services.CarrerasService;
import com.desarrolloaplicacionesempresariales.app.services.MateriasCarreraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/carreras")
public class CarrerasController {

    @Autowired
    private CarrerasService carrerasService;
    @Autowired
    private MateriasCarreraService materiasCarreraService;

    @GetMapping("obtener")
    public List<Carreras> getCarreras() {
        return carrerasService.getCarreras();
    }
    @GetMapping("obtenerMateriasCarrera/{id}")
    public List<MateriasPorCarrera> getMateriasByCarrera(@PathVariable Integer id) {
        return materiasCarreraService.getMateriasByCarrera(id);
    }
}
