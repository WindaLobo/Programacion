package ejemploarrayobx;

import com.windar.datos.PedirDatos;
import java.util.ArrayList;
import java.util.Iterator;

public class Metodos {

    public ArrayList<Xogador> agregar(ArrayList<Xogador> listaJuagdores) {
        Xogador xo = new Xogador(PedirDatos.pedirString("nombre :"), PedirDatos.pedirInt("numero"));
        listaJuagdores.add(xo);

        return listaJuagdores;

    }

    public void mostrar1(ArrayList<Xogador> agregar) {
        System.out.println(agregar);
    }

    public void mostar2(ArrayList<Xogador> agregar) {
        for (Xogador elemento : agregar) {
            System.out.println(elemento);
        }
    }

    public void mostrar3(ArrayList<Xogador> agregar) {
        //For
        for (int i = 0; i < agregar.size(); i++) {
            System.out.println(agregar.get(i));
        }
    }

    public void mostrar4(ArrayList<Xogador> agregar) {
        //con iterato

        Iterator it = agregar.iterator();
        while (it.hasNext()) {
            // Xogador aux=(Xogador)it.next();

            // System.out.println(aux);
            System.out.println(it.next());
        }
    }

    public int  buscarJugador(ArrayList<Xogador> agregar) {
        int numeroBuscado = PedirDatos.pedirInt("Que numero buscas : ");
        int atopado = 0;// no se atopo
        for (Xogador elemento : agregar) {
            if (numeroBuscado == elemento.getDorsal()) {
                System.out.println(" el jugador se llama : " + elemento.getNombre());
                atopado = 1;
            }

        }
        if (atopado == 0) {
            System.out.println("El jugador no esta en el equipo");

        }
        return atopado;

    }

    public void borrarJugador(ArrayList<Xogador> agregar) {
        String nombreBuscado = PedirDatos.pedirString("Que jugador quieres eliminar");
        
       Iterator nombre = agregar.iterator();
        while (nombre.hasNext()) {
            if (nombre.next().equals(nombreBuscado)) {
                nombre.remove();
            }
            
        }
       
    }
     public void  borarJugador2(ArrayList<Xogador> agregar) {
         int buscar = buscarJugador(agregar);
         if(buscar==1){
        String nombreBuscado = PedirDatos.pedirString("Que jugador quieres eliminar");
        System.out.println("Borrado");
       Iterator nombre = agregar.iterator();
        while (nombre.hasNext()) {
            if (nombre.next().equals(nombreBuscado)) {
                nombre.remove();
                
            }
        }
         }
         
        
        
}
}
