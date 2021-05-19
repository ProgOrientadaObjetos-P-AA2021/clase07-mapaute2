
package paquete6;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;



/**
 *
 * @author usuario
 */
public class ArchivoEscritura {
    
  private String nombreArchivo;
    private String rutaArchivo;
    private Hospital registro;
    private Formatter salidaArchivo;

    public ArchivoEscritura(String n) {
        nombreArchivo = n;
        rutaArchivo = String.format("data/%s",
                obtenerNombreArchivo());

        establecerInformacionAnterior();
        
    }

    public void establecerInformacionAnterior() {
        paquete6.ArchivoLectura lectura = new paquete6.ArchivoLectura(nombreArchivo);
        lectura.establecerLista();
        ArrayList<Hospital> lista = lectura.obtenerLista();

        try {
            salidaArchivo = new Formatter(rutaArchivo);
            if (lista != null) {

                if (lista.size() > 0) {
                    for (int i = 0; i < lista.size(); i++) {
                        Hospital p1 = lista.get(i);
                        establecerRegistro(p1);
                        establecerSalida();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error al leer del archivo: " + e);

        } 
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerRutaArchivo() {
        rutaArchivo = String.format("data/%s.txt",
                obtenerNombreArchivo());;
    }

    public void establecerRegistro(Hospital n) {
        registro = n;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public String obtenerRutaArchivo() {
        return rutaArchivo;
    }

    public Hospital obtenerRegistro() {
        return registro;
    }

    public void establecerSalida() {
        try {
            Hospital p = obtenerRegistro();
            String cadenaRegistro = String.format("%s;Nombre: %s;"
                    + "Número de camas: %d;Presupuesto: %.2f",
                    p.obtenerNombre(),p.obtenerNumeroCamas(),
                    p.obtenerPresupuesto());
            salidaArchivo.format("%s\n", cadenaRegistro);

        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.err.println(e);

        }

    }

    public void cerrarArchivo() {
        if (salidaArchivo != null) {
            salidaArchivo.close();
        } 

    }

}
