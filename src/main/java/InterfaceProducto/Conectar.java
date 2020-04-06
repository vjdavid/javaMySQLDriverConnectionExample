/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceProducto;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Conectar {
    Connection conectar = null;
    
    public Connection conexion() {
        try {
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/Tienda?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "david12345");
            JOptionPane.showMessageDialog(null, "Conexion Exitosa");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conectar;
    }
}
