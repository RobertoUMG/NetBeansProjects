/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.no1.calculadora;

/**
 *
 * @author Robert
 */
public class classCalculator {
    static private int Num1, Num2, Resultado;
    
    public int getResultado (){
        return Resultado;
    } 
    
    public classCalculator  (int pNum1, int pNum2){
        this.Num1=pNum1;
        this.Num2=pNum2;
    }
    
    
    void Suma(){
        Resultado=Num1+Num2;
    }
    void Resta(){
        Resultado=Num1-Num2;
    }
    void Multiplicacion(){
        Resultado=Num1*Num2;
    }
    void Division(){
        Resultado=Num1/Num2;
    }  
    
}
