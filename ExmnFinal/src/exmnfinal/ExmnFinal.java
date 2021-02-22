
package exmnfinal;

import javax.swing.JOptionPane;

/**
 *
 * @author Robert
 */
public class ExmnFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lista lista = new Lista();
        
        int liOpcion=0;
        String lsNombre ="";
        int lsEdad= 0;
        
        
        do{
            
            try {
                liOpcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un elemento\n"
                        + "2. Mostrar los datos\n"
                        + "3. Salir","Menú de Opciones",3));;
                        
                switch(liOpcion){
                    case 1:
                        lsNombre = JOptionPane.showInputDialog(null,"Ingrese el nombre: ","Nuevo Nombre",3);
                        lsEdad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la edad: ","Nueva Edad",3));
                        lista.agregarAlInicio(lsEdad, lsNombre);
                        
                        break;
                    case 2:
                        lista.mostrar();
                        break;
                    case 3:
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Por favor ingrese una opción correcta");
                }
           
            } catch (Exception e) {
            }

        } while (liOpcion!=3);
        

        
        
    }
    
}
