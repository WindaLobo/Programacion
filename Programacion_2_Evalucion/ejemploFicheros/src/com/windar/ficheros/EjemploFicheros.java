package com.windar.ficheros;

import ejemploficheros.LecturaFichero;
import java.io.File;

public class EjemploFicheros {

    public static void main(String[] args) {
        File dato = new File("numeros.txt");
        LecturaFichero obx = new LecturaFichero();
        obx.leerPalabra(dato);

    }

}
