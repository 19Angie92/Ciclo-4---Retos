package com.example.ciclo_4.I_Service;
import com.example.ciclo_4.Collection.Deportes;
import java.util.List;
import java.util.Optional;

public interface I_DeportesService {

    public List<Deportes> all();

    public Optional<Deportes> findById(String Id);

    public Deportes save (Deportes deportes);

    public void delete(String Id);
}
