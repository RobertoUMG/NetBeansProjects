
package Entidades;

public class Vendedor {
    
    private String codigo;
    private int carne;
    private String nombre;
    private String dOB; 
    private int edad;
    private int ruta;
    private int salario;

    public Vendedor() {
    }

    
    
    
    public Vendedor(String codigo, int carne, String nombre, String dOB, int edad, int ruta, int salario) {
        this.codigo = codigo;
        this.carne = carne;
        this.nombre = nombre;
        this.dOB = dOB;
        this.edad = edad;
        this.ruta = ruta;
        this.salario = salario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCarne() {
        return carne;
    }

    public void setCarne(int carne) {
        this.carne = carne;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDOB() {
        return dOB;
    }

    public void setDOB(String dOB) {
        this.dOB = dOB;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getRuta() {
        return ruta;
    }

    public void setRuta(int ruta) {
        this.ruta = ruta;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    
    
    
    
}
