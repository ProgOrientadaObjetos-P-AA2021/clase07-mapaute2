
package paquete6;

/**
 *
 * @author usuario
 */
public class Hospital {
    
    private String nombre;
    private int numeroCamas;
    private double presupuesto;
    
    public Hospital(String nombreH, int numCamas,double pre) {
       nombre = nombreH;
       numeroCamas = numCamas;
       presupuesto = pre;
    }
    
    public void establecerNombre(String tipo) {
        nombre = tipo;
    }
    public void establecerNumeroCamas(int tipo) {
        numeroCamas = tipo;
    }
    public void establecerPresupuesto(double tipo) {
        presupuesto = tipo;
    }
    public String obtenerNombre() {
        return nombre;
    }
    public int obtenerNumeroCamas() {
        return numeroCamas;
    }
    public double obtenerPresupuesto() {
        return presupuesto;
    }
}

    

