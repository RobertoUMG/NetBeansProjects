
package com.empleado.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Robert
 */
public class Conexion {
    
    private static Connection conn = null;
    private static String user = "BOBBY";
    private static String pass ="12345";
    private static String url = "jdbc:oracle:thin:@localhost:1521:XE";
    
    public static Connection getConnection(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url,user,pass);
            conn.setAutoCommit(false);
            if (conn!=null){
                System.out.println("Conexion exitosa");
            } else{
                System.out.println("Conexion NO exitosa");
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexion NO exitosa: "+e.getMessage());
        }
        return conn;
    }
    
    public void desconexion(){
        try {
            conn.close();
        } catch (Exception e) {
            System.out.println("Error al desconectar"+e.getMessage());
        }
        
    }
    
    public static void main(String[] args) {
        Conexion c=new Conexion();
        c.getConnection();
    }
    
    
}

