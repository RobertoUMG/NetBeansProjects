/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadora;

import java.util.Scanner;


/**
 *
 * @author alumno
 */
public class Principal {
    
    //Metodo principal
    public static void main (String[] args){
        
        //Definir variables
        Scanner objInput = new Scanner(System.in);
        String strContinuar = null;
        
        do{
                       
            System.out.println("Seleccionar una opcion:");
            System.out.println("a - Si desea sumar");
            System.out.println("b - Si desea restar");
            System.out.println("c - Si desea multiplicar");
            System.out.println("d - Si desea dividir");
            System.out.println("Escriba su opcion:");
            
            //Recibe el valor del buffer del teclado
            String strOpcion = objInput.nextLine();
            
            //Definir variables para las operaciones
            float[] fltArrNumeros = new float[2];
            float fltResultado = 0;
            
            
            //Define variable de error
            boolean blnError =true;
            
            switch(strOpcion){
                case "a":
                    strOpcion = "Suma";
                    System.out.println("");
                    
                    //Solicitar los valores numericos
                    for (int i = 0; i < 2; i++) {
                        System.out.println("Ingrese el numero " + (i+1) + ": ");
                        fltArrNumeros[i] = objInput.nextFloat();                       
                        
                    }
                    
                    fltResultado = fltArrNumeros[0] + fltArrNumeros[1];
                    
                    blnError = false;
                    
                    //Salir del case
                    break;
                case "b":
                    strOpcion = "Resta";
                    System.out.println("");
                    
                    //Solicitar los valores numericos
                    for (int i = 0; i < 2; i++) {
                        System.out.println("Ingrese el numero " + (i+1) + ": ");
                        fltArrNumeros[i] = objInput.nextFloat();                       
                        
                    }
                    
                    fltResultado = fltArrNumeros[0] - fltArrNumeros[1];
                    
                    blnError = false;
                    
                    //Salir del case
                    break;
                
                case "c":
                    strOpcion = "Multiplicación";
                    System.out.println("");
                    
                    //Solicitar los valores numericos
                    for (int i = 0; i < 2; i++) {
                        System.out.println("Ingrese el numero " + (i+1) + ": ");
                        fltArrNumeros[i] = objInput.nextFloat();                       
                        
                    }
                    
                    fltResultado = fltArrNumeros[0] * fltArrNumeros[1];
                    
                    blnError = false;
                    
                    //Salir del case
                    break;    
                    
                case "d":
                    strOpcion = "División";
                    System.out.println("");
                    
                    //Solicitar los valores numericos
                    for (int i = 0; i < 2; i++) {
                        System.out.println("Ingrese el numero " + (i+1) + ": ");
                        fltArrNumeros[i] = objInput.nextFloat();                       
                        
                    }
                    
                    if (fltArrNumeros[1]==0) {
                        blnError=true;
                        System.out.println("El denominador es 0, no es posible hacer la división");                        
                    } else  {
                        fltResultado = fltArrNumeros[0] / fltArrNumeros[1];                    
                        blnError = false;
                        
                    }
                    

                    
                    //Salir del case
                    break;
                    
                default:
                    //Error
                    blnError = true;
                    
                    break;
                    
            }
            
            System.out.println("");
            
                        System.out.println("La opcion seleccionada es " + strOpcion );
            
            //Despliegue de los datos, si no hay error
            if (blnError ==false) {
                System.out.println("El resultado es: " + fltResultado);                
            }
            else if (blnError == true) {
                System.out.println("Error, no se puede realizar su operación");                
            }
            

            System.out.println("Desea continuar? S/N");
            objInput.nextLine();
            strContinuar = objInput.nextLine();
            
            
            //Capturar el buffer para continuar
            /*Scanner objInput2 = new Scanner(System.in);
            strContinuar = objInput2.nextLine();*/
            
            System.out.println("");            System.out.println("");            System.out.println("");
            
            
            
        } while (strContinuar.equals("s") || strContinuar.equals("S") );
    
        
        
        
    }
    
    
}
