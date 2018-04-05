package Clases;

/**
 *
 * @author Develop
 */
public class Garaje {

    Coche[] miGaraje = new Coche[2];

    public void agregarCoche(Coche c) {
        if (miGaraje.length < 3) {
            if (miGaraje.length == 0) {
                miGaraje[0] = c;
            } else {
                miGaraje[1] = c;
            }
            System.out.println("Coche agregado correctamente");

        } else {
            System.out.println("No entran más coches en el garaje");
        }
    }

    public void listarCoches() {
        if (miGaraje.length != 0) {
            for (Coche c : miGaraje) {
                System.err.println(c.toString());
            }
        }
    }

    public static void main(String [] args) {
        Coche miCoche = new Coche("Mercedes", "GLC", "Negro", 220);
        Coche miCocheDos = new Coche("BMW", "720", "Blanco", 300);
        Garaje garaje = new Garaje();
        garaje.agregarCoche(miCoche);
        garaje.agregarCoche(miCocheDos);

        miCoche.arrancar();
        miCoche.acelerar(100);
        miCoche.frenar(3);
        miCoche.aparcar();

        Coche miCocheTres = new Coche("Audi", "Q5", "Blanco", 300);
    }
}
