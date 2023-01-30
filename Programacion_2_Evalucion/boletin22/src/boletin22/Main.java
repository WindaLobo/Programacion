package boletin22;





public class Main {

    public static void main(String[] args) {
        Futbol ful = new Futbol();
        int[][] goles;
        goles = ful.crearMarcador();
        ful.visualizarMarcador(goles);
      // ful.golesJornadas(goles);
       ful.equipoMasGoles(goles);
    
   
       
         
   

    }

}
