package boletin22;

public class Main {

    public static void main(String[] args) {
        Futbol ful = new Futbol();
        int[][] aux;
        aux = ful.crearMarcador();
        ful.visualizarMarcador(aux);
      ful.sumaGoles();
     // ful.marcadorGolesMaximo(aux);

       
        
    }

}
