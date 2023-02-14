package boletin26;


import com.windar.datos.PedirDatos;
import java.util.ArrayList;




public class ColexionGenerico{ 
 public void agregar(ArrayList<Elemtos> listaEnteros) {
        Elemtos lista= new Elemtos(PedirDatos.pedirString("nombre :"), PedirDatos.pedirInt("numero"));
        listaEnteros.add(lista);
    }

   public   void amorsar(ArrayList<Elemtos> listaEnteros){
        for(Elemtos elemento:listaEnteros){
            System.out.println(elemento);
        }
   }
  
       
       
   }
   

    

