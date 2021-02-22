
package com.empleado.bo;

import com.empleado.dao.EmpleadoDAO;
import com.empleado.db.Conexion;
import com.empleado.entity.Empleado;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

/**
 *
 * @author Robert
 */
public class EmpleadoBO {
    
    
        private String mensaje = "";
    
        private EmpleadoDAO edao = new EmpleadoDAO();
        
        
    public String agregarEmpleado(Empleado emp ){
        Connection conn = Conexion.getConnection();
        
        try {
            mensaje = edao.agregarEmpleado(conn, emp);
            //conn.rollback();
            
        } catch (Exception e) {
            mensaje = mensaje+" " + e.getMessage();
            //commit
            
        } finally{
            try {
                if (conn != null){
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje+" " + e.getMessage();
            }
        }
        return mensaje;
    }  
    
    public String modificarEmpleado(Empleado emp ){
            Connection conn = Conexion.getConnection();
        
        try {
            mensaje = edao.modificarEmpleado(conn, emp);
            //conn.rollback();
            
        } catch (Exception e) {
            mensaje = mensaje+" " + e.getMessage();
            //commit
            
        } finally{
            try {
                if (conn != null){
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje+" " + e.getMessage();
            }
        }
        return mensaje;

    }
    
    public String eliminarEmpleado(int id ){
        Connection conn = Conexion.getConnection();
        
        try {
            mensaje = edao.eliminarEmpleado(conn, id);
            //conn.rollback();
            
        } catch (Exception e) {
            mensaje = mensaje+" " + e.getMessage();
            //commit
            
        } finally{
            try {
                if (conn != null){
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje+" " + e.getMessage();
            }
        }
        return mensaje;
    }

    public void listarEmpleado(JTable tabla){
        Connection conn = Conexion.getConnection();
        edao.listarEmpleado(conn, tabla);
            try {
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        
    }
    
    
    public int getMaxID(){
                    Connection conn = Conexion.getConnection();
        int id = edao.getMaxID(conn);
            try {
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            return id;
        
        
        
        
     }
        
        
    public int checkDuplicates(int candidate){
        Connection conn = Conexion.getConnection();
        int result =3;
        try {
            result= edao.checkDuplicates(conn,candidate);
            //conn.rollback();
            
        } catch (Exception e) {
            mensaje = mensaje+" " + e.getMessage();
            //commit
            
        } finally{
            try {
                if (conn != null){
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje+" " + e.getMessage();
            }
        }
        return result;
    }  
        
        
        
        
        
        
    
}
