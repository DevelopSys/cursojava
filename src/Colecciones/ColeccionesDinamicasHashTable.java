package Colecciones;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author Develop
 */
public class ColeccionesDinamicasHashTable {

    public static void main(String[] args) {

        Hashtable listaHash = new Hashtable();
        // se puede identificar el tipo de la clave asociada y el tipo del objeto
        Hashtable<Integer, Alumno> listaAlumno = new Hashtable<Integer, Alumno>();
        // borra todos los elementos de la lista
        listaAlumno.clear();
        // realiza una copia exacta de la lista 
        listaAlumno.clone();
        // indica si el objeto esta contenido en la lista
        Alumno a = new Alumno("Alumno", "Apellido", 1, 123);
        listaAlumno.contains(a);
        // indica si la clave por la que se pregunta está contenida en la lista
        listaAlumno.containsKey(1);
        // agrega un elemento a la lista guardando los tipos indicados en la creación
        // se debe indicar la clave asociada y el objeto que se desea guardar
        Alumno alumno = new Alumno("Alumno", "Apellido", 1, 123);
        listaAlumno.put(a.getId(), alumno);
        // devuelve el alumno asociado a la clave indicada
        Alumno alumnoObtenido = listaAlumno.get(1);
        // elimina el alumno asociado a la clave indicada
        listaAlumno.remove(1);
        // remplaza el elemento de la posicion determinada por uno nuevo
        listaAlumno.replace(1, new Alumno("AlumnoNuevo","ApellidoNuevo",1,123));
        // devuelve el tamaño de la lista
        listaAlumno.size();
        // comprueba si la lista está vacia
        listaAlumno.isEmpty();
        // combierte la lista en un objeto de tipo enumeration
        Enumeration<Alumno> alumnos = listaAlumno.elements();
        Enumeration<Integer> clavesAlumnos = listaAlumno.keys();
    
        // listar los alumnos
        Enumeration<Alumno> alumnosDef = listaAlumno.elements();
        while (alumnosDef.hasMoreElements()){
            alumnosDef.nextElement().toString();
        }
        
        // ó
        
        Enumeration<Integer> clavesAlumnosDef = listaAlumno.keys();
        while (clavesAlumnosDef.hasMoreElements()){
            Alumno alTemporal = (Alumno)listaAlumno.get(clavesAlumnosDef.nextElement());
            alTemporal.toString();
        }

        // eliminar un elemento que cumpla una condición
        Enumeration<Alumno> alumnosDefBorrar = listaAlumno.elements();
        while (alumnosDefBorrar.hasMoreElements()){
            Alumno alTempBorrar = alumnosDefBorrar.nextElement();
            if (alTempBorrar.getNombre().equals("NombreBorrar")){
                listaAlumno.remove(alTempBorrar.getId());
            };
            
        }
        
    }
}
