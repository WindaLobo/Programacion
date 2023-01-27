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
        System.out.println("Digite la matriz");

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {

                notas[i][j] = Integer.parseInt(JOptionPane.showInputDialog(" Introduce la nota "));

            }
        }

        return notas;

    }

    public void visualizar(int notas[][]) {
        for (int i = 0; i < notas.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < notas.length; j++) {
                System.out.print("La matriz  [" + i + "][" + j + "] : ");
                System.out.println("La nota es : " + notas[i][j]);

            }

        }
    }

    public float[][] MediaAlumno(int notas[][]) {
        int acumulador = 0;
        float[] lista = new float[notas.length];

        for (int i = 0; i < notas.length; i++) {
            acumulador = 0;
            for (int j = 0; j < notas[i].length; j++) {
                acumulador = acumulador + notas[i][j];

            }
            System.out.println("La suma de la media es : " + acumulador);
            lista[i] = acumulador / notas[i].length;
            System.out.println("La matriz  [" + i + "]" + lista[i]);
        }
        return null;
    }

}
