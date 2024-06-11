package com.excersice3.entity;

public class Contactos {
    private String nombre;
    private int telefono;
    private String correo;

    public Contactos(String nombre, int telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getConts() {
        return "Contactos \n"
                + "Nombre: " + nombre + "\n"
                + "Telénofo: " + this.telefono + "\n"
                + "Correo electrónico: " + correo + "\n";
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
