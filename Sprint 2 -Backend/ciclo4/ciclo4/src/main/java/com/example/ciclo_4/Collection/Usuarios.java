package com.example.ciclo_4.Collection;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("UsuariosService")
public class Usuarios {
    @Id
    private String Id;

    @Field("tipoDocumento")
    private String tipoDocumento;

    @Field("Documento")
    private Integer Documento;

    @Field("nombreCompleto")
    private String nombreCompleto;

    @Field("Correo")
    private String Correo;

    @Field("Celular")
    private Integer Celular;

    @Field("Usuario")
    private String Usuario;

    @Field("Contraseña")
    private String Contraseña;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Integer getDocumento() {
        return Documento;
    }

    public void setDocumento(Integer documento) {
        Documento = documento;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public Integer getCelular() {
        return Celular;
    }

    public void setCelular(Integer celular) {
        Celular = celular;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }
}