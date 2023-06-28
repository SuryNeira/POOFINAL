/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.Date;

/**
 *
 * @author suris
 */
public abstract class Evento {
    private Date fecha;
    private String hora;
    private String titulo;
    private String descripcion;

    // Constructor

    public Evento() {
    }
    
    
    public Evento(Date fecha, String hora, String titulo, String descripcion) {
        this.fecha = fecha;
        this.hora = hora;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    // Getters y setters
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Métodos abstractos
    public abstract void realizarEvento();
}
