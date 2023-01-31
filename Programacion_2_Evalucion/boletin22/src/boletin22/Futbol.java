package boletin22;

import javax.swing.JOptionPane;

public class Futbol {

    public static int JORNADA = 36;
    public final String[] EQUIPO = new String[]{"Celta", "Bilbao", "Barcelona", "Malaga", "Madrid", "R.sociedad",
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

    public void golesJornadas(int goles[][]) {
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

    public void ordenar(int goles[][], String[] EQUIPO) {
        int sumaGolesTotal;
        int golesOrdenados;
        ;
        int sumaGolesOrdenados;
        String nombreEQuipo;

        int sumaGole[] = new int[EQUIPO.length];

        for (int i = 0; i < EQUIPO.length; i++) {
            sumaGolesTotal = 0;
            for (int j = 1; j < JORNADA; j++) {
                sumaGolesTotal += goles[i][j];
            }
            sumaGole[i] = sumaGolesTotal;
            System.out.println(EQUIPO[i] + " " + sumaGole[i]);

        }
        for (int i = 0; i < EQUIPO.length; i++) {
            for (int j = i + 1; j < sumaGole.length; j++) {
                if (sumaGole[i] > sumaGole[j]) {
                    sumaGolesOrdenados = sumaGole[i];
                    sumaGole[i] = sumaGole[j];
                    sumaGole[j] = sumaGolesOrdenados;
                    nombreEQuipo = EQUIPO[i];
                    EQUIPO[i] = EQUIPO[j];
                    EQUIPO[j] = nombreEQuipo;

                    for (int x = 0; x < goles[i].length; x++) {
                        golesOrdenados = goles[i][x];
                        goles[i][x] = goles[j][x];
                        goles[j][x] = golesOrdenados;
                    }
                }

            }

        }
        System.out.println("");

    }

    public void mascacinPorJonada(int goles[][]) {

        int maximoGoles;
        int indice = 0;

        System.out.println("****** Total equipo que marca mas  goles en cada jornada 2022 ******:");

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

    }

    private String ajustarCadena(String cadena, int tamaño) {
        int tamañoCadena = cadena.length();
        String espacio = " ";
        String espacios = espacio.repeat(tamaño - tamañoCadena); // repeated es para repetir las cadenas n veces las veces q  le pases por parametros

        return cadena + espacios;
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
                    System.out.print("\n" + "X" + (j + 1) + " : " + EQUIPO[i] + " Goles: " + maximoGoles);
                }

            }
        }
        System.out.println("");

    }

    public void ConsultasEquipoJornada(int goles[][]) {
        int jornadaUsuario;
        int maximoGoles = 0;
        String usuarioNombre;
        usuarioNombre = JOptionPane.showInputDialog("Introduce el equipo");
        jornadaUsuario = Integer.parseInt(JOptionPane.showInputDialog("Introduce la jornada"));
        for (int i = 0; i < EQUIPO.length; i++) {
            for (int j = 0; j < JORNADA; j++) {
                if (usuarioNombre.equalsIgnoreCase(EQUIPO[i]) && jornadaUsuario == (j + 1)) {

                    System.out.print("\n" + "X" + (j + 1) + " " + EQUIPO[i] + "----> Goles: " + goles[i][j]);
                    break;
                }

            }

        }
    }

}
