/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1er.parcial;

/**
 *
 * @author Robert
 */
public class classCuentaBancaria {
    
    static public String TitularCuenta, TipoCuenta;
    static public int DPI, Saldo;
       
    public classCuentaBancaria (String pTitularCuenta, String pTipoCuenta, int pDPI, int pSaldo){
        this.TitularCuenta=pTitularCuenta;
        this.TipoCuenta=pTipoCuenta;
        this.DPI=pDPI;
        this.Saldo=pSaldo;    
    }
    
      
    
    void Depositar(int Aux){
        Saldo+=Aux;
        System.out.println("NUEVO SALDO: "+Saldo);
        System.out.println("\n Presione cualquier tecla para continuar...");
        new java.util.Scanner(System.in).nextLine();
    }
    
    void Retirar(int Aux){
        Saldo-=Aux;
        System.out.println("NUEVO SALDO: "+Saldo);
        System.out.println("\n Presione cualquier tecla para continuar...");
        new java.util.Scanner(System.in).nextLine();
    }
   
    public int getSaldo (){
        return Saldo;
    } 

    public static void setSaldo(int Saldo) {
        classCuentaBancaria.Saldo = Saldo;
    }
    
    
    
    
}
