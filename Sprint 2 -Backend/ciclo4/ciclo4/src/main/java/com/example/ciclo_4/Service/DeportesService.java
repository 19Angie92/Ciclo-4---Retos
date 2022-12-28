package com.example.ciclo_4.Service;
import com.example.ciclo_4.Collection.Deportes;
import com.example.ciclo_4.I_Repository.I_DeportesRepository;
import com.example.ciclo_4.I_Service.I_DeportesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeportesService implements I_DeportesService {

    @Autowired
    private I_DeportesRepository repository;

    @Override
    public List<Deportes> all() {
        return repository.findAll();
    }

    @Override
    public Optional<Deportes> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Deportes save(Deportes deportes) {
        return repository.save(deportes);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);

    }
}
