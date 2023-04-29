
package boletin33;

public abstract class SeleccionFutbol  implements IntegranteSeleccionDeFutbol {
   protected int id;
   protected String nombre;
   protected String apellido;
   protected int edad;

    public SeleccionFutbol(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSpellido() {
        return apellido;
    }

    public void setSpellido(String spellido) {
        this.apellido = spellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public void concentrarse() {
        System.out.println("No se concentra en el partido");
    }

    @Override
    public void viajar() {
        System.out.println("Viajar");
    }

   
    @Override
    public void entrenar() {
        System.out.println("Entrenar");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Juega en el partido");
    }

    @Override
    public String toString() {
        return "\nId: " + id + "\nNombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad ;
    }
    
   
  
}
