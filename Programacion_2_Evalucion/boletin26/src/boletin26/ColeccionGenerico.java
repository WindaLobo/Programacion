package boletin26;

import com.windar.datos.PedirDatos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ColeccionGenerico<T> {

    public <T> void agregar(T elemento, ArrayList<T> lista) {
        lista.add(elemento);
    }

    public void mostrar(ArrayList<T> lista) {
        for (T elemento : lista) {
            System.out.println("Los elemetos son : " + elemento);
        }
    }

    public void minimaLista(ArrayList<T> lista) {
        System.out.println("Minima es: " + Collections.min(lista, null));
    }

    public void maximoLista(ArrayList<T> lista) {
        System.out.println("Maxima es  : " + Collections.max(lista, null));
    }

    public void buscar(T elemento, ArrayList<T> lista) {

        if (lista.indexOf(elemento) >= 0) {
            System.out.println("El elemento " + elemento + " está en la lista");
        } else {
            System.out.println("El elemento " + elemento + " NO está en la lista");
        }
    }

    public static <T> void ordenar(ArrayList<T> lista) {
        lista.sort((Comparator<? super T>) Comparator.naturalOrder());
        for (T elemento : lista) {
            System.out.println(elemento);
        }

    }

    public void eliminar(ArrayList<T> lista, T elemento) {
        if (elemento == elemento) {
            lista.remove(elemento);
           
        } else {
            System.out.println("No se encontro");
        }

    }
}
