package com.windar.ficheros;

import ejemploficheros.LecturaFichero;
import java.io.File;

public class EjemploFicheros {

    public static void main(String[] args) {
        File dato = new File("numeros.txt");
        LecturaFichero obx = new LecturaFichero();
        obx.leerPalabra(dato);
              
        //ArrayList
        File n = new File("alumno.txt");
        obx.leerlinas(n);
        
        
        //arrayList teniendo fichero con comas
        File x= new File("numeros3.txt");
      
       
       // obx.lerNumeroDelimitadores(n);
      
        
        //File al = new File("alumnos.txt");
        //LerFicheiros obx = new LerFicheiros();
        
       // obx.lerObxecto(al);
 
    
}

    }


