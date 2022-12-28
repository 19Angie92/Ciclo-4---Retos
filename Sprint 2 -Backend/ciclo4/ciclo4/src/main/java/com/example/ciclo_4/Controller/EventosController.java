package com.example.ciclo_4.Controller;
import com.example.ciclo_4.Collection.Eventos;
import com.example.ciclo_4.Service.EventosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins =  "*")
@RestController
@RequestMapping("api/eventos")
public class EventosController {

    @Autowired
    private EventosService eventosService;

    @GetMapping
    public List<Eventos> all(){
        return eventosService.all();
    }

    @GetMapping("/{id}")
    public Optional<Eventos> show(@PathVariable String id) {return eventosService.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Eventos save(@RequestBody Eventos eventos){
        return eventosService.save(eventos);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Eventos update(@PathVariable String id, @RequestBody Eventos eventos) {
        Optional<Eventos> op = eventosService.findById(id);

        if (!op.isEmpty()) {
            Eventos eventosUpdate = op.get();
            eventosUpdate.setEquipo1(eventos.getEquipo1());
            eventosUpdate.setEquipo2(eventos.getEquipo2());
            eventosUpdate.setMarcador1(eventos.getMarcador1());
            eventosUpdate.setMarcador2(eventos.getMarcador2());
            eventosUpdate.setFechaEvento(eventos.getFechaEvento());
            return eventosService.save(eventosUpdate);
        }

        return eventos;
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        eventosService.delete(id);}
    }

