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
public class Variables {
    
    public static void main (String[]args){

    //tipoVariable nombreVariablo = valor
    //variable de clase
    
    //variable primitiva
    byte numero1 = 1;
    short numero2 = 30123;
    int numero3 = 10;
    long numero4 = 1231233;
    float numero5 = 1232123; 
    double numero6 = 3.14;
    boolean semaforo = true;
    char letra;
    
    //variable objeto o compleja
    String palabra = "palabra";
    String palabraObjeto = new String("palabra2");
    Object objeto = new Object();
   
    // variable de clase
    int nuemeroClase;
    System.out.println("El valor de la variable numero1 es: "+ numero1);
    System.out.println("El valor de la variable numero2 es: "+ numero2);
    System.out.println("El valor de la variable numero3 es: "+ numero3);
    System.out.println("El valor de la variable numero4 es: "+ numero4);
    System.out.println("El valor de la variable numero5 es: "+ numero5);
    System.out.println("El valor de la variable numero6 es: "+ numero6);
    System.out.println("El valor de la variable semaforo es: "+ semaforo);
    System.out.println("El valor de la variable letra es: "+ letra);
    System.out.println("El valor de la variable palabra es: "+ palabra);
    System.out.println("El valor de la variable palabraObjeto es: "+ palabraObjeto);
    System.out.println("El valor de la variable opbjeto es: "+ objeto);
    }
    
}
