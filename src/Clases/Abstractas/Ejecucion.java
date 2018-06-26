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
public class Ejecucion {
    
    public static void main(String[]args){
        /*Empleado empleado = new Empleado() {
            @Override
            void calcularSalario() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };*/
        TrabajadorIT informatico = new TrabajadorIT(1800);
        informatico.mostrarDatos();
        informatico.calcularSalario();
        
    }
}
