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

    @PostMapping("crear")
    public Carreras crearCarrera(@RequestBody Carreras carrera) {
        return carrerasService.crearCarrera(carrera);
    }


    @PutMapping("actualizar/{id}")
    public Carreras actualizarCarrera(@PathVariable Integer id, @RequestBody Carreras carrera) {
        Optional<Carreras> carreraExistente = carrerasService.getCarreraById(id);
        if (carreraExistente.isPresent()) {
            Carreras carreraActualizada = carreraExistente.get();
            carreraActualizada.setNombre(carrera.getNombre()); 
            return carrerasService.actualizarCarrera(carreraActualizada);
        } else {
            throw new RuntimeException("Carrera no encontrada con ID: " + id);
        }
}

}
