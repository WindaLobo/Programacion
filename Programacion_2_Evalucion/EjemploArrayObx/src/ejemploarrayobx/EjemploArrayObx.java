package ejemploarrayobx;


import com.windar.datos.PedirDatos;
import java.util.ArrayList;

public class EjemploArrayObx {

    public static void main(String[] args){
        Metodos metodos= new Metodos();
    
           ArrayList <Xogador> listaJuagdores= new ArrayList<>();
           int op;
        do{
                op= PedirDatos.pedirInt("1 Añadir \n2 mostrar \n3 ver con Foreach \n4 con for nomral \n5 ver con iteraro \n6 buscar"
                        + " \n7 Borrar \n8 Borra otra opcion \n9 Salir");
                switch(op){
                    case 1 : metodos.agregar(listaJuagdores);
                    break;
                    case 2: metodos.mostrar1(listaJuagdores);
                    break;
                    case 3 : metodos.mostar2(listaJuagdores);
                    break;
                    case 4 : metodos.mostrar3(listaJuagdores);
                    break;
                    case 5 : metodos.mostrar4(listaJuagdores);
                    break ;
                    case 6: metodos.buscarJugador(listaJuagdores);
                    break;
                    case 7: metodos.borrarJugador(listaJuagdores);
                    break;
                    case 8: metodos.borarJugador2(listaJuagdores);
                    break;
                    default:
                        System.out.println("Salir");
                }
                 
    }while(op<8);
    }
    

}