/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

/**
 *
 * @author usuario
 */
public class Ejecutor {
    
    public static void main(String[] args) {
        
        String nombreArchivo = "Hospital.data";
        
        Hospital hospital1 = new Hospital("Isidro Ayora",25,1340);
        Hospital hospital2 = new Hospital("Manuel Ignacio",40,2040);
        Hospital hospital3 = new Hospital("Clínica San Agustin",70,5020);
        
        EscrituraArchivo archivo = new EscrituraArchivo(nombreArchivo);
        
        archivo.establecerRegistroHospital(hospital1);
        archivo.establecerSalida();
        
        archivo.establecerRegistroHospital(hospital2);
        archivo.establecerSalida();
        
        archivo.establecerRegistroHospital(hospital3);
        archivo.establecerSalida();
        
        LecturaArchivo lectura = new LecturaArchivo(nombreArchivo);
        
        lectura.establecerHospitales();
        
        System.out.println(lectura);
        
    }
    
}
