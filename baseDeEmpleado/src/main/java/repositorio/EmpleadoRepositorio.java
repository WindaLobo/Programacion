package repositorio;

import modelo.Contratado;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Empleado;
import modelo.Permanente;

public class EmpleadoRepositorio {

    ArrayList<Empleado> empleados = new ArrayList<>();
    Connection conectar = null;
    String usuario = "postgres";
    String contrasenia = "22124628";
    String baseDeDatos = "BaseDeEmpresa";
    String ip = "localhost";
    String puerto = "1818";

    String cadena = "jdbc:postgresql://" + ip + ":" + puerto + "/" + baseDeDatos;

    private Connection establecerConexion() throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");
        conectar = DriverManager.getConnection(cadena, usuario, contrasenia);
        return conectar;

    }

    public ArrayList<Empleado> obtenerEmpleados() throws SQLException, ClassNotFoundException {
        ArrayList<Empleado> empleados = new ArrayList<>();
        Empleado empleado;
        Connection conexion = establecerConexion();
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

            } else {
                empleado = new Contratado(
                        resultado.getInt("IdEmpleado"),
                        resultado.getString("Nombre"),
                        resultado.getString("Apellidos"),
                        resultado.getString("Dni"),
                        resultado.getDouble("SalarioBase"),
                        resultado.getDate("Fecha").toLocalDate()
                );

            }
            empleados.add(empleado);
        }
        conectar.close();
        return empleados;
    }

    public void insertarEmpleado(Empleado empleado) throws SQLException, ClassNotFoundException {

        Connection conexion = establecerConexion();
        String sql = "INSERT INTO Empleado (Nombre, Apellidos, Dni, ClienteContratado, SalarioBase, Fecha, IdtipoContrato) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        PreparedStatement statement = conexion.prepareStatement(sql);
        statement.setString(1, empleado.getNombre());
        statement.setString(2, empleado.getApellidos());
        statement.setString(3, empleado.getDni());
        if (empleado instanceof Permanente) {
            Permanente permanente = (Permanente) empleado;
            statement.setInt(4, permanente.getClientesCaptados());
        } else {
            statement.setInt(4, 0);
        }
        statement.setDouble(5, empleado.getSalarioBase());
        statement.setDate(6, Date.valueOf(empleado.getFechaDeIngreso()));
        statement.setInt(7, empleado instanceof Permanente ? 1 : 2);
        // statement lo q haces es q ejecuta la sentencia SQL preparada y devuelve el número de filas afectadas por la operación
        statement.executeUpdate();
        conectar.close();
    }

    public void actualizarEmpleado(Empleado empleado) throws SQLException, ClassNotFoundException {

        Connection conexion = establecerConexion();
        String sql = "UPDATE Empleado SET Nombre=?, Apellidos=?, Dni=?, ClienteContratado=?, SalarioBase=?, Fecha=?, IdtipoContrato=? WHERE IdEmpleado=?";

        PreparedStatement statement = conexion.prepareStatement(sql);
        statement.setString(1, empleado.getNombre());
        statement.setString(2, empleado.getApellidos());
        statement.setString(3, empleado.getDni());
        if (empleado instanceof Permanente) {
            Permanente permanente = (Permanente) empleado;
            statement.setInt(4, permanente.getClientesCaptados());
        } else {
            statement.setInt(4, 0);
        }
        statement.setDouble(5, empleado.getSalarioBase());
        statement.setDate(6, java.sql.Date.valueOf(empleado.getFechaDeIngreso()));
        statement.setInt(7, empleado instanceof Permanente ? 1 : 2);
        statement.setInt(8, empleado.getIdEmpleado());
        statement.executeUpdate();
        conectar.close();
        /*int filasAfectadas = statement.executeUpdate();
   if (filasAfectadas == 1) {
        System.out.println("El empleado se actualizó correctamente.");
    } else {
        System.out.println("No se pudo actualizar el empleado.");
    }*/

    }
    

}
