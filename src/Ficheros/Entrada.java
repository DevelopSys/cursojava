package Ficheros;

import java.io.*;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        File f = new File("src/Ficheros/documentos/ejemplo.txt");
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            //lecturaFichero(f);
            lecturaFicheroFiltro(f);
            escrituraFichero(f);
        }


    }

    public static void lecturaFichero(File f) {
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            String linea = br.readLine();

            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();
            fr.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void lecturaFicheroFiltro(File f){
        FileReader fr = null;
        try {
            fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();
            int posicion = linea.indexOf(',');

            while (linea!=null){
                String parteUno = linea.substring(0,posicion);
                String parteDos = linea.substring(posicion+1);
                linea = br.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void escrituraFichero(File f) {
        try {
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.append("Ejemplo de escritura en fichero");
            bw.newLine();
            bw.append("mediante flujo de control java");
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
