/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tarea1_procesos;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Blankis
 */
public class Tarea1_Procesos {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        
        try(FileReader fr=new FileReader("C:\\Users\\Blankis\\Desktop\\fichero1.txt");
            FileWriter fw=new FileWriter("C:\\Users\\Blankis\\Desktop\\fichero1.txt")){
            escribirArchivo(fw);
            //Guardar cambios del archivo
            fw.flush();
            leerArchivo(fr);
        }catch(IOException e){
            System.out.println("Error E/S: "+e);
        }
    }
 
    public static void escribirArchivo(FileWriter fw) throws IOException{
        //Escribir el archivo
        fw.write("Prueba de fichero para la tarea de procesos");
    }
 
    public static void leerArchivo(FileReader fr) throws IOException{
        //Leer el archivo
        int valor=fr.read();
        while(valor!=-1){
            System.out.print((char)valor);
            valor=fr.read();
        }
    }
}
