
package com.windar.metodos;


import com.windar.datos.PedirDatos;
import java.util.ArrayList;
import java.util.Collections;


public class Metodos {
     public void libro(ArrayList<Libro> AñadirLibros) {
 Libro libroDatos = new Libro(PedirDatos.pedirString("Titulo :"),PedirDatos.pedirString("Autor :"),  PedirDatos.pedirString("ISBN :"), 
         PedirDatos.pedirfloat("Precio :"), PedirDatos.pedirInt("Numero de unidad : "));
         AñadirLibros.add(libroDatos);
 
     }
        public void mostrar1(ArrayList<Libro> AñadirLibros) {
        System.out.println(AñadirLibros);
    }

 
      public void eliminar(ArrayList<Libro> libro) {
        String titulo= PedirDatos.pedirString("Introduce un titulo :");

        for (Libro libros: libro) {
            if (libros.getTitulo().equalsIgnoreCase(titulo)) {
                libro.remove(libros);
                break;
            }
        }
    
        
    }
         public void ordenar(ArrayList<Libro> libro){
             
         Collections.sort(libro);
       
           for (Libro libros : libro) {
            System.out.println(libros);
        }      


     }
         
        


       }
    
        

