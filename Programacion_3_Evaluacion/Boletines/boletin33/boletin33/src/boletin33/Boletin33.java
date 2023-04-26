package boletin33;

import java.util.ArrayList;

public class Boletin33 {

 
    public static void main(String[] args) {
       ArrayList<SeleccionFutbol> seleccionFutbol = new ArrayList<>();
        SeleccionFutbol futbol= new Futbolista(1, "Juan", "Lopez", 35, 5, "d");
        seleccionFutbol.add(futbol);

        for (SeleccionFutbol seleccionfutbol : seleccionFutbol) {
            System.out.println("\n Futbolista: "+seleccionfutbol.toString());

            seleccionfutbol.concentrarse();
            seleccionfutbol.entrenar();
            seleccionfutbol.jugarPartido();
            seleccionfutbol.viajar();
         

        }
        
  ArrayList<SeleccionFutbol> seleccionEntrenador = new ArrayList<>();
       SeleccionFutbol entrenador= new Entrenador(2,"Pedro","Mendez",18,25);
         seleccionEntrenador.add(entrenador);

        for (SeleccionFutbol futbolt : seleccionEntrenador) {

            System.out.println(" \nEntrenador:" +futbolt.toString());

            futbolt.concentrarse();
            futbolt.entrenar();
            futbolt.jugarPartido();
            futbolt.viajar();
         

        }
        ArrayList<SeleccionFutbol> seleccionMasajista = new ArrayList<>();
       SeleccionFutbol masajista= new Masajista(2,"Jesus","Mendez",16,"Portero",5);
      
         seleccionMasajista.add(masajista);

        for (SeleccionFutbol seleccionmasajista : seleccionMasajista) {

            System.out.println(" \nMasajista:" +seleccionmasajista.toString());

            seleccionmasajista.concentrarse();
            seleccionmasajista.entrenar();
            seleccionmasajista.jugarPartido();
            seleccionmasajista.viajar();
         

        }
         ArrayList<SeleccionFutbol> seleccionSeleccionador = new ArrayList<>();
       SeleccionFutbol seleccionador= new Seleccionador(2,"Jesus","Mendez",21);
      
         seleccionSeleccionador.add(seleccionador);

        for (SeleccionFutbol seleccionSeleccion : seleccionSeleccionador) {

            System.out.println(" \nSeleccionista:" +seleccionSeleccion.toString());

            seleccionSeleccion.concentrarse();
            seleccionSeleccion.entrenar();
            seleccionSeleccion.jugarPartido();
            seleccionSeleccion.viajar();
           break;

        }
    }
}
