package Colecciones;
/**
 *
 * @author Develop
 */
public class ArraysSimples {
    
    public static void main(String[]args){
        // la declaración incluye las variables que formarán parte del objeto array
        int[]numeros = {0,1,2,3,4,5,6,7,8,9};
        // la declaración no incluye los datos que formarán parte del array pero si se indica el número de posiciones máximas que podrá tener el array
        int[]numerosDos = new int[9];
        //accede a la primera posición del array numeros
        System.out.println(numeros[0]);
        //modifica la posición 0 del array numerosDos
        numerosDos[0]=100;
        System.out.println(numerosDos[0]);
        
        //recorrer el array numeros con un for
        System.err.println("Recorrido con for");
        for (int i=0;i<numeros.length;i++)
        {
            String frase = "La posición %d tiene asignado el valor %d";
            System.out.println(String.format(frase,i,numeros[i]));
        }
        
        //recorrer el array numeros con un foreach
        System.out.println("Recorrido con foreach");
        int i = 0;
        for (int temp: numeros){
            String frase = "La posición %d tiene asignado el valor %d";
            System.out.println(String.format(frase,i,temp));
            i++;
        }
        
        String[] palabras = {"ejemplo","de","array","unidimensional","de","palabras"};
        //ArrayIndexOutOfBoundException
        //String palabra = palabras[6];
        
        //ArrayIndexOutOfBoundException en la útlima posición del array
        /*for (int x = 0;x<=palabra.length();x++){
            String frase = "La posición %d tiene asignado el valor %s";
            System.out.println(String.format(frase,i,palabras[i]));
        }*/

        //Los dos ejemplos representan el mismo tipo de array
        String[][] multidimensional = {{"primera","posición"},{"segunda","posición"},{"tercera","posición"}};
        String[][] multidimensionalDos = new String[2][2];
        Object[][] multidimensionalTres = new Object[2][2];

        //accede al valor "primera"
        System.out.println(multidimensional[0][0]);
        //accede al valor "posición"
        System.out.println(multidimensional[1][1]);
        
        String[][] multidimensionalCuatro = {{"primera","posición"},{"segunda","posición"},{"tercera","posición"}};
        for (String[] temp : multidimensionalCuatro){
            for (int y = 0;y<temp.length;y++){
                String frase = "La posición %d tiene asignado el valor %s";
                System.out.println(String.format(frase,y,temp[y]));
            }
            
        }
        
    }
}
