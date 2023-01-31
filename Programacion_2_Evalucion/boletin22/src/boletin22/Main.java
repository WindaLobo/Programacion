package boletin22;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Futbol futbol= new Futbol();
        int[][] goles = null;
         goles = futbol.crearMarcador();
        //ful.visualizarMarcador(goles);
        //ful.golesJornadas(goles);
        // ful.equipoMasGoles(goles);
       //futbol.ConsultasEquipoJornada(goles);
      
        
     int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("***** MENU *****\n1--> Crear Marcadador \n2 ---> "
                    + "VerGolesDeJornadas\n3 ---> EquipoConMasGoles \n4 ----> Consulta Jornada \n35---> ordenar "));

            switch (opcion) {
                case 1:
                    goles = futbol.crearMarcador();
                    break;
                case 2:
                     futbol.golesJornadas(goles);
                    break;
                case 3:
                    futbol.equipoMasGoles(goles);
                    break;

                /*case 4:
                    futbol.ConsultasEquipoJornada(goles);
                    break;*/
                   case 5:
                     futbol.ordenar(goles);
                    break;
                   
                    

            }
        } while (opcion <= 6);

    }
}
