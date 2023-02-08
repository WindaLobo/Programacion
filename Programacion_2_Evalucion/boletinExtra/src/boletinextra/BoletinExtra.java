package boletinextra;

import com.windar.datos.PedirDatos;
import java.util.ArrayList;

public class BoletinExtra {

    public static void main(String[] args) {
        Cola impresora = new Cola();
        ArrayList<Impresora> impresoras = new ArrayList<>();

        int Opcion = 0;

        do {
            Opcion = PedirDatos.pedirInt("1- Verificar \n2- Cantidad \n3- Imprimir ");

            switch (Opcion) {
                case 1:
                    break;
            }

        } while (Opcion < 0);

    }
}
