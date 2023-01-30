package boletin22;

public class Futbol {

    public static final int JORNADA = 36;
    public final String[] EQUIPO = new String[]{"Celta", "Bilbao", "Barcelona", "Malaga", "R.Madrid", "R.sociedad",
        "Atletico ", "Villareal", "Beltis", "Osasuna", "Athletic", "Rayo", "Mallorca", "Almeria", "Girona", "Valencia", "Espanyol", "Getafe", "Valladolid", "Cadiz", "Elche"};
    private final int[][] goles = new int[EQUIPO.length][JORNADA];

    public int[][] crearMarcador() {

        for (int i = 0; i < EQUIPO.length; i++) {
            for (int j = 0; j < JORNADA; j++) {
                int numeroLeatorio = (int) (Math.random() * 6);
                goles[i][j] = numeroLeatorio;
            }
        }
        return goles;
    }

    public void visualizarMarcador(int goles[][]) {
        String titulo = "Equipo    ";
        for (int j = 0; j < JORNADA; j++) {
            titulo += " X" + (j + 1);
        }
        System.out.println(titulo);

        for (int i = 0; i < EQUIPO.length; i++) {
            System.out.print(ajustarCadena(EQUIPO[i], 12));
            for (int j = 0; j < JORNADA; j++) {
                String gol = Integer.toString(goles[i][j]);
                if (j > 9) {
                    System.out.print(ajustarCadena(gol, 3) + "|");
                } else {
                    System.out.print(ajustarCadena(gol, 2) + "|");

                }

            }
            System.out.println("");
        }

    }

    private String ajustarCadena(String cadena, int tamaño) {
        int tamañoCadena = cadena.length();
        String espacio = " ";
        String espacios = espacio.repeat(tamaño - tamañoCadena); // repeated es para repetir las cadenas n veces las veces q  le pases por parametros

        return cadena + espacios;
    }

    public int golesJornadas(int goles[][]) {
        int maximoGoles;
        int indice = 0;

        System.out.println("****** Total de goles de la  Liga 2022 ******:");

        for (int j = 0; j < JORNADA; j++) {
            maximoGoles = 0;

            for (int i = 0; i < EQUIPO.length; i++) {
                if (goles[i][j] > maximoGoles) {
                    maximoGoles = goles[i][j];
                    indice = i;
                }
            }
            System.out.print("X" + (j + 1) + " : " + EQUIPO[indice] + "\n");
        }
        return 0;
    }

    public void equipoMasGoles(int goles[][]) {
        int maximoGoles = 0;

        System.out.println("\n****** Registro con mas goles en cada  jornadas de la  Liga 2022 ******:");
        for (int i = 0; i < EQUIPO.length; i++) {
            for (int j = 0; j < JORNADA; j++) {
                if (goles[i][j] > maximoGoles) {
                    maximoGoles = goles[i][j];
                }
            }
        }

        for (int i = 0; i < EQUIPO.length; i++) {
            for (int j = 0; j < JORNADA; j++) {
                if (goles[i][j] == maximoGoles) {
                    System.out.print("\n" + "X" + (j + 1) + " : " + EQUIPO[i] + " Goles: " + maximoGoles );
                }
               
            }
        }
        
    }
}
