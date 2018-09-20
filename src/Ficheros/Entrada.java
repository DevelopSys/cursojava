package Ficheros;

import java.io.*;
import java.util.ArrayList;

public class Entrada {


    public static void main(String[] args) {
        File f = new File("src/Ficheros/documentos/ejemplo.txt");
        File f2 = new File("src/Ficheros/documentos/ejemplo1.docx");
        File f3= new File("src/Ficheros/documentos/ejemplo1.obj");
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            //lecturaFichero(f);
            //lecturaFicheroFiltro(f);
            //escrituraFichero(f);
            //lecturaFicheroFInput(f);
            //escrituraFicheroFInput(f);
            //lecturaFicheroDInput(f);
            //escrituraFicheroDOutput(f2);
            //escrituraFicheroOOutput(f3);
            lecturaFicheroOOutput(f3);
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

    public static void lecturaFicheroFiltro(File f) {
        FileReader fr = null;
        try {
            fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();
            int posicion = linea.indexOf(',');

            while (linea != null) {
                String parteUno = linea.substring(0, posicion);
                String parteDos = linea.substring(posicion + 1);
                linea = br.readLine();
            }

            fr.close();

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

    public static void lecturaFicheroFInput(File f) {

        try {
            FileInputStream fis = new FileInputStream(f);
            int caracteres;
            byte[] caracterByte = new byte[1];
            while ((caracteres = fis.read(caracterByte)) != -1) {
                //debolución byte combertido a coódigo ASCII
                System.out.println((char) caracteres);
                System.out.println(new String(caracterByte));

            }

            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void escrituraFicheroFInput(File f) {

        try {
            FileOutputStream fos = new FileOutputStream(f);
            String texto = "ejemplo de texto a guardar codificado en bytes";
            byte[] caracterByte = texto.getBytes();
            System.out.println(caracterByte);
            fos.write(caracterByte);
            fos.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void lecturaFicheroDInput(File f) {
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream(f));
            int edad = dis.readInt();
            char separador = dis.readChar();
            dis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void escrituraFicheroDOutput(File f) {
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(f));
            dos.writeChars("Ejemplo de escritura");
            dos.writeChar('\n');
            dos.writeInt(100);
            dos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void escrituraFicheroOOutput(File f) {

        ArrayList<Producto> listaProductos = new ArrayList<Producto>();
        listaProductos.add(new Producto("Nombre1", "Descripcion1", 12));
        listaProductos.add(new Producto("Nombre2", "Descripcion2", 23));
        listaProductos.add(new Producto("Nombre3", "Descripcion3", 43));
        listaProductos.add(new Producto("Nombre4", "Descripcion4", 62));
        listaProductos.add(new Producto("Nombre5", "Descripcion5", 145));
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
            oos.writeObject(listaProductos);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }public static void lecturaFicheroOOutput(File f) {

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
            Object o = ois.readObject();
            for (Producto p: (ArrayList<Producto>)o
                 ) {
                System.out.println(p.getNombre());
            }
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
