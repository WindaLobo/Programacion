package com.mycompany.basedeempleado;

import java.sql.SQLException;
import java.time.LocalDate;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import modelo.Contratado;
import modelo.Empleado;
import modelo.Permanente;
import repositorio.EmpleadoRepositorio;

public class BaseDeEmpleado {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
     Ventana prueba = new Ventana();
            prueba.setVisible(true);
            prueba.setDefaultCloseOperation(EXIT_ON_CLOSE);

      //EmpleadoRepositorio emple = new EmpleadoRepositorio();
       // Empleado empleado = new Permanente(5,"asdsada", "adrian", "Estevez", 100, 1000, LocalDate.now());
       // emple.insertarEmpleado(empleado);
      // emple.obtenerEmpleados();
      // emple.actualizarEmpleado(empleado);
     // emple.eliminarEmpleado(empleado);
       
       
        
        
         //empleado = new Contratado( "asdsada", "adrian", "Estevez", 1200, LocalDate.now());
        // emple.insertarEmpleado(empleado);
       
       // emple.actualizarEmpleado(empleado);
       // System.out.println(empleado);

    }
}
