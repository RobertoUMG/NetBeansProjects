
package metodos;

import alumno.Alumno;
import java.io.*;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class Metodos {
    
    Vector vPrincipal = new Vector();
    
    //PROCEDIMIENTO PARA GUARDAR DATOS EN UN VECTOR
    public void guardar(Alumno unAlumno){
    vPrincipal.addElement(unAlumno);
    }
    
    //PROCEDIMIENTO PARA GURDAR EN UN ARCHIVO TXR
    public void guardarArchivo(Alumno alumno){
        try {
            FileWriter fw = new FileWriter("Alumnos.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(alumno.getCodigo());
            pw.print("|"+alumno.getNombre());
            pw.println("|"+alumno.getEdad());
            pw.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        
    }
    
    //FUNCION PARA MOSTRAR LOS DATOS EN UN JTABLE
    public DefaultTableModel listaAlumnos(){
        //CREAMOS UN VECTOR QUE CONTENGA CODIGO, NOMBRE, EDAD
        Vector cabeceras = new Vector ();
        cabeceras.addElement("Codigo");
        cabeceras.addElement("Nombre");
        cabeceras.addElement("Edad");

        //CREAMOS UN MODELO DE TABLA PARA AGREGAR EL VECTOR, EN LA UBICACION 0
        DefaultTableModel mdlTabla = new DefaultTableModel(cabeceras,0);
        
        try {
            FileReader fr = new FileReader("Alumnos.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while((d=br.readLine())!=null){
                StringTokenizer dato = new StringTokenizer(d,"|");
                Vector x = new Vector();
                while(dato.hasMoreTokens()){
                    x.addElement(dato.nextToken());
                   
                }
                mdlTabla.addRow(x);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return mdlTabla;
        
        
        
        
    }
    
    //Procedimiento para poblar un JCombo Box con las edades
    public void cboEdad (JComboBox edades){
        edades.removeAllItems();
        for(int x=18 ; x <60 ; x++){
            edades.addItem(x);
        }
        
    }
    
}
