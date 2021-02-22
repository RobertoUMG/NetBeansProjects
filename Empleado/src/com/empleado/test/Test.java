
package com.empleado.test;

import com.empleado.bo.EmpleadoBO;
import com.empleado.entity.Empleado;

/**
 *
 * @author Robert
 */
public class Test {
    EmpleadoBO ebo = new EmpleadoBO();
    Empleado emp = new Empleado();
    String mensaje = "";
    
    public void insertar(){
        emp.setNombres("Roberto");
        emp.setApellidos("Padilla");
        emp.setCedula("2004 81088 0101");
        emp.setEstadoCivil('S');
        emp.setGenero('M');
        emp.setEdad(24);   
        mensaje = ebo.agregarEmpleado(emp);
        System.out.println(mensaje);
    }
    
    
       public void modificar(){
        emp.setIdEmpleado(1);
        emp.setNombres("Name");
        emp.setApellidos("LastName");
        emp.setCedula("12345");
        emp.setEstadoCivil('C');
        emp.setGenero('F');
        emp.setEdad(55);  
        mensaje = ebo.modificarEmpleado(emp);
        System.out.println(mensaje);
    }
       
        public void eliminar(){  
        mensaje = ebo.eliminarEmpleado(20);
        System.out.println(mensaje);
    }
       
       public void checkDup(){
//        mensaje = ebo.checkDuplicates();
        ebo.checkDuplicates(66);
//        System.out.println(mensaje);
           
    }
              
             
         
   
    public static void main(String[] args) {
        Test test = new Test();
//        test.insertar();
       //test.modificar();
      // test.eliminar();
     // test.checkDup();
         
    }
    
}
