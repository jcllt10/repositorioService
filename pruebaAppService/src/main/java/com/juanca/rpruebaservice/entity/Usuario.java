package com.juanca.rpruebaservice.entity;


public class Usuario {
   
    public String codigo;
    public String nombre;

    public Usuario() {
    }

    public Usuario(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
}
