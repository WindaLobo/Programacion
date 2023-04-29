package boletin33;

public class Masajista extends SeleccionFutbol {

    private String titulacion;
    private int añoDeExperiencia;

    public Masajista(int id, String nombre, String apellido, int edad, String titulacion, int añoDeExperiencia) {
        super(id, nombre, apellido, edad);
        this.añoDeExperiencia = añoDeExperiencia;
        this.titulacion = titulacion;
    }

    void darMasaje() {
        System.out.println("Le toca  un masaje");

    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAñoDeExperiencia() {
        return añoDeExperiencia;
    }

    public void setAñoDeExperiencia(int añoDeExperiencia) {
        this.añoDeExperiencia = añoDeExperiencia;
    }

    @Override
    public String toString() {
        return "\nId: " + id + "\nNnombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad +"\nTitulacion: " + titulacion + "\na\u00f1oDeExperiencia: " + añoDeExperiencia ;
    }

 

}
