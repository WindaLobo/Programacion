
package boletin33;


public class Seleccionador extends SeleccionFutbol{
    
    public Seleccionador(int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
    }
     void seleccionarXogador(){
        System.out.println("No tiene seelccion");
        
    }
      @Override
    public String toString() {
        return "\nid=" + id + ", nombre=" + nombre + ", spellido=" + apellido + ", edad=" + edad ;
    }

    
}
