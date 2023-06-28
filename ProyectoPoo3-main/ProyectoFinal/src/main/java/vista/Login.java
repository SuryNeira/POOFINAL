/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;


import Modelos.Publicacion;
import Modelos.Tarea;
import Modelos.Feed;
import Modelos.ListaDeTareasPorHacer;
import Modelos.Dia;
import Modelos.Calendario;
import Modelos.Usuario;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author suris
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public Login() {
        initComponents();
    }
     public static Usuario usuario;
    public static Feed feed;
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        textField1 = new java.awt.TextField();
        nombreUsuarioInput = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        jButton1 = new javax.swing.JButton();
        PasswordInput = new javax.swing.JPasswordField();

        textField1.setText("textField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 255));

        label1.setBackground(new java.awt.Color(255, 153, 255));
        label1.setText("Iniciar sesión");

        label2.setBackground(new java.awt.Color(255, 204, 255));
        label2.setText("Usuario");

        label3.setBackground(new java.awt.Color(255, 204, 255));
        label3.setText("Clave");

        jButton1.setBackground(new java.awt.Color(255, 204, 255));
        jButton1.setForeground(new java.awt.Color(255, 102, 204));
        jButton1.setText("Ingresar");
        jButton1.setAutoscrolls(true);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nombreUsuarioInput, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jButton1))
                    .addComponent(PasswordInput))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreUsuarioInput, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        if(nombreUsuarioInput.getText().equals("Benja")&&PasswordInput.getText().equals("1234")){
            JOptionPane.showMessageDialog(rootPane, "Entraste, bienvenido");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "contraseña o usuario incorrecto");
        }
    }//GEN-LAST:event_jButton1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
         
         int tamanyo=5;
         Tarea[] tareas=new Tarea[tamanyo];
         int eleccion = 1;
         while(eleccion!=0){
               for(int i=0; i<tareas.length; i++){
             tareas[i]=new Tarea();
             tareas[i].setTitulo("Estudiar Fisica");
             tareas[i].setDescripcion("Estudiar 2 horas");
             tareas[i].setEstadoTarea("incompleta");
             tareas[i].setHoraCreacionTarea(13.05);
             tareas[i].setNumero(1);
             tareas[i].setPrioridadTarea("alta");
             
         }
         
         System.out.println("Tarea: "+tareas[0].getTitulo());
         
    
             Dia dia= new Dia();
             dia.setCalificacionDia(5);
             dia.setConsejoDeProductividad("Organiza una tarea grande en pequeñas tareas");
             dia.setNombreDia("Miercoles");
             dia.setFechaDia("25/03/23");
             
         
          System.out.println("Dia: "+dia.getNombreDia());
   
          Publicacion[] publicaciones=new Publicacion[tamanyo];
          for (int i = 0; i < publicaciones.length; i++) {
    publicaciones[i] = new Publicacion();
    Scanner leer= new Scanner(System.in);
    
    try {
        System.out.println("Ingresa la fecha de publicación de la publicación " + (i + 1) + ":");
        publicaciones[i].setFechaPublicacion(leer.nextLine());
        
        System.out.println("Ingresa el ID de usuario de la publicación " + (i + 1) + ":");
        publicaciones[i].setIdUsuarioPublicacion(leer.nextInt());
        leer.nextLine(); // Consumir el salto de línea después de leer el entero
        
        System.out.println("Ingresa la privacidad de la publicación " + (i + 1) + ":");
        publicaciones[i].setPrivacidadPublicacion(leer.nextLine());
        
        System.out.println("Ingresa la suma de interacción positiva de la publicación " + (i + 1) + ":");
        publicaciones[i].setSumaInteraccionPositiva(leer.nextInt());
        leer.nextLine(); // Consumir el salto de línea después de leer el entero
        
        System.out.println("Ingresa la suma de interacción negativa de la publicación " + (i + 1) + ":");
        publicaciones[i].setSumaInteraccionNegativa(leer.nextInt());
        leer.nextLine(); // Consumir el salto de línea después de leer el entero
        
        System.out.println("Datos de la publicación " + (i + 1) + " ingresados correctamente.");
        System.out.println();
    } catch (Exception e) {
        System.out.println("Error al ingresar los datos de la publicación " + (i + 1) + ".");
        System.out.println("Por favor, verifica los valores ingresados.");
        System.out.println();
        i--; // Reintentar ingresar los datos para esta publicación
    }
}
          ListaDeTareasPorHacer listaTareas=new ListaDeTareasPorHacer();
          listaTareas.setIdLista(425);
          
          Usuario[] usuarios=new Usuario[tamanyo];
          Scanner leer= new Scanner(System.in);
          
          for (int i = 0; i < usuarios.length; i++) {
    
        try {
            System.out.println("Ingresa el alias del usuario " + (i + 1) + ":");
            usuarios[i].setAlias(leer.nextLine());

            System.out.println("Ingresa la descripción del perfil del usuario " + (i + 1) + ":");
            usuarios[i].setDescripcionPerfil(leer.nextLine());

            System.out.println("Ingresa la fecha de creación de la cuenta del usuario " + (i + 1) + ":");
            usuarios[i].setFechaCreacionDeLaCuenta(leer.nextLine());

            System.out.println("Ingresa el ID del usuario " + (i + 1) + ":");
            usuarios[i].setIdUsuario(leer.nextInt());
            leer.nextLine(); // Consumir el salto de línea después de leer el entero

            System.out.println("Ingresa el nombre del usuario " + (i + 1) + ":");
            usuarios[i].setNombre(leer.nextLine());
            usuarios[i] = new Usuario();
            System.out.println("Datos del usuario ingresados correctamente.");
            System.out.println();
        } catch (Exception e) {
            System.out.println("Error al ingresar los datos del usuario.");
            System.out.println("Por favor, verifica los valores ingresados.");
            System.out.println();
            i--; // Reintentar ingresar los datos para este usuario
        }
        
        System.out.println("ingresa un 0 si ya no quieres poner mas datos, de lo contrario ingresa otro valor");
        int num = leer.nextInt();
        eleccion=num;
        
}
         }
         
       
          
          
          Calendario calendario = new Calendario();
          calendario.setAnyoCalendario(2023);
          calendario.setIdCalendario(1);
          //menu
          int opc = 0;
          do{
              System.out.println("opcion 1 para agregar dia al calendario");
              System.out.println("opcion 2 para modificar año del calendario");
              System.out.println("opcion 3 para eliminar dia del calendario");
              System.out.println("opcion 4 para mostrar calendario");
              System.out.println("opcion 0 para SALIR");
              
              switch (opc){
                    case 1: 
                  {
                      Dia dia = null;
                      if(calendario.buscarDia(calendario.getDiasCalendario(), dia) == false){
                          calendario.agregarDia(dia);
                          System.out.println("El dia ha sido agregado");
                      }
                  }
                            
                        break;

                    case 2: 
                        int anyoNuevo;
                        
                        try{
                            System.out.println("ingresa el año del calendario"); 
                            Scanner leer= new Scanner(System.in);//anyo
                        anyoNuevo = leer.nextInt();
                        calendario.modifCalendario(anyoNuevo);
                        System.out.println("El calendario ha sido actualizado");
                        }catch(InputMismatchException e){ //si el usuario ingresa una cadena en vez de numero
                            System.out.println("El año ingresado es iválido");
                        }
                        
                        
                        break;
                    case 3:
                  {
                      Dia dia = null;
                      if(calendario.buscarDia(calendario.getDiasCalendario(), dia) == true)
                          calendario.eliminarDia(dia);
                  }
                            System.out.println("Se ha eliminado un dia");
                        break;

                    case 4:
                        System.out.println("Mostrando calendario: ");
                        calendario.mostrarCalendario();
                        break;
                        
                    default:
                        System.out.println("Opcion no válida");
                        
                        break;
            }
       
          
          }while(opc!=0);
          
         
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordInput;
    private javax.swing.JButton jButton1;
    private javax.swing.JColorChooser jColorChooser1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private javax.swing.JTextField nombreUsuarioInput;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
}