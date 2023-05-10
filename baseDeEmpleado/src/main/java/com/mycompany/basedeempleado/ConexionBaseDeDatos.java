package com.mycompany.basedeempleado;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConexionBaseDeDatos {

    ArrayList<Empleado> empleados = new ArrayList<>();
    Connection conectar = null;
    String usuario = "postgres";
    String contrasenia = "22124628";
    String baseDeDatos = "BaseDeEmpresa";
    String ip = "localhost";
    String puerto = "1818";

    String cadena = "jdbc:postgresql://" + ip + ":" + puerto + "/" + baseDeDatos;

    private Connection establecerConexion() {

        try {
            Class.forName("org.postgresql.Driver");

            conectar = DriverManager.getConnection(cadena, usuario, contrasenia);

            JOptionPane.showMessageDialog(null, "Se conecto correstamente a la base de datos");
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar : " + e.toString());

        }
        return conectar;

    }

    public ArrayList<Empleado> obtenerEmpleados() throws SQLException {
        ArrayList<Empleado> empleados = new ArrayList<>();
        Empleado empleado;
        DefaultTableModel modeloTabla = new DefaultTableModel();

        try {
            ConexionBaseDeDatos objetoConexion = new ConexionBaseDeDatos();
            Connection conexion = objetoConexion.establecerConexion();

            String sql = "SELECT IdEmpleado,Nombre, Apellidos, Dni, clientecontratado, SalarioBase, Fecha, IdtipoContrato FROM empleado";
            Statement statement = conexion.createStatement();
            ResultSet resultado = statement.executeQuery(sql);

            while (resultado.next()) {
                int selectedOption = resultado.getInt("IdtipoContrato");
                if (selectedOption == 1) {
                    empleado = new Permanente(
                            resultado.getInt("IdEmpleado"),
                            resultado.getString("Nombre"),
                            resultado.getString("Apellidos"),
                            resultado.getString("Dni"),
                            resultado.getInt("clientecontratado"),
                            resultado.getDouble("SalarioBase"),
                            resultado.getDate("Fecha").toLocalDate()
                    );
                    empleados.add(empleado);

                } else {
                    empleado = new Contratado(
                            resultado.getInt("IdEmpleado"),
                            resultado.getString("Nombre"),
                            resultado.getString("Apellidos"),
                            resultado.getString("Dni"),
                            resultado.getDouble("SalarioBase"),
                            resultado.getDate("Fecha").toLocalDate()
                    );
                    empleados.add(empleado);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
        }
        return empleados;

    }

 

    public void insertarEmpleado(Empleado empleado) throws SQLException {

        ConexionBaseDeDatos objetoConexion = new ConexionBaseDeDatos();
        String sql = "INSERT INTO Empleado (Nombre, Apellidos, Dni, ClienteContratado, SalarioBase, Fecha, IdtipoContrato) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement statement = objetoConexion.establecerConexion().prepareStatement(sql);
        statement.setString(1, empleado.getNombre());
        statement.setString(2, empleado.getApellidos());
        statement.setString(3, empleado.getDni());

    }
}
