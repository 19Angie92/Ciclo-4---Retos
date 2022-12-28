package com.example.ciclo_4.I_Repository;
import com.example.ciclo_4.Collection.Usuarios;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface I_UsuariosRepository extends MongoRepository<Usuarios, String> {
}
