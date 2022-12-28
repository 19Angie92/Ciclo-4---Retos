package com.example.ciclo_4.Controller;
import com.example.ciclo_4.Collection.Usuarios;
import com.example.ciclo_4.Service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins =  "*")
@RestController
@RequestMapping("api/usuarios")
public class UsuariosController {

    @Autowired
    private UsuariosService usuariosService;

    @GetMapping
    public List<Usuarios> all(){
        return usuariosService.all();
    }

    @GetMapping("/{id}")
    public Optional<Usuarios> show(@PathVariable String id) {
        return usuariosService.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Usuarios save(@RequestBody Usuarios usuarios){
        return usuariosService.save(usuarios);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Usuarios update(@PathVariable String id, @RequestBody Usuarios usuarios) {
        Optional<Usuarios> op = usuariosService.findById(id);

        if (!op.isEmpty()) {
            Usuarios usuariosUpdate = op.get();
            usuariosUpdate.setTipoDocumento(usuarios.getTipoDocumento());
            usuariosUpdate.setDocumento(usuarios.getDocumento());
            usuariosUpdate.setNombreCompleto(usuarios.getNombreCompleto());
            usuariosUpdate.setCorreo(usuarios.getCorreo());
            usuariosUpdate.setCelular(usuarios.getCelular());
            usuariosUpdate.setUsuario(usuarios.getUsuario());
            usuariosUpdate.setContraseña(usuarios.getContraseña());
            return usuariosService.save(usuariosUpdate);
        }

        return usuarios;
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {usuariosService.delete(id);}
    }

