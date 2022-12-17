package com.upao.msmatriculas.application.controllers;

import com.upao.msmatriculas.domain.entities.Mensaje;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/mensajes")
public interface MensajeController {

    @GetMapping(produces = "application/json")
    List<Mensaje> ListarTodos();

    @PostMapping(produces = "application/json", consumes = "application/json")
    boolean Registrar(@RequestBody Mensaje mensaje);
    @DeleteMapping(produces = "application/json", consumes = "application/json")
    boolean Eliminar(@RequestBody Mensaje mensaje);
    @PutMapping(produces = "application/jhon", consumes = "application/json")
    boolean Actualizar(@RequestBody Mensaje mensaje);
    @GetMapping(produces = "application/json")
    List<Mensaje> Buscar(@RequestBody Mensaje mensaje);
}
