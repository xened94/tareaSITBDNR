package com.upao.msmatriculas.domain.services;

import com.upao.msmatriculas.domain.entities.Mensaje;

import java.util.List;
import java.util.Optional;

public interface MensajeService {
    boolean Registrar(Mensaje mensaje);
    List<Mensaje> ListarTodos();
    boolean Actualizar(Mensaje mensaje);
    boolean Eliminar(Mensaje mensaje);

    List<Mensaje> Buscar();
}
