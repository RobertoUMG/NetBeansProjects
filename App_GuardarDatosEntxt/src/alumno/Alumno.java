
package alumno;


public class Alumno {
    
    private String codigo;
    private String nombre;
    private int edad;

    public Alumno() {
    }

    public Alumno(String codigo, String nombre, int edad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
