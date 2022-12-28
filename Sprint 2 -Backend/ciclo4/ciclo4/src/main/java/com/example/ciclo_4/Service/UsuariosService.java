package com.example.ciclo_4.Service;

import com.example.ciclo_4.Collection.Usuarios;
import com.example.ciclo_4.I_Repository.I_UsuariosRepository;
import com.example.ciclo_4.I_Service.I_UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuariosService implements I_UsuariosService {

    @Autowired
    private I_UsuariosRepository repository;


    @Override
    public List<Usuarios> all() {
        return repository.findAll();
    }

    @Override
    public Optional<Usuarios> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Usuarios save(Usuarios usuarios) {
        return repository.save(usuarios);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);

    }
}
