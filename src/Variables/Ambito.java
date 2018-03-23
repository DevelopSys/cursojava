/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Variables;

/**
 *
 * @author Develop
 */
public class Ambito {
    
    final double pi = 3.141516;
    int numeroClase;
    int numeroClaseInicializado;
    String palabra;
    
    public void modificarVariable(){
        numeroClase = 9;
        numeroClaseInicializado = 10;
        // la siguiente llamada daría error ya que el valor de la variable no se puede modificar
        // al estar declarada como final
        //pi = 3.14;
        // en este case se produciria un nullpointer al intentar acceder a una variable que es vacía
        System.out.println(palabra);
    }
    
    public void variablesLocales(){
        int numeroLocal = 10;
        String palabraLocal = "variable local";
    }
    
    public void accesoVariables(){
        System.out.println(numeroClase);
        System.out.println(numeroClase);
        // la siguiente llamada produce un nullpointer ya que la variable tan solo tiene existencia en el 
        //método en el que ha sido declarada
       // System.out.println(palabraLocal);
    } 
}
