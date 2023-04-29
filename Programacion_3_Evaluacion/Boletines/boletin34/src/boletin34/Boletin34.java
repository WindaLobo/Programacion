package boletin34;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JOptionPane;

public class Boletin34 {

    public static void main(String[] args) {
      
       
         String[] opciones = {"Contratado", "Permanente", "Salir"};
        String Opcion = "";
        
       
         do {
          
                Opcion = (String) JOptionPane.showInputDialog(null, "Empresa ServiSoft", "Opcion",
                        JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[1]);

                if (Opcion == null) {
                  break;
                }

                    switch (Opcion.toUpperCase()) {

                        case "CONTRATADO":
                             ArrayList<Empleado> empleadoLis= new ArrayList<>();
                            empleadoContratado(empleadoLis);
                            break;

                        case "PERMANENTE":
                            ArrayList<Empleado> empleadoPermanente= new ArrayList<>();
                           empleadoPermanente(empleadoPermanente);
                        
                            break;

                         case "SALIR":
                            break;
                    }

           
        } while (!Opcion.equalsIgnoreCase("SALIR"));
    }

        
    

    private static void empleadoContratado(ArrayList<Empleado> empleadoLis) {
       
        String dniIntroducido = JOptionPane.showInputDialog("Introduce el dni :");
        String nombreIntroducido = JOptionPane.showInputDialog("Introduce su nombre :");
        String apellidosIntroducido = JOptionPane.showInputDialog("Introduce sus apelldios :");
        double salarioBaseIntroducido = Double.parseDouble(JOptionPane.showInputDialog("Introduce el Salario Base :"));
        String fehcaContratacion = JOptionPane.showInputDialog("Introduce la Fecha DD/MM/YYYY :");
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(fehcaContratacion, formatter);
        Empleado empleados = new Contratado(dniIntroducido, nombreIntroducido, apellidosIntroducido, salarioBaseIntroducido, date);
        empleadoLis.add(empleados);
        
        for (Empleado empleadoLista : empleadoLis) {
           JOptionPane.showMessageDialog(null,"\n Empleado Permanente: " + empleadoLista.toString()+ "\nEl salario basico : " + empleados.calcularSalario()+"€");
        

        }
      
    }
    
    private static void empleadoPermanente(ArrayList<Empleado> empleadoPermanente) {
       
        String dniIntroducido = JOptionPane.showInputDialog("Introduce el dni :");
        String nombreIntroducido = JOptionPane.showInputDialog("Introduce su nombre :");
        String apellidosIntroducido = JOptionPane.showInputDialog("Introduce sus apelldios :");
         int ClienteContratado = Integer.parseInt(JOptionPane.showInputDialog("Introduce Los cliente contratados :"));
        
        double salarioBaseIntroducido = Double.parseDouble(JOptionPane.showInputDialog("Introduce el Salario Base :"));
        String fehcaContratacion = JOptionPane.showInputDialog("Introduce la Fecha DD/MM/YYYY :");
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(fehcaContratacion, formatter);
        Empleado permanente = new Permanente(dniIntroducido, nombreIntroducido, apellidosIntroducido,ClienteContratado, salarioBaseIntroducido, date);
        empleadoPermanente.add(permanente);
        
        for (Empleado empleadoLista : empleadoPermanente) {
          JOptionPane.showMessageDialog(null,"\n Empleado Permanente: " + empleadoLista.toString()+ "\nEl salario basico :"+ permanente.calcularSalario()+"€");
        

        }
      
    }
}
