package com.example.ciclo_4.I_Repository;
import com.example.ciclo_4.Collection.Eventos;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface I_EventosRepository extends MongoRepository<Eventos, String> {
}
