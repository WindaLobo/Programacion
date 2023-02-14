
package boletin26;


public class Elemtos <Elemntos> {
    private String nombre;
    private Elemntos numero;

    public Elemtos() {
    }

    public Elemtos(String nombre, Elemntos numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Elemntos getNumero() {
        return numero;
    }

    public void setNumero(Elemntos numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return  nombre + ", numero=" + numero ;
    }
    
    
}
