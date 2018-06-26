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
public class TrabajadorIT extends Empleado{

    public TrabajadorIT(int salario) {
        this.salario = salario;
    }

    @Override
    void calcularSalario() {
        double salarioMensual = (this.salario * 0.25) + this.salario;
        System.out.println("El salario mensual como trabajador de IT es: "+salarioMensual);
    }
}
