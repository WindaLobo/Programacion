package boletin26;

import com.windar.datos.PedirDatos;
import java.util.ArrayList;

public class Aplicacion {

    public static void main(String[] args) {

        ColeccionGenerico<Integer> objectoLista = new ColeccionGenerico<>();
        ArrayList<Integer> lista = new ArrayList();

        int canidadNumeros = PedirDatos.pedirInt(" Cuantos numeros quieres introduir ");
        for (int i = 0; i < canidadNumeros; i++) {
            int numero = PedirDatos.pedirInt("introduce un numero");
            objectoLista.agregar(numero, lista);
        }

        objectoLista.mostrar(lista);
        objectoLista.minimaLista(lista);
        objectoLista.maximoLista(lista);
        //objectoLista.ordenar(lista);

        int canidadNumerosBuscador = PedirDatos.pedirInt(" Cuantos numeros quieres introduir ");
        for (int i = 0; i < canidadNumerosBuscador; i++) {
            int numero = PedirDatos.pedirInt("introduce un numero");
            objectoLista.buscar(numero, lista);
        }
        int usuario = PedirDatos.pedirInt("Quieres eliminar? \n1---> Si \n2---> Salir");
        do {
            switch (usuario) {
                case 1:

                    int numero = PedirDatos.pedirInt("Introduce un numero  : ");
                    objectoLista.eliminar(lista, numero);
                    objectoLista.mostrar(lista);
                    break;

                default:
                    System.out.println("Salir");

            }

        } while (usuario > 1);
    }
}
