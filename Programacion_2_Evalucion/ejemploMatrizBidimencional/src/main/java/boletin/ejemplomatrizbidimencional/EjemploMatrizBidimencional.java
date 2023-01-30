package boletin.ejemplomatrizbidimencional;

public class EjemploMatrizBidimencional {

    public static void main(String[] args) {
        Matrices obx = new Matrices();
        int[][] aux;
        aux = obx.notas();
        obx.mediaAlumno(aux);
        obx.visualizar(aux);
        obx.mediaModulo(aux);

    }
}
