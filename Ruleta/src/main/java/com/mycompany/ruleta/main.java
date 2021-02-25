/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ruleta;

import java.util.Scanner;

/**
 *
 * @author Robert
 */
public class main {
    
//    Scanner TxtIn = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        Scanner TxtIn = new Scanner(System.in);
        
        //Inicializando controlador de salida
        String strContinuar = null;
        
        //Inicializando billetera
        int intBilletera = 10;
        
        //Inicializando control de acierto del numero y color
        boolean boolNum = false, boolColor = false;
        
        //Inicializando precio de la apuesta
        final int intPrice = 10;
        
        //Inicializando variables que el user ingresa para adivinar
        String strColorAdiv = null;
        int intNumAdiv = 0;
        
        //Inicializando variables de ruleta
        int intNumRuleta = 0;
        String strColorRuleta = null;
        
        //Introduccion y explicacion del juego       
        System.out.println("¡Bienvenido al juego de la ruleta!");        
        System.out.println("Generaré un número del 1 al 10 y le asignaré un color; si el número es par será negro, si el número es impar será blanco.");
        System.out.println("Tienes que tratar de adivinar el número y color, si lo logras te daré recompensas");
        System.out.println("¡Suerte!");
  
        
        do {
            System.out.println(""); System.out.println(""); System.out.println("");
            
                System.out.println("En este momento tienes "+intBilletera+" monedas, se usarán "+intPrice+ " monedas para tu apuesta");
                
                if (intBilletera>=10) {               
            
                
                //Descuenta precio de la apuesta
                intBilletera -= intPrice;
                System.out.println("Te quedan "+intBilletera+" monedas");
                
                //Genera un número aleatorio y le asigna un color
                intNumRuleta = (int)(10.0 * Math.random());
                if (intNumRuleta%2==0)  strColorRuleta = "NEGRO"; 
                else strColorRuleta = "BLANCO";
                
                System.out.println("Ok, ya escogí el número y le asigné un color, te toca adivinar");
                
                //Obtencion del numero a prueba de errores
                while (intNumAdiv < 1 || intNumAdiv>10) {
                    System.out.println("Ingresa un número del 1 al 10");
                    intNumAdiv = TxtIn.nextInt();
                    if (intNumAdiv <1 || intNumAdiv>10) {
                        System.out.println("¡Error!");
                    }
                }
                
                //Guarda en bool si logró adivinar numero
                boolNum = intNumRuleta == intNumAdiv;            
                
                //Limpieza del buffer
                TxtIn.nextLine();
                
                //Obtencion del color a prueba de errores
                while (!"BLANCO".equals(strColorAdiv) && !"NEGRO".equals(strColorAdiv)) {
                    System.out.println("¿Blanco o Negro?");
                    strColorAdiv = TxtIn.nextLine().toUpperCase();
                    if (!"BLANCO".equals(strColorAdiv) && !"NEGRO".equals(strColorAdiv)) {
                        System.out.println("¡Error!");
                    }   
                }
                
                //Guarda en bool si logró adivinar color
                boolColor = strColorRuleta.equals(strColorAdiv);                   
                
                System.out.println(""); System.out.println("");
                
                
                if (boolNum) {
                    System.out.println("¡Adivinaste! El número si era "+intNumRuleta);
                    System.out.println("Por haber adivinado correctamente haz ganado: "+intPrice*3+" monedas");
                    intBilletera += (intPrice*3);                 
                }else System.out.println("No adivinaste el numero :( ");  
                
                System.out.println("");
                
                if (boolColor) {
                    System.out.println("¡Adivinaste! El color si era "+strColorRuleta);
                    System.out.println("Por haber adivinado correctamente haz ganado: "+intPrice*2+" monedas");
                    intBilletera += (intPrice*2);                 
                }else System.out.println("No adivinaste el color :( ");
                

                
                System.out.println(strColorAdiv + intNumAdiv);
                System.out.println(strColorRuleta + intNumRuleta);
            
                
                System.out.println("Deseas continuar?");
                strContinuar = TxtIn.nextLine();
                
                } else {
                    System.out.println("No tienes suficiente monedas para continuar.");
                    strContinuar ="N";
                }
                
                //Reset de variables
                intNumAdiv = 0;
                strColorAdiv= null;
                boolNum = false;
                boolColor = false;
                
                
                
            
        } while (strContinuar.equals("s") || strContinuar.equals("S") );
        
        
    }
    
    
}
