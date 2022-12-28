package com.example.ciclo_4.I_Service;
import com.example.ciclo_4.Collection.Usuarios;
import java.util.List;
import java.util.Optional;

public interface I_UsuariosService {

    public List<Usuarios> all();

    public Optional<Usuarios> findById(String id);

    public Usuarios save (Usuarios usuarios);

    public void delete(String id);
}
