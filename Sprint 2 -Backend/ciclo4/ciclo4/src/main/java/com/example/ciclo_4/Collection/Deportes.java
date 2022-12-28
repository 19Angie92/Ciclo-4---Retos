package com.example.ciclo_4.Collection;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("Deportes")
public class Deportes{

    @Id
    private String Id;

    @Field
    private String tipo_Deporte;

    @Field
    private String nombreEquipo;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getTipo_Deporte() {
        return tipo_Deporte;
    }

    public void setTipo_Deporte(String tipo_Deporte) {
        this.tipo_Deporte = tipo_Deporte;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }
}
