/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;
import java.util.ArrayList;
/**
 *
 * @author suris
 */
public class ListaDeTareasPorHacer {
    
    private ArrayList<Tarea> tareas;
    private int IdLista;
    
    public ListaDeTareasPorHacer(ArrayList<Tarea> tareas, int IdLista) {
        this.tareas = tareas;
        this.IdLista = IdLista;
    }

    public ListaDeTareasPorHacer() {
        
    }
    

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(ArrayList<Tarea> tareas) {
        this.tareas = tareas;
    }


    public int getIdLista() {
        return IdLista;
    }

    public void setIdLista(int idLista) {
        this.IdLista = idLista;
    }

//comportamientos agregar, leer, eliminar tarea, ordenar por prioridad o modificar tarea, SUMAr puntos por tarea realizada segun puntos de prioridad
    
   
    public void SumaDePuntosUsuario(){
        
    }
   
    public void agregartarea(){
      String Titulo;
      int Numero;
      String Descripcion;
      Double HoraCreacionTarea;
      String PrioridadTarea;
      String EstadoTarea;
      
      System.out.print("INGRESA LOS DATOS:");
        
    }
     public void eliminartarea(){
        
    }
    public void ordenartareaSegunPrioridad(){
        
    }
    
    public void modificarTarea(){
        
    }
    
    
}
