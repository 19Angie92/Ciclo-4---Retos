package com.example.ciclo_4.Collection;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document("Eventos")
public class Eventos {

    @Id
    private String Id;

    @Field
    private String equipo1;

    @Field
    private String equipo2;

    @Field
    private Integer marcador1;

    @Field
    private Integer marcador2;

    @Field
    private Date fechaEvento;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public Integer getMarcador1() {
        return marcador1;
    }

    public void setMarcador1(Integer marcador1) {
        this.marcador1 = marcador1;
    }

    public Integer getMarcador2() {
        return marcador2;
    }

    public void setMarcador2(Integer marcador2) {
        this.marcador2 = marcador2;
    }

    public Date getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(Date fechaEvento) {
        this.fechaEvento = fechaEvento;
    }
}
