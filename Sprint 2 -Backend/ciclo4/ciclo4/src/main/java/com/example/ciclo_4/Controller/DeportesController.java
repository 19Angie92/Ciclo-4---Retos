package com.example.ciclo_4.Controller;
import com.example.ciclo_4.Collection.Deportes;
import com.example.ciclo_4.Service.DeportesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins =  "*")
@RestController
@RequestMapping("api/deportes")
public class DeportesController {

    @Autowired
    private DeportesService deportesService;

    @GetMapping
    public List<Deportes> all(){
        return deportesService.all();
    }

    @GetMapping("/{id}")
    public Optional<Deportes> show(@PathVariable String id) {
        return deportesService.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Deportes save(@RequestBody Deportes deportes){
        return deportesService.save(deportes);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Deportes update(@PathVariable String id, @RequestBody Deportes deportes) {
        Optional<Deportes> op = deportesService.findById(id);

        if (!op.isEmpty()) {
            Deportes deportesUpdate = op.get();
            deportesUpdate.setTipo_Deporte(deportes.getTipo_Deporte());
            deportesUpdate.setNombreEquipo(deportes.getNombreEquipo());

            return deportesService.save(deportesUpdate);
        }

        return deportes;
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        deportesService.delete(id);}
    }

