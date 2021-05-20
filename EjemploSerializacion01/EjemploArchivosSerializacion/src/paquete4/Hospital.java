/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.io.Serializable;

/**
 *
 * @author usuario
 */
public class Hospital implements Serializable{
    
    private String nombre;
    private int numeroCamas;
    private double presupuesto;
    
    public Hospital(String nom, int ca,double pre){
        nombre = nom;
        numeroCamas = ca;
        presupuesto = pre;
    }
    
    public void establecerNombre(String tipo){
        nombre = tipo;
    }
    public void establecerNumeroCamas(int tipo){
        numeroCamas = tipo;
    }
    public void establecerPresupuesto(double tipo){
        presupuesto = tipo;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    public int obtenerNumeroCamas(){
        return numeroCamas;
    }
    public double obtenerPresupuesto(){
        return presupuesto;
    }
}

