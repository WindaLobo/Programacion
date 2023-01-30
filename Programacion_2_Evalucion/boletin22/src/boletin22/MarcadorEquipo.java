package boletin22;

public class MarcadorEquipo {

    String nombre;
    int totalGoles;

    public MarcadorEquipo(String nombre, int totalGoles) {
        this.nombre = nombre;
        this.totalGoles = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTotalGoles() {

        return totalGoles;
    }

public void marcarGol() {
    totalGoles++;
  }
}
