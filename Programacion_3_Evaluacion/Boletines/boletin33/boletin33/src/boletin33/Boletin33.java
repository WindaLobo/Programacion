package boletin33;

import java.util.ArrayList;

public class Boletin33 {

    public static void main(String[] args) {

        ArrayList<SeleccionFutbol> seleccionFutbol = new ArrayList<>();
        SeleccionFutbol futbolista = new Futbolista(1, "Juan", "Lopez", 35, 5, "d");
        seleccionFutbol.add(futbolista);

        for (SeleccionFutbol seleccionFutbolista : seleccionFutbol) {
            System.out.println("\n Futbolista: " + seleccionFutbolista.toString());

            if (seleccionFutbolista instanceof Futbolista) {// Comprueba si seleccion futbolista es un objecto futbolista con instanceof(palabra reservada);
                Futbolista futbol = (Futbolista) seleccionFutbolista;
                futbol.entrevista();
            }
            seleccionFutbolista.concentrarse();
            seleccionFutbolista.entrenar();
            seleccionFutbolista.jugarPartido();
            seleccionFutbolista.viajar();
        }

        ArrayList<SeleccionFutbol> seleccionEntrenador = new ArrayList<>();
        SeleccionFutbol entrenador = new Entrenador(2, "Pedro", "Mendez", 18, 25);
        seleccionEntrenador.add(entrenador);

        for (SeleccionFutbol entrenadorFutbol : seleccionEntrenador) {
            System.out.println(" \nEntrenador:" + entrenadorFutbol.toString());
            if (entrenadorFutbol instanceof Entrenador) {// Comprueba si seleccion futbolista es un objecto futbolista con instanceof(palabra reservada);
                Entrenador futbolEntrenador = (Entrenador) entrenadorFutbol;
                futbolEntrenador.planificarEntrenamiento();
            }
            entrenadorFutbol.concentrarse();
            entrenadorFutbol.entrenar();
            entrenadorFutbol.jugarPartido();
            entrenadorFutbol.viajar();
        }

        ArrayList<SeleccionFutbol> seleccionMasajista = new ArrayList<>();
        SeleccionFutbol masajista = new Masajista(2, "Jesus", "Mendez", 16, "Portero", 5);
        seleccionMasajista.add(masajista);

        for (SeleccionFutbol seleccionmasajista : seleccionMasajista) {
            System.out.println(" \nMasajista:" + seleccionmasajista.toString());
             if (seleccionmasajista instanceof Masajista) {// Comprueba si seleccion futbolista es un objecto futbolista con instanceof(palabra reservada);
                Masajista masajistaFutbol = (Masajista) seleccionmasajista;
                masajistaFutbol.darMasaje();
            }
            seleccionmasajista.concentrarse();
            seleccionmasajista.entrenar();
            seleccionmasajista.jugarPartido();
            seleccionmasajista.viajar();

        }

        ArrayList<SeleccionFutbol> seleccion = new ArrayList<>();
        SeleccionFutbol seleccionador = new Seleccionador(2, "Jesus", "Mendez", 21);
        seleccion.add(seleccionador);

        for (SeleccionFutbol seleccionSeleccion : seleccion) {
            System.out.println(" \nSeleccionista:" + seleccionSeleccion.toString());
             if (seleccionSeleccion instanceof Seleccionador) {// Comprueba si seleccion futbolista es un objecto futbolista con instanceof(palabra reservada);
                Seleccionador seleccionDeFutbolista = (Seleccionador) seleccionSeleccion;
                seleccionDeFutbolista.seleccionarXogador();
            }
            seleccionSeleccion.concentrarse();
            seleccionSeleccion.entrenar();
            seleccionSeleccion.jugarPartido();
            seleccionSeleccion.viajar();

        }
    }
}
