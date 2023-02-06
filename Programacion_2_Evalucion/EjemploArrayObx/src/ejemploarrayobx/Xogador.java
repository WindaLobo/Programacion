
package ejemploarrayobx;


public class Xogador {
    private String nombre;
    private int dorsal;

    public Xogador(String nombre, int dorsal) {
        this.nombre = nombre;
        this.dorsal = dorsal;
    }

    public Xogador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        return " El nombre del jugador  : " + nombre + "\n y el numero de camiseta  es : " + dorsal;
    }
    
    
    
    
}
