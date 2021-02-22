
package Logica;

import Entidades.Vendedor;
import java.io.*;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.time.*;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Metodos {
    Vector vPrincipal = new Vector();
    
    
    //Procedimiento para guardar datos en 1 vector
    public void guardar(Vendedor unVendedor){
        vPrincipal.addElement(unVendedor);
    }
    
    //Procedimiento para guardar en un archivo txt
    
    public void guardarArchivo (Vendedor vendedor){
        try {
            FileWriter fw = new FileWriter("Database.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(vendedor.getCodigo());
            pw.print("|"+vendedor.getCarne());
            pw.print("|"+vendedor.getNombre());
            pw.print("|"+vendedor.getDOB());
            pw.print("|"+vendedor.getEdad());
            pw.print("|"+vendedor.getRuta());
            pw.println("|"+vendedor.getSalario());
            pw.close();
   
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }  
    
}
    
    
    //Funcion para mostrar los datos en un JTable
    public DefaultTableModel listaVendedores(){
        Vector cabeceras = new Vector();
            cabeceras.addElement("Codigo");
            cabeceras.addElement("Carné");
            cabeceras.addElement("Nombre");
            cabeceras.addElement("Fecha de Nacimiento");
            cabeceras.addElement("Edad");
            cabeceras.addElement("Ruta");
            cabeceras.addElement("Salario");
            
            //Vector que contenga info del vendedor
            //Modelo de tabla para agregar el vector, en la ubicacion
            DefaultTableModel mdlTabla = new DefaultTableModel(cabeceras,0);
            
            try {
            FileReader fr = new FileReader("Database.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while ((d=br.readLine()) != null){
                StringTokenizer dato = new StringTokenizer(d,"|");
                Vector x = new Vector();
                while (dato.hasMoreTokens()){
                    x.addElement(dato.nextToken());
                    }
                mdlTabla.addRow(x); 
                }
            
                } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
                }
            
            return mdlTabla;            
        }
    
    //Poblar el JComboBox
    public void cboRuta (JComboBox rutas){
        rutas.removeAllItems();
        for (int x=1;x<25;x++){
            rutas.addItem(x);
        }
    }
    
    
    
    
    
    
    
    
    
    //Hay que crear metodo para calcular EDAD 
    public int strngToInt(String DOB){
        
       int yy = 0,mm = 0,dd =0, edad=0 ;       
       
       StringTokenizer token = new StringTokenizer(DOB,"/");

           dd=Integer.parseInt(token.nextToken());
           mm=Integer.parseInt(token.nextToken());
           yy=Integer.parseInt(token.nextToken());
           
           //convert to years
           LocalDate birthday = LocalDate.of(yy, mm, dd);
           
           //get current date
           LocalDate nowd = LocalDate.now();
           
           //get difference
           edad = Period.between(birthday, nowd).getYears();              
    
    return edad;
    }
    
    

       

    
    
    }
    
    





