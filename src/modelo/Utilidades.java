/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.LinkedList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Joan
 */
public class Utilidades {
    
    public static boolean guardarArchivo(LinkedList<Cliente> listaC){
    boolean t=false;
    try{
        String nombreArchivo ="clientes.txt";
        
        FileWriter fileWriter = new FileWriter(nombreArchivo);
        
        BufferedWriter writer= new BufferedWriter(fileWriter);
        
        for (Cliente cliente: listaC){
            writer.write(cliente.toString()+"\n");
        
        }
    }catch(IOException e){
        e.printStackTrace();
        
    }
       
    return t;
    }
    
}
