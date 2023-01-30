package boletin22;


public class Futbol {

    public static final int JORNADA = 36;
    public final String[] EQUIPO = new String[]{"Celta", "Bilbao", "Malaga", "Malaga", "R.Madrid", "R.sociedad",
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

   /* public MarcadorEquipo[] sumaGoles() {
        MarcadorEquipo[] Nombre = new MarcadorEquipo[EQUIPO.length];

        int golSuma;

        System.out.println("****** Total de goles de la  Liga 2022 ******:");
        String titulo = "Equipo    " + "  N° ";

        System.out.println(titulo);

        for (int i = 0; i < EQUIPO.length; i++) {
            golSuma = 0;
            System.out.println(ajustarCadena(EQUIPO[i], 11) + ": ");

            for (int j = 0; j < JORNADA; j++) {
                golSuma += goles[i][j];
            }
            MarcadorEquipo obx = new MarcadorEquipo(EQUIPO[i], golSuma);
            Nombre[i] = obx;
        }
       
        return Nombre;
    }*/

   public String  marcadorGolesMaximo(int goles[][]) {
       int golMarcado=200;
       int sumaGoles=0;
        for (int i = 0; i < EQUIPO.length; i++) {
            for (int j = 0; j < JORNADA; j++) {
          sumaGoles +=goles[i][j];
                if ( sumaGoles>golMarcado) {
                    golMarcado=goles[i][j];
                    System.out.print(JORNADA);
                } 
            }
            System.out.println("");
            }
        return null;
     
        }

      }
