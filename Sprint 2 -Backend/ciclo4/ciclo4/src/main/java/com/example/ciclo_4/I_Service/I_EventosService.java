package com.example.ciclo_4.I_Service;
import com.example.ciclo_4.Collection.Eventos;
import java.util.List;
import java.util.Optional;

public interface I_EventosService {

    public List<Eventos> all();

    public Optional<Eventos> findById(String Id);

    public Eventos save (Eventos eventos);

    public void delete(String Id);
}
