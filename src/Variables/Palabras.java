package Variables;

/**
 *
 * @author Develop
 */
public class Palabras {
    
    public static void main (String[]args){
        String palabra = new String ("Curso de Java");
        //muestra la letra asociada a la posición indicada
        System.out.println(palabra.charAt(0));
        //obtiene la última posición del caracter indicado
        System.err.println(palabra.lastIndexOf("a"));
        //muestra la posición de la letra indicada
        System.out.println(palabra.indexOf("a"));
        //muestra el conjunto de caracteres indicado
        System.out.println(palabra.substring(0, 5));
        //muestra la palabra en mayusculas
        System.out.println(palabra.toUpperCase());
        //muestra la palabra en minúsculas
        System.out.println(palabra.toLowerCase());
        //compara si la longitud palabra es igual a la indicado
        //devuelve el número de caracteres diferentes
        //(positivo --> primera palabra mayor)
        //(0 palabras iguales en longitud)
        //(negativo --> segunda palabra mayor
        System.out.println(palabra.compareTo("Curso"));
        //compara la longitud de las dos palabras sin importancia de mayusculas/minúsculas
        System.out.println(palabra.compareToIgnoreCase("CURSO"));
        //concatena el valor indicado a la palabra
        System.out.println(palabra.concat(" inicial"));
        //compara el valor indicado con la palabra
        //System.out.println(palabra.);
        
        //Formatear la salida de un string
        String frase = String.format("Curso de %s %.1f", "Java",1.9);
        System.out.println(frase);
        
        String fraseDos = "Curso de "+"Java "+String.valueOf(1.9);
        System.out.println(fraseDos);
        
        frase.toString();
    }
}
