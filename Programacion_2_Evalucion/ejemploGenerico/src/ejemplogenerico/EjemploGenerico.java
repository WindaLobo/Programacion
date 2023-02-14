package ejemplogenerico;

import java.util.ArrayList;


public class EjemploGenerico {

   
    public static void main(String[] args) {
        /* ClaseXenerica <Xogador> obx=new ClaseXenerica();
        Xogador x=new Xogador("Aspas",9);
        obx.setDato(x);

        System.out.println(obx.getDato());*/
       /* ColexionGenerico<Integer> objectoLista = new ColexionGenerico<>();
        ArrayList<Integer> lista = new ArrayList();
        objectoLista.agregar(1, lista);
        objectoLista.agregar(2, lista);
        objectoLista.agregar(3, lista);
        ColexionGenerico.amorsar(lista);*/
       
      /* ColexionGenerico<Float> objectoLista = new ColexionGenerico<>();
        ArrayList<Float> lista = new ArrayList();
        objectoLista.agregar(1.5f,lista);
        objectoLista.agregar(2.5f, lista);
        objectoLista.agregar(3.6f, lista);
        ColexionGenerico.amorsar(lista);*/

  
     ColexionGenerico<Xogador> objectoLista = new ColexionGenerico<>();
        ArrayList<Xogador> lista = new ArrayList();
        objectoLista.agregar(new Xogador("mmmm",1),lista);
        objectoLista.agregar(new Xogador("ccc",8),lista);
        objectoLista.agregar( new Xogador("ddddd",0),lista );
        ColexionGenerico.ordenar(lista);
       
        
      
}


  }