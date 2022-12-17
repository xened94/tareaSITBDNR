package com.upao.msmatriculas.domain.services.impl;

import com.upao.msmatriculas.domain.entities.Mensaje;
import com.upao.msmatriculas.domain.services.MensajeService;
import com.upao.msmatriculas.infraestructure.repositories.implnosql.MensajeNosqlRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MensajeServiceImpl implements MensajeService {

    @Autowired
    MensajeNosqlRepositoryImpl mensajeNosqlRepository;

    @Override
    public boolean Registrar(Mensaje mensaje) {
        return mensajeNosqlRepository.Registrar(mensaje);
    }

    @Override
    public List<Mensaje> ListarTodos() {
        return mensajeNosqlRepository.ListarTodos();
    }
    @Override
    public boolean Actualizar(Mensaje mensaje ) {
        return mensajeNosqlRepository.Actualizar(mensaje);
    }

    @Override
    public boolean Eliminar(Mensaje mensaje)  {
        return mensajeNosqlRepository.Eliminar(mensaje);
    }
    @Override
    public List<Mensaje> Buscar(){
        return mensajeNosqlRepository.Buscar();
    }
}
