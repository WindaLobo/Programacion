
package com.mycompany.basedeempleado;

import java.sql.SQLException;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class BaseDeEmpleado {

    public static void main(String[] args) throws SQLException {
      Ventana prueba = new Ventana();
            prueba.setVisible(true);
            prueba.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
