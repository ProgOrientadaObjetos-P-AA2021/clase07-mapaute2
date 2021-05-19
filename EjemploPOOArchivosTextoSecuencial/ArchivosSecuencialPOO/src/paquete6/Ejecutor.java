
package paquete6;


/**
 *
 * @author usuario
 */
public class Ejecutor {
    
    public static void main(String[] args) {

        String nombreArchivo = "Hospital.txt";
        
        Hospital hospital1 = new Hospital("Isidro Ayora",2,500);
        Hospital hospital2 = new Hospital("Clinica Mogrovejo", 5,650);
        Hospital hospital3 = new Hospital("San Agustin",10,1000);

        ArchivoEscritura archivo = new ArchivoEscritura(nombreArchivo);

        archivo.establecerRegistro(hospital1);
  
        archivo.establecerSalida();
        

        archivo.establecerRegistro(hospital2);
  
        archivo.establecerSalida();
        
       
        archivo.establecerRegistro(hospital3);
    
        archivo.establecerSalida();
        
        archivo.cerrarArchivo();
        
   
        paquete6.ArchivoLectura lectura = new paquete6.ArchivoLectura(nombreArchivo);
        lectura.establecerLista();
    
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }

}  

