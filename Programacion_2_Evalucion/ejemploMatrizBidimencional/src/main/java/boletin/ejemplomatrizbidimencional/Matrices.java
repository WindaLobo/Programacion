package boletin.ejemplomatrizbidimencional;

import java.util.Random;
import javax.swing.JOptionPane;

public class Matrices {

    public int[][] notas() {
        int notas[][], fila, columna;

        fila = Integer.parseInt(JOptionPane.showInputDialog("Introduce la fila "));
        columna = Integer.parseInt(JOptionPane.showInputDialog("Introduce la columna "));
        notas = new int[fila][columna];
        Random num = new Random();
        System.out.println("Intodusca las notas ");

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {

                notas[i][j] = Integer.parseInt(JOptionPane.showInputDialog(" Introduce la nota "));

            }
        }

        return notas;

    }

    public void visualizar(int notas[][]) {

        System.out.println("****** Notas 2023 ******:");
        String titulo = "Modulos    " + "    Notas ";

        System.out.println(titulo);

        for (int i = 0; i < notas.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < notas.length; j++) {
                System.out.print("La matriz  [" + i + "][" + j + "] : ");
                System.out.println("La nota es : " + notas[i][j]);

            }

        }
    }

    public float[][] mediaAlumno(int notas[][]) {
        int acumulador;
        float[] lista = new float[notas.length];

        for (int i = 0; i < notas.length; i++) {
            acumulador = 0;
            for (int j = 0; j < notas[i].length; j++) {
                acumulador = acumulador + notas[i][j];

            }
            System.out.println("La suma de las notas es : " + acumulador);
            lista[i] = acumulador / notas[i].length;
            System.out.println("La media es :  " + lista[i]);
        }
        return null;
    }

    public float[] mediaModulo(int notas[][]) {

        int acumulador;
        float[] modulo = new float[notas.length];

        for (int i = 0; i < notas.length; i++) {
            acumulador = 0;
            for (int j = 0; j < notas.length; j++) {
                acumulador = acumulador + notas[j][i];

            }
            //System.out.println("La suma de las notas es : " + acumulador);
            modulo[i] = acumulador / notas.length;
            System.out.println("La media es :  " + modulo[i]);

        }
        return null;

    }

    private String ajustarCadena(String cadena, int tamaño) {
        int tamañoCadena = cadena.length();
        String espacio = " ";
        String espacios = espacio.repeat(tamaño - tamañoCadena);
        return null;
    }
}
