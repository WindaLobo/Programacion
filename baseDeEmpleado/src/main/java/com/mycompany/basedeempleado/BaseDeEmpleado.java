package com.mycompany.basedeempleado;



import java.sql.SQLException;
import java.time.LocalDate;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import modelo.Contratado;
import modelo.Empleado;
import modelo.Permanente;
import repositorio.EmpleadoRepositorio;

public class BaseDeEmpleado {

    public static void main(String[] args) throws SQLException {
     Ventana prueba = new Ventana();
            prueba.setVisible(true);
            prueba.setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      
            /* EmpleadoRepositorio emple = new EmpleadoRepositorio();
             
             Empleado empleado = new Permanente("asdsada", "adrian", "Estevez", 1, 1500, LocalDate.now());
             emple.insertarEmpleado(empleado);
            
             
             empleado = new Contratado("asdsada", "adrian", "Estevez", 1500, LocalDate.now());
             emple.insertarEmpleado(empleado);*/
                 
    }
}
