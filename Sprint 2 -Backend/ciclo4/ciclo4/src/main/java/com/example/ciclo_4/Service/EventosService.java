package com.example.ciclo_4.Service;
import com.example.ciclo_4.Collection.Eventos;
import com.example.ciclo_4.I_Repository.I_EventosRepository;
import com.example.ciclo_4.I_Service.I_EventosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventosService implements I_EventosService {

    @Autowired
    private I_EventosRepository repository;


    @Override
    public List<Eventos> all() {
        return repository.findAll();
    }

    @Override
    public Optional<Eventos> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Eventos save(Eventos eventos) {
        return repository.save(eventos);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);

    }
}
