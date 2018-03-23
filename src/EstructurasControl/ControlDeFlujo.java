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
        control.estructuraSwitch();
    }
}
