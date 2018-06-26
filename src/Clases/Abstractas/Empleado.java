/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases.Abstractas;

/**
 *
 * @author Develop
 */
public abstract class Empleado {

    int antiguedad;
    int salario;
    String nombre;
    String apellido;
    
    abstract void calcularSalario();
    void mostrarDatos(){
        System.out.println("El empleado tiene como salario base: "+this.salario);
    } 
}
