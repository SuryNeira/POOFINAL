/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import Modelos.Usuario;
import Modelos.Usuario;
import java.util.ArrayList;
/**
 *
 * @author benja
 */
public class UsuariosG implements usuarioBD {
    public String query;
    
    public ArrayList<Usuario>usuario UsuariosGection link){

        try{
            Statement s = link.createStatement();
            query="select * from Clientes";
            ResultSet rs=s.executeQuery(query);
            while (rs.next()){
               Usuario usuario=new Usuario();
               usuario.setNombre(rs.getString("rut"));
               usuario.setIdUsuario(rs.getint("IdUsuario"));
               usuario.setAlias(rs.getString("Alias"));
               usuario.setDescripcionPerfil(rs.getString("Descripcion"));
               usuario.setClaveUsuario(rs.getString("clave"));
               usuario.setFechaCreacionDeLaCuenta(rs.getString("Fecha creacion"));
               
               ListaUsuario.add(usuario);
                
            }
            
            return ListaUsuario;
        }catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
   
    
    
    
    public boolean Crear(Connection link, Usuario usuario){
        
        try{
            Statement s = link.createStatement();
            query="INSERT INTO Clientes(nombres,idUsuario,Alias,descripcion perfil,creacion de la )VALUES('"+usuario.getNombre()+"','"+usuario.getIdUsuario()+"','"+usuario.getAlias()+"','"+usuario.getDescripcionPerfil()+"','"+usuario.getFechaCreacionDeLaCuenta()+"')";
            s.executeUpdate(query);
            return true;
            
        }catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
        
    }
    
    public Usuario Buscar(Connection link, String rut){
        Usuario usuario=new Usuario();
        try {
            Statement s = link.createStatement();
            query="select * from Clientes where rut='"+rut+"'";
            ResultSet rs=s.executeQuery(query);
            
                   
   
            while (rs.next()){
               usuario.setNombre(rs.getString("rut"));
               usuario.setIdUsuario(rs.getint("IdUsuario"));
               usuario.setAlias(rs.getString("Alias"));
               usuario.setDescripcionPerfil(rs.getString("Descripcion"));
               usuario.setClaveUsuario(rs.getString("clave"));
               usuario.setFechaCreacionDeLaCuenta(rs.getString("Fecha creacion"));
                
            }
            return usuario;
  
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    @Override
   
    
    public boolean Actualizar(Connection link, Usuario usuario){
        try{
            Statement s = link.createStatement();
            query="UPDATE Clientes set nombres='"+usuario.getNombre()+"','"+usuario.getIdUsuario()+"','"+usuario.getAlias()+"','"+usuario.getDescripcionPerfil()+"','"+usuario.getFechaCreacionDeLaCuenta()+"')";
            s.executeUpdate(query);
            return true;
            
        }catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
        
       
    }

    @Override
    public boolean Eliminar(Connection link, String rut) {
           try {
            //aqui hay que buscar si se encuentra 
            
            Statement s = link.createStatement();
            query="delete * Clientes where rut='"+rut+"'";
            ResultSet rs=s.executeQuery(query);
            
            return true;
            
        }catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }

    @Override
    public ArrayList<Usuario> Leer(Connection link) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
