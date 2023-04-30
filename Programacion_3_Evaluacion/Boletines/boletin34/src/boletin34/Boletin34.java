package boletin34;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JOptionPane;

public class Boletin34 {

    public static void main(String[] args) {

        String[] opciones = {"Contratado", "Permanente", "Visualizar", "Salir"};
        String Opcion = "";
        ArrayList<Empleado> empleados = new ArrayList<>();

        do {
            
            Opcion = (String) JOptionPane.showInputDialog(null, "Empresa ServiSoft", "Opcion",
                    JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            if (Opcion == null) {
                break;
            }

            switch (Opcion.toUpperCase()) {

                case "CONTRATADO":
                    empleados.add(datosIntroducido(false));
                    break;

                case "PERMANENTE":
                    empleados.add(datosIntroducido(true));
                    break;

                case "VISUALIZAR":

                    if (empleados.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay empleados registrados");
                    } else {
                        Empleado emp = empleados.get(empleados.size() - 1);
                        if (emp instanceof Contratado) {
                            Contratado contratado = (Contratado) emp;
                            JOptionPane.showMessageDialog(null, "\n Empleado Contratado: " + emp.toString() + "\n El salario basico: €" + contratado.calcularSalario());
                        } else if (emp instanceof Permanente) {
                            Permanente permanente = (Permanente) emp;
                            JOptionPane.showMessageDialog(null, "\n Empleado Permanente: " + emp.toString() + "\n El salario basico: €" + permanente.calcularSalario());
                        }
                    }
                    break;

                case "SALIR":
                    
                    break;
            }
        } while (!Opcion.equalsIgnoreCase("SALIR"));
    }
    
    private static Empleado datosIntroducido(boolean esPermanente) {

        String dniIntroducido = JOptionPane.showInputDialog("Introduce el dni :");

        String nombreIntroducido = JOptionPane.showInputDialog("Introduce su nombre :");

        String apellidosIntroducido = JOptionPane.showInputDialog("Introduce sus apelldios :");

        double salarioBaseIntroducido = Double.parseDouble(JOptionPane.showInputDialog("Introduce el Salario Base :"));

        String fehcaContratacion = JOptionPane.showInputDialog("Introduce la Fecha DD/MM/YYYY :");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(fehcaContratacion, formatter);

        if (esPermanente) {
            int ClienteContratado = Integer.parseInt(JOptionPane.showInputDialog("Introduce Los cliente contratados :"));
            return new Permanente(dniIntroducido, nombreIntroducido, apellidosIntroducido, ClienteContratado, salarioBaseIntroducido, date);

        }

        return new Contratado(dniIntroducido, nombreIntroducido, apellidosIntroducido, salarioBaseIntroducido, date);

    }
}
