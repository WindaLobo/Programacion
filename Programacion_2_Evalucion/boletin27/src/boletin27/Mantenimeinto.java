package boletin27;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Mantenimeinto {

    public static ArrayList<Libro> libros = new ArrayList<>();

    public static void cargarTodos() throws Exception {
        File archivo = new File("Libro.txt");
        Scanner scanner = new Scanner(archivo);
        try {
            while (scanner.hasNextLine()) {
                String[] camposDeArchivo = scanner.nextLine().split(",");
                libros.add(new Libro(camposDeArchivo[0], camposDeArchivo[1], Float.parseFloat(camposDeArchivo[2]),
                        Integer.parseInt(camposDeArchivo[3])));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void añadirLibro(Libro libro) throws IOException {
        File archivo = new File("Libro.txt");// representa el archivo File es un objecto
        FileWriter escritorArchivor = new FileWriter(archivo.getAbsoluteFile(), true);// es un obejcto para escribir un archivo
       BufferedWriter bw  = new BufferedWriter(escritorArchivor);
        bw.write(libro.toString());
           bw.close();
           escritorArchivor.close();

    }

    public static void consutarFichero() {
        File archivo = new File("Libro.txt");
   if (!archivo.exists()) {
    System.out.println("OJO: ¡¡No existe el archivo de configuración!!");
}

    }

}
