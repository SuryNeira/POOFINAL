/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;
import java.util.Date;

/**
 *
 * @author suris
 */
public class Tarea extends Evento implements Recordatorio{
    private String Titulo;
     private int Numero;
     private String Descripcion;
     private Double HoraCreacionTarea;
     private String PrioridadTarea;//alta, media o baja
     private String EstadoTarea; //si está incompleta, en proceso o finalizada
     
     public Tarea(){
         
     }

    public Tarea(String Titulo, int Numero, String Descripcion, Double HoraCreacionTarea, String PrioridadTarea, String EstadoTarea, Date fecha, String hora, String titulo, String descripcion) {
        super(fecha, hora, titulo, descripcion);
        this.Titulo = Titulo;
        this.Numero = Numero;
        this.Descripcion = Descripcion;
        this.HoraCreacionTarea = HoraCreacionTarea;
        this.PrioridadTarea = PrioridadTarea;
        this.EstadoTarea = EstadoTarea;
    }

    public Tarea(Date fecha, String hora, String titulo, String descripcion) {
        super(fecha, hora, titulo, descripcion);
    }


    @Override
    public String getTitulo() {
        return Titulo;
    }

    @Override
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    @Override
    public String getDescripcion() {
        return Descripcion;
    }

    @Override
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Double getHoraCreacionTarea() {
        return HoraCreacionTarea;
    }

    public void setHoraCreacionTarea(Double HoraCreacionTarea) {
        this.HoraCreacionTarea = HoraCreacionTarea;
    }

    public String getPrioridadTarea() {
        return PrioridadTarea;
    }

    public void setPrioridadTarea(String PrioridadTarea) {
        this.PrioridadTarea = PrioridadTarea;
    }

    public String getEstadoTarea() {
        return EstadoTarea;
    }

    public void setEstadoTarea(String EstadoTarea) {
        this.EstadoTarea = EstadoTarea;
    }
      
    
    private void mostrarNotificacion(String titulo, String mensaje, MessageType tipo) {
        if (SystemTray.isSupported()) {
            SystemTray tray = SystemTray.getSystemTray();
            Image icono = Toolkit.getDefaultToolkit().getImage("ruta/al/icono.png");

            TrayIcon trayIcon = new TrayIcon(icono, "Aplicación de Organización");
            trayIcon.setImageAutoSize(true);
            trayIcon.setToolTip("Aplicación de Organización");

            try {
                tray.add(trayIcon);
                trayIcon.displayMessage(titulo, mensaje, tipo);
            } catch (AWTException e) {
                System.err.println("Error al mostrar la notificación: " + e.getMessage());
            }
        }
    }
    
    public void CrearTarea(){
        
    }
    
    public void designarFechaYHoraTarea(){
        
    }

    //metodo para designar fecha y hora de la tarea
 
    @Override
    public void establecerRecordatorio(Date fechaRecordatorio) {
         mostrarNotificacion("Recordatorio", "¡Es hora de completar la tarea!", MessageType.INFO);
    }

    @Override
    public void realizarEvento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
