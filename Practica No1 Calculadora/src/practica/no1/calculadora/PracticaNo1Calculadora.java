/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.no1.calculadora;

import java.util.Scanner;
/**
 *
 * @author Robert
 */
public class PracticaNo1Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
       classCalculator Calculadora = new classCalculator(0,0);
        Scanner Entrada = new Scanner(System.in);
        
        int opcion;
        
        opcion = 0;
        
        while (opcion!=5){
        System.out.println("----------------------------------");
        System.out.println("----------MENÚ PRINCIPAL----------");
        System.out.println("1.  Sumar");
        System.out.println("2.  Restar");
        System.out.println("3.  Multiplicar");
        System.out.println("4.  Dividir");
        System.out.println("5.  Salida");
        
        opcion = Entrada.nextInt();
        
        int Num1, Num2;
        
        switch (opcion){
            case 1:
                System.out.println("Ingrese Numero 1:");
                Num1 = Entrada.nextInt();
                System.out.println("Ingrese Numero 2:");
                Num2 = Entrada.nextInt();
                Calculadora = new classCalculator (Num1,Num2);
                Calculadora.Suma();
                System.out.println("El resultado de la suma es: "+Calculadora.getResultado());
                Thread.sleep(1000);
                break;
            case 2:
                System.out.println("Ingrese Numero 1:");
                Num1 = Entrada.nextInt();
                System.out.println("Ingrese Numero 2:");
                Num2 = Entrada.nextInt();
                Calculadora = new classCalculator (Num1,Num2);
                Calculadora.Resta();
                System.out.println("El resultado de la resta es: "+Calculadora.getResultado());
                Thread.sleep(1000);
                break;
            case 3:
                System.out.println("Ingrese Numero 1:");
                Num1 = Entrada.nextInt();
                System.out.println("Ingrese Numero 2:");
                Num2 = Entrada.nextInt();
                Calculadora = new classCalculator (Num1,Num2);
                Calculadora.Multiplicacion();
                System.out.println("El resultado de la multiplicacion es: "+Calculadora.getResultado());
                Thread.sleep(1000);
                break;
            case 4:
                System.out.println("Ingrese Numero 1:");
                Num1 = Entrada.nextInt();
                System.out.println("Ingrese Numero 2:");
                Num2 = Entrada.nextInt();
                Calculadora = new classCalculator (Num1,Num2);
                Calculadora.Division();
                System.out.println("El resultado de la division es: "+Calculadora.getResultado());
                Thread.sleep(1000);
                break;  
        }
        }       
    }      
}
