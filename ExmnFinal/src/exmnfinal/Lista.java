
package exmnfinal;

/**
 *
 * @author Robert
 */
public class Lista {
    protected Nodo inicio,fin; //Punteros para saber donde está la cabeza y cola
    
    public Lista(){
        inicio = null;
        fin = null;
    }
    
//Método para agregar un nodo al inicio de la lista
    public void agregarAlInicio(int edad, String nombre){
        inicio=new Nodo(edad, nombre, inicio);
        
        if(fin==null){
            fin=inicio;
        }
        
    }
    
  //Método para listar datos
    public void mostrar(){
        Nodo temp =inicio;
        
        System.out.println();
        
        while(temp != null){
            System.out.print("[Edad: " + temp.edad + " Nombre: " + temp.nombre +"] --> ");
            temp=temp.siguiente;
        }
        
    }
  
    
}
