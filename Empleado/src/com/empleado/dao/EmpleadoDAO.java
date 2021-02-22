
package com.empleado.dao;

import com.empleado.entity.Empleado;
import java.sql.*;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class EmpleadoDAO {
    
    private String mensaje = "";
    
    public String agregarEmpleado(Connection con, Empleado emp ){
        PreparedStatement pst = null;
        String sql = "INSERT INTO EMPLEADO (IDEMPLEADO, NOMBRES, APELLIDOS, CEDULA, ESTADO_CIVIL, GENERO, EDAD)"
                + "VALUES (?,?,?,?,?,?,?)";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, emp.getIdEmpleado());
            pst.setString(2,emp.getNombres());
            pst.setString(3,emp.getApellidos());
            pst.setString(4,emp.getCedula());
            pst.setString(5,emp.getEstadoCivil()+"");
            pst.setString(6,emp.getGenero()+"");
            pst.setInt(7,emp.getEdad());
            mensaje = "Guardado correctamente";
            pst.execute();
            pst.close();;
        } catch (SQLException e) {            
            mensaje = "Error al guardar: \n"+e.getMessage();            
        }
        return mensaje;
    }
    
        public String modificarEmpleado(Connection con, Empleado emp ){
                   PreparedStatement pst = null;
        String sql = "UPDATE EMPLEADO SET NOMBRES = ?, APELLIDOS = ?, CEDULA = ?, ESTADO_CIVIL = ?, GENERO = ?, EDAD = ?"
                + "WHERE IDEMPLEADO = ?";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1,emp.getNombres());
            pst.setString(2,emp.getApellidos());
            pst.setString(3,emp.getCedula());
            pst.setString(4,emp.getEstadoCivil()+"");
            pst.setString(5,emp.getGenero()+"");
            pst.setInt(6,emp.getEdad());
            pst.setInt(7,emp.getIdEmpleado());
            mensaje = "Actualizado correctamente";
            pst.execute();
            pst.close();;
        } catch (SQLException e) {            
            mensaje = "Error al guardar: \n"+e.getMessage();            
        }
        return mensaje;
    }
    
    public String eliminarEmpleado(Connection con, int id ){
        PreparedStatement pst = null;
        String sql = "DELETE FROM EMPLEADO WHERE IDEMPLEADO = ?";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1,id);
            mensaje = "Eliminado correctamente";
            pst.execute();
            pst.close();;
        } catch (SQLException e) {            
            mensaje = "Error al eliminar: \n"+e.getMessage();            
        }
        
        return mensaje;
    }

    public void listarEmpleado(Connection con, JTable tabla){
        DefaultTableModel model;
        String [] columnas = {"ID","NOMBRES","APELLIDOS","CEDULA","ESTADO CIVIL","GENERO","EDAD"};
        model = new DefaultTableModel(null,columnas);
        
        String sql = "SELECT * FROM EMPLEADO ORDER BY IDEMPLEADO";
        
        String[] filas = new String[7];
        Statement st = null;
        ResultSet rs = null;
        
        try {
           st = con.createStatement();
           rs = st.executeQuery(sql);
           while (rs.next()){
               for (int i = 0; i < 7; i++) {
                   filas[i] = rs.getString(i+1);
//                  System.out.println(rs.getString(i+1));                   
               }
               model.addRow(filas);
                   
            }      
           tabla.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No es posible mostrar la tabla " + e.getMessage());

            
        }
        
    }
    
    
    public int getMaxID(Connection con){
        int id=0;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql ="SELECT MAX(IDEMPLEADO)+1 AS ID FROM EMPLEADO";
        
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if (rs.next()){
                id=rs.getInt(1);
            }
            rs.close();
            pst.close();
        } catch (SQLException e) {
            System.out.println("Error al mostar ID "+e.getMessage());
        }
        
        return id;
    }
    
    
    
    public int checkDuplicates(Connection con, int candidate){

        String sql = "SELECT IDEMPLEADO FROM EMPLEADO";
        int result=3;
        
        Statement st = null;
        ResultSet rs = null;
        
        try {
           st = con.createStatement();
           rs = st.executeQuery(sql);
           
           while (rs.next()){
               if (result == 0) {
                   result=0;
               } else {
                   if(Integer.parseInt(rs.getString(1))==candidate){
                       result =0;                       
                   } else {
                       result =1;
                   }
                      
               }
               // System.out.println(rs.getString(1));     
           }      
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al operar " + e.getMessage());
        }
        
            System.out.println("Resultado:"+result);
        
     return result;   
    }
    
    
    
    
}
