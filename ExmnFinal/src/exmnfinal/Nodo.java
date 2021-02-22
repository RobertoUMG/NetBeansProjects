
package exmnfinal;

/**
 *
 * @author Robert
 */
public class Nodo {
    
    public int edad;
    public String nombre;
    public Nodo siguiente; 
    
//        Constructor para insertar al final
        public Nodo(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }
        
//        Constructor para insertar al inicio
        public Nodo(int edad, String nombre, Nodo siguiente) {
        this.edad = edad;
        this.nombre = nombre;
        this.siguiente = siguiente;
    }
   
    
}
