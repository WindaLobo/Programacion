package boletin27;
import com.windar.datos.PedirDatos;
import java.io.IOException;

public class Boletin27 {

    public static void main(String[] args) throws Exception {
         
        Mantenimeinto.cargarTodos();

        int Opcion = 0;

        do {
            try {
                Opcion = PedirDatos.pedirInt("1- Añadir un Libro \n2- Consultar precio \n3- Borrar libro con precio 0 "
                        + "\n4- Modificar precio libro \n5- Mostar todo \n6- salir ");

                switch (Opcion) {
                    case 1:
                        Biblioteca.añadirLibro();
                        break;
                    case 2:
                        Biblioteca.consultarPrecio();
                        break;
                    case 3:
                        Biblioteca.borrarLibroConPrecioCero();
                        break;
                    case 4:
                        Biblioteca.cambiarPrecio();
                        break;
                    case 5:
                        Mantenimeinto.mostrar();
                        break;
                    default:
                        System.out.println(" ********* Fin del programa ******** ");
                }
            }
            catch (IOException ex) {
                System.out.println("Error de lectura del archivo");
            }
            catch (Exception ex) {
                System.out.println(ex.getMessage());
            } 
        } while (Opcion < 6);
    }
}
