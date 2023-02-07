
package boletin24;

import com.windar.metodos.Metodos;
import com.windar.metodos.Libro;
import com.windar.datos.PedirDatos;
import java.util.ArrayList;


public class boletin24 {

    
    public static void main(String[] args) {
                Metodos libros = new Metodos();

        ArrayList<Libro> libro = new ArrayList<>();

        int Opcion;
        do {
            Opcion = PedirDatos.pedirInt("1- Añadir \n2- Mostar \n3- Eliminar \n4- Ordenar  \n5- Salir");
            switch (Opcion) {
                case 1: 
                    libros.libro(libro);
                break;
                 case 2: libros.mostrar1(libro);
                break;
                case 3: libros.eliminar(libro);
                break;
                case 4: libros.ordenar(libro);
                break;
                
                default:
                    System.out.println("Salir");
            }

        } while (Opcion < 5);
    }
    }
    

