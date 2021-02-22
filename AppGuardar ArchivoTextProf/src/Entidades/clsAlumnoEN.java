/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author bayronmartinez
 */
public class clsAlumnoEN {
    private String lStrCodigo;
    private String lStrNombre;
    private int lIntEdad;

    public clsAlumnoEN() {
    }

    public clsAlumnoEN(String lStrCodigo, String lStrNombre, int lIntEdad) {
        this.lStrCodigo = lStrCodigo;
        this.lStrNombre = lStrNombre;
        this.lIntEdad = lIntEdad;
    }

    public String getlStrCodigo() {
        return lStrCodigo;
    }

    public void setlStrCodigo(String lStrCodigo) {
        this.lStrCodigo = lStrCodigo;
    }

    public String getlStrNombre() {
        return lStrNombre;
    }

    public void setlStrNombre(String lStrNombre) {
        this.lStrNombre = lStrNombre;
    }

    public int getlIntEdad() {
        return lIntEdad;
    }

    public void setlIntEdad(int lIntEdad) {
        this.lIntEdad = lIntEdad;
    }
    
    
}
