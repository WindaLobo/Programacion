
package boletin33;


public class Entrenador extends SeleccionFutbol {
    
    private int idFederacio;

    public Entrenador(int id, String nombre, String apellido, int edad,int idFederacion) {
        super(id, nombre, apellido, edad);
        this.idFederacio=idFederacion;
    }

    public int getIdFederacio() {
        return idFederacio;
    }

    public void setIdFederacio(int idFederacio) {
        this.idFederacio = idFederacio;
    }
    
    void planificarEntrenamiento(){
        System.out.println("No tiene planifacion");
        
    }

     @Override
    public String toString() {
        return  "\nIdFederacio: " + idFederacio + "\nId: " + id + "\nNombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad ;
    }

}
