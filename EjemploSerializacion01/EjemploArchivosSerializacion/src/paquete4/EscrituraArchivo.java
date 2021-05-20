/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


/**
 *
 * @author usuario
 */
public class EscrituraArchivo {
    
    private String nombreArchivo;
    private ObjectOutputStream salida; 
    private Hospital registroHospital;
    private ArrayList<Hospital> listaHospitales;

    public EscrituraArchivo(String nombreArc) {
        nombreArchivo = nombreArc;
        establecerListaHospitales(); 
       
        try 
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
        
            if (obtenerListaHospitales().size() > 0) {
                for (int i = 0; i < obtenerListaHospitales().size(); i++) {
                    establecerRegistroHospital(obtenerListaHospitales().get(i));
                    establecerSalida();
                }
            }
        } 
        catch (IOException ioException) {
            System.err.println("Error al abrir el archivo.");
        } 
    }
    
    public void establecerNombreArchivo(String n){
        nombreArchivo = n;
    }

    public void establecerRegistroHospital(Hospital h) {
        registroHospital = h;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(registroHospital);
                                                 
        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }


    public void establecerListaHospitales() {
        LecturaArchivo l = new LecturaArchivo(obtenerNombreArchivo());
        l.establecerHospitales();
        listaHospitales = l.obtenerHospitales();
    }

    public String obtenerNombreArchivo(){
        return nombreArchivo;
    }
    
    public ArrayList<Hospital> obtenerListaHospitales() {
        return listaHospitales;
    }

    public ObjectOutputStream obtenerSalida(){
        return salida;
    }
    public void cerrarArchivo() {
        try 
        {
            if (salida != null) {
                salida.close();
            }
        } 
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            
        } 
    } 
    
   
}
