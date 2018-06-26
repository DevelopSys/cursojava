package Colecciones;

/**
 *
 * @author Develop
 */
public class Alumno {

    String nombre, apellido;
    int id, telefono;

    public Alumno(String nombre, String apellido, int id, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getId() {
        return id;
    }

    public int getTelefono() {
        return telefono;
    }
    
    
    
}
