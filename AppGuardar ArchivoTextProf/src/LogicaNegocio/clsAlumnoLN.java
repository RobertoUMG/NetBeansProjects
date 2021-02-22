/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaNegocio;

import Entidades.clsAlumnoEN;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bayronmartinez
 */
public class clsAlumnoLN {
    static Vector lObjVector = new Vector();
    //PROCEDIMIENTO PARA GUARDAR EN UN 1 VECTOR
    
    public static void SubGuardar (clsAlumnoEN lObjAlumno)
    {
      lObjVector.add(lObjAlumno);
    }
    
    //Procedimiento para guardar en un archivo de texto.
    public static void SubGuardarEnArchivo(clsAlumnoEN lObjAlumno)
    {
        try
        {
            FileWriter lObjFw = new FileWriter("Alumnos.txt",true);            
            BufferedWriter lObjBw=new BufferedWriter(lObjFw);
            PrintWriter lObjPw = new PrintWriter(lObjBw);
            lObjPw.print(lObjAlumno.getlStrCodigo());
            lObjPw.print("|"+lObjAlumno.getlStrNombre());
            lObjPw.println("|"+lObjAlumno.getlIntEdad());
             
            lObjPw.close();
        } catch (Exception e ) 
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    //FUNCION PARA MOSTRAR LOS DATOS EN UN jTABLE
    public static DefaultTableModel FncListaAlumnos()
    {
      Vector lObjEncabezado = new Vector();
      lObjEncabezado.addElement("Codigo");
      lObjEncabezado.addElement("Nombre");
      lObjEncabezado.addElement("Edad");
      //creacion de un vector que contenga Codigo, Nombre, Edad
      //creamos un modelo de tabla para agregar el vector en la ubicacion cero.
      DefaultTableModel lObjTabla = new DefaultTableModel(lObjEncabezado, 0);
      
      try {
          FileReader lObjFr = new FileReader("Alumnos.txt");
          BufferedReader lObjBr= new BufferedReader(lObjFr);
          String lStrd;
          while ((lStrd=lObjBr.readLine())!=null)
          {
              StringTokenizer lObjDato = new StringTokenizer(lStrd,"|");
              Vector lObjX = new Vector();
              while (lObjDato.hasMoreTokens()){
                  lObjX.addElement(lObjDato.nextToken());                  
              }
              lObjTabla.addRow(lObjX);
          } 
      } catch (Exception e)          
      {
          JOptionPane.showMessageDialog(null, e);
      }    
      return lObjTabla;
   }
    //Procedimiento para mostrar las edades en el combobox
    public static void CboEdad (JComboBox pStrEdad){
        pStrEdad.removeAllItems();
      for (int x=18; x<60;x++)
      {
          pStrEdad.addItem(x);
      }
    }
}
