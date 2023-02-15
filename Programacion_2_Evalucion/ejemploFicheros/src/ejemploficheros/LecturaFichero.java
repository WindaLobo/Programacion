package ejemploficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaFichero {

    Scanner scann;

    public void leerPalabra(File fichero) {
        try {
            scann = new Scanner(fichero);
            while (scann.hasNext()) {
                String dato = scann.next();
                System.out.println(dato);

            }

        } catch (FileNotFoundException ex) {
            System.out.println("error 1" + ex.getMessage());
        } finally {
            scann.close();
        }

    }

}
