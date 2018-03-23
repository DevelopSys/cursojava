/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasControl;

/**
 *
 * @author Develop
 */
public class ControlDeFlujo {

    int nota;

    public void estructuraIfBasica() {
        nota = 7;
        if (nota < 5) {
            System.out.println("El examen está suspenso");
        } else {
            System.out.println("El examen está aprobado");
        }
    }
    
    public void estructuraFor(){
        for (int i =1;i<6;i++){
            System.out.println("Recorrido número = " + i);
            System.out.println("La variable i actualizará su valor...");
        }        
    }

    public void estructuraForeach(){
        int[] elementos = {1,2,3,4,5,6,7,8,9};
        int suma = 0;
        for (int temp : elementos) {
            System.out.println("Se sumará el elemento "+temp);
            suma = suma + temp;      
        }
        System.out.println("La suma de todos los números es "+suma);
    }
    
    public void estructuraIfAlternativa() {
        nota = 7;
        if (nota < 5) {
            System.out.println("El examen está suspenso");
        } else if (nota == 5) {
            System.out.println("El examen se ha aprobado justo");
        } else if (nota < 9) {
            System.out.println("El examen se ha aprobado con buena nota");
        } else if (nota == 9) {
            System.out.println("El examen se ha aprobado con muy buena nota");
        } else {
            System.out.println("El examen está perfecto");
        }
    }

    public void estructuraSwitch() {
        nota = 10;
        switch (nota) {
            case 1:
                System.out.println("La note obtenida es un 1");
                break;
            case 5:
                System.out.println("La nota obtenida es un 5");

                break;
            case 10:
                System.out.println("La nota obtenida es un 10");

                break;
            default:
                System.out.println("La nota obtenida no está contemplada en este bloque");

                break;
        }
    }

    public static void main(String[] args) {
        ControlDeFlujo control = new ControlDeFlujo();
        control.estructuraForeach();
    }
}
