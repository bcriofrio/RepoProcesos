/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tarea1_procesos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Blankis
 */
public class Persona implements Serializable { 
     public void AbrirArchivo()throws IOException{
         //Dirección del fichero
        File texto= new File("C:\\Users\\Blankis\\Documents\\NetBeansProjects\\Tarea1_Procesos\\src\\archivos\\fichero1.txt");
        if(texto.exists()){
        System.out.println(" Nombre:" + texto.getName());
        System.out.println(" Driectorio: " +texto.getAbsolutePath());
        }else{
        System.out.println("No existe");
    }
   }
    public void AgregarRegistros()throws IOException{  
      Scanner lector= new Scanner(System.in);
        File txt= new File("C:\\Users\\Blankis\\Documents\\NetBeansProjects\\Tarea1_Procesos\\src\\archivos\\fichero1.txt");
        FileOutputStream flujoSalida = new FileOutputStream(txt);
         try (PrintWriter salida = new PrintWriter(flujoSalida)) {
             String id= JOptionPane.showInputDialog("Ingrese el numero de cédula de la persona");
             String apellidos=JOptionPane.showInputDialog("Ingrese los dos apellidos de la persona");
             String nombres=JOptionPane.showInputDialog("Ingrese los dos nombres de la persona");
             String fecha_nacimiento=JOptionPane.showInputDialog("Ingrese la fecha de nacimiento de la persona");
             String carrera= JOptionPane.showInputDialog("Ingrese la profesion de la persona");
             String estado= JOptionPane.showInputDialog("Ingrese el estado civil de la persona");
             salida.println("******PERSONA********: \n");
             salida.println("Cedula de identidad:" +id);
             salida.println("Apellidos de la persona:" +apellidos);
             salida.println("Nombres de la persona:" +nombres);
             salida.println("Fecha de nacimiento de la persona:" +fecha_nacimiento);
             salida.println("Profesion :" +carrera);
             salida.println("Estado civil :" +estado);
         }
    }        
    public void serializar (String txt) throws IOException {
        
        ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(txt));
        salida.writeObject(this);
    }
}
