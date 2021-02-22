/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1er.parcial;

import java.util.Scanner;

/**
 *
 * @author Robert
 */
public class Parcial {

    /**
     * @param args the command line arguments
     */    
    
    
    
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        
        
        
        classCuentaBancaria CuentaBancaria = new classCuentaBancaria("","",0,0);
        Scanner Entrada = new Scanner(System.in);
        
        int opcion=0, aux=0;
        
        while (opcion!=5){
        System.out.println("----------------------------------");
        System.out.println("----------MENÚ PRINCIPAL----------");
        System.out.println("1.  Ingresar");
        System.out.println("2.  Depositar");
        System.out.println("3.  Retirar");
        System.out.println("4.  Consulta");
        System.out.println("5.  Salida");
        System.out.println("----------------------------------");
        
        opcion = Entrada.nextInt();
        
        Entrada.nextLine();
                
            switch (opcion){
                case 1:
                    for (int i = 0; i < 50; ++i) System.out.println();
                    System.out.println("----------------------------------");
                    System.out.println("DATOS DE LA CUENTA A INGRESAR:");
                    System.out.println("----------------------------------");                    
                    System.out.print("Nombre del Titular de la cuenta: "); CuentaBancaria.TitularCuenta = Entrada.nextLine();
                    System.out.print("Tipo de cuenta: "); CuentaBancaria.TipoCuenta = Entrada.nextLine();
                    System.out.print("DPI del titular de la cuenta: "); CuentaBancaria.DPI = Entrada.nextInt();
                    System.out.print("Saldo Inicial: "); CuentaBancaria.setSaldo(Entrada.nextInt());
                    System.out.println("\n Datos guardados exitosamente, presione cualquier tecla para continuar...");
                    new java.util.Scanner(System.in).nextLine();        
                        break;
                
                case 2:
                    for (int i = 0; i < 50; ++i) System.out.println();
                    System.out.println("----------------------------------");
                    System.out.println("DEPOSITO");
                    System.out.println("----------------------------------");
                    System.out.print("Ingrese el monto a depositar: "); aux = Entrada.nextInt();
                    CuentaBancaria.Depositar(aux);                               
                        break;
                case 3:
                    for (int i = 0; i < 50; ++i) System.out.println();
                    System.out.println("----------------------------------");
                    System.out.println("RETIRO");
                    System.out.println("----------------------------------");
                    System.out.print("Ingrese el monto a retirar: "); aux = Entrada.nextInt();
                    CuentaBancaria.Retirar(aux);
                        break;
                case 4:
                    for (int i = 0; i < 50; ++i) System.out.println();
                    System.out.println("----------------------------------");
                    System.out.println("DATOS ACTUALES DE LA CUENTA:");
                    System.out.println("----------------------------------");
                    System.out.print("\nTitular de la cuenta: "+ CuentaBancaria.TitularCuenta);
                    System.out.print("\nTipo de cuenta: "+ CuentaBancaria.TipoCuenta);
                    System.out.print("\nDPI del titular de la cuenta: "+ CuentaBancaria.DPI);
                    System.out.print("\nSaldo: Q"+ CuentaBancaria.getSaldo());
                    System.out.println("\n----------------------------------");
                    System.out.println("\n Presione cualquier tecla para continuar...");
                    new java.util.Scanner(System.in).nextLine();      
                        break;

            }

        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}