package Colecciones;

import java.util.Arrays;

/**
 *
 * @author Develop
 */
public class Organizacion {

    public void organizarArrayNumeros() {
        int[] numeros = {4, 1, 2, 6, 8, 3, 4, 89, 67, 32, 12};
        System.out.println("Antes de la organizacion:");
        for (int temp : numeros) {
            System.out.println(temp);
        }
        Arrays.sort(numeros);
        System.out.println("Después de la organizacion:");

        for (int temp : numeros) {
            System.out.println(temp);
        }
    }

    public void organizarArrayLetras() {
        String[] palabras = {"lenguaje", "programación", "java", "c", "win"};
        System.out.println("Antes de la organizacion:");
        for (String temp : palabras) {
            System.out.println(temp);
        }
        Arrays.sort(palabras);
        System.out.println("Después de la organizacion:");
        for (String temp : palabras) {
            System.out.println(temp);
        }
    }

    public void copiarArrays() {
        int[] numeros = {4, 1, 2, 6, 8, 3, 4, 89, 67, 32, 12};
        System.out.println(numeros.length);
        int[] numerosNuevos = Arrays.copyOf(numeros, 20);
        System.out.println(numerosNuevos.length);
        System.out.println(numerosNuevos[19]);
    }

    public void compararArrays() {
        int[] numeros = {4, 1, 2, 6, 8, 3, 4, 89, 67, 32, 12};
        int[] numerosDos = {6, 7, 8, 2, 123, 53, 231, 23};
        boolean iguales = Arrays.equals(numeros, numerosDos);
        System.out.println(iguales);
        int[] numerosTres = {4, 1, 2, 6, 8, 3, 4, 89, 67, 32, 12};
        int[] numerosCuatro = {4, 1, 2, 6, 8, 3, 4, 89, 67, 32, 12};
        boolean igualesDos = Arrays.equals(numerosTres, numerosCuatro);
        System.out.println(igualesDos);
    }

    public void clonadoArrays() {
        int[] numeros = {4, 1, 2, 6, 8, 3, 4, 89, 67, 32, 12};
        int[] numerosNuevos = numeros.clone();
        System.out.println(numerosNuevos.length);
    }

    public static void main(String[] args) {
        Organizacion org = new Organizacion();
        //org.organizarArrayNumeros();
        //org.organizarArrayLetras();
        //org.copiarArrays();
        //org.compararArrays();
        org.clonadoArrays();
    }
}
