
package ejemplogenerico;

public class ClaseXenerica <T>{
    private T dato;
    public ClaseXenerica(){
       
    }
    public void setDato(T valor){
        dato=valor;
    }
    public T getDato(){
        return dato;
    }
    
    @Override
    public String toString() {
        return "ClaseXenerica{" + "dato=" + dato + '}';
    }

   
}

