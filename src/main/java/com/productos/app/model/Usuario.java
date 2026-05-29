package com.productos.app.model;

public class Usuario {
    private int id, perfil, ecivil;
    private String nombre, cedula, correo, clave;

    public Usuario(int id, int perfil, int ecivil, String nombre, String cedula, String correo, String clave) {
        this.id = id;
        this.perfil = perfil;
        this.ecivil = ecivil;
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.clave = clave;
    }

    // Getters y Setters necesarios para que Spring pueda leer los datos
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getPerfil() { return perfil; }
    public void setPerfil(int perfil) { this.perfil = perfil; }

    public int getEcivil() { return ecivil; }
    public void setEcivil(int ecivil) { this.ecivil = ecivil; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getClave() { return clave; }
    public void setClave(String clave) { this.clave = clave; }
}