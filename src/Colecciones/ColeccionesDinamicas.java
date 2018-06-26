/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones;

import java.util.ArrayList;

/**
 *
 * @author Develop
 */
public class ColeccionesDinamicas {

    public static void main(String[] args) {
        ArrayList listaGenerica = new ArrayList();
        //constructor que indica el tipo que guardará la colección dinámica
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
        ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();

        // agrega un objeto a la lista teniendo en cuenta la restricción de tipos
        listaAlumnos.add(new Alumno("Alumno", "Prueba", 1, 123));
        // comprueba si el objeto indicado está presente en la lista
        listaAlumnos.contains(new Alumno("Alumno", "Prueba", 1, 123));
        // elimina la lista completa
        listaAlumnos.clear();
        // Obtiene el objeto de la posición indicada. En el caso de no tener indicado el tipo en el constructor
        // será obligatorio indicar el casteo a realizar para el objeto seccionado
        Alumno alumno = listaAlumnos.get(0);
        // pone la referencia del objeto en la posición indicada
        listaAlumnos.set(1, new Alumno("Alumno1", "Prueba1", 2, 123));
        // comprueba si la lista está vacia
        listaAlumnos.isEmpty();
        // obtiene el inice del objeto indicado en el método
        listaAlumnos.indexOf(new Alumno("Alumno1", "Prueba1", 2, 123));
        // elimina el objeto situado en la posición indicada
        listaAlumnos.remove(1);

        // listar una lista completa
        if (!listaAlumnos.isEmpty()) {
            for (Alumno a : listaAlumnos) {
                System.out.println(a.getNombre());
            }
        }

        // eliminar un elemento de una lista que cumpla una condición
        if (!listaAlumnos.isEmpty()) {
            for (Alumno a : listaAlumnos) {
                if (a.getNombre().equals("NombreABorrar")){
                    listaAlumnos.remove(a);
                }
            }
        }

    }

}
