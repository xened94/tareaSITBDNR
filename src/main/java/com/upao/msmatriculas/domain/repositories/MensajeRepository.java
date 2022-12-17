package com.upao.msmatriculas.domain.repositories;

import com.upao.msmatriculas.domain.entities.Mensaje;

import java.util.List;

public interface MensajeRepository {
    boolean Registrar(Mensaje mensaje);
    List<Mensaje> ListarTodos();

    boolean Actualizar(Mensaje mensaje);
    boolean Eliminar(Mensaje mensaje);
    List<Mensaje> Buscar();
}
