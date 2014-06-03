/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tarea1_procesos;

/**
 *
 * @author Blankis
 */
public class Tarea1_Procesos {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        
       Persona per= new Persona();
        try{
        per.AbrirArchivo();
        per.AgregarRegistros();
        
        }catch(Exception e){
            System.out.println("Error");    
        }
}
}
