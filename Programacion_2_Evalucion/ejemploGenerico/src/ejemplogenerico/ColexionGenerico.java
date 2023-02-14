package ejemplogenerico;

import java.util.ArrayList;

import java.util.Comparator;


public class ColexionGenerico<T> {
    public <T>void agregar(T elemento,ArrayList<T>lista){
        lista.add(elemento);
        
    }
    public static  <T> void amorsar(ArrayList<T>lista){
        for(T elemento:lista){
            System.out.println(elemento);
        }
    }
     public static <T>  void ordenar(ArrayList<T>lista){
     lista.sort((Comparator<? super T>) Comparator.naturalOrder());
     for(T elemento:lista){
            System.out.println(elemento);
    }
   
     }
    
}
