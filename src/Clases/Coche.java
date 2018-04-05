package Clases;

/**
 *
 * @author Develop
 */
public class Coche {
    //Variables o atributos del objeto que representa la clase

    private String marca;
    private String modelo;
    private String color;
    private int cv;
    private int velocidad;
    private int distancia;
    private boolean aparcado;

    //constructor por defecto
    public Coche() {
    }

    //constructor con todas las variables
    public Coche(String marca, String modelo, String color, int cv) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cv = cv;
    }

    //obtención del valor de la variable marca
    public String getMarca() {
        return marca;
    }

    //obtención del valor de la variable modelo
    public String getModelo() {
        return modelo;
    }

    //obtención del valor de la variable color
    public String getColor() {
        return color;
    }

    //obtención del valor de la variable cv
    public int getCv() {
        return cv;
    }

    public void acelerar(int velocidadAcelerar) {
        this.velocidad = this.velocidad + velocidadAcelerar;
    }

    public void frenar(int intensidad) {
        switch (intensidad) {
            case 1:
                this.velocidad = this.velocidad - 10;
                break;
            case 2:
                this.velocidad = this.velocidad - 20;
                break;
            case 3:
                this.velocidad = this.velocidad - 30;
                break;
        }
    }
    
    public void aparcar(){
        this.aparcado = true;
    }
    
    public void arrancar(){
        this.velocidad = 0;
        this.aparcado = false;
    }

    @Override
    public String toString() {
        String modeloFrase = "Marca: %s, modelo: %s, caballos: %d";
        return String.format(modeloFrase, getMarca(),getModelo(),getCv());
    }
    
    
}
