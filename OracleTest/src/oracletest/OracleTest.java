/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracletest;

import java.util.LinkedList;

/**
 *
 * @author Robert
 */
public class OracleTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SQLclass query=new SQLclass();
        
        String consulta = "select * from countries";
        
       //query.query(consulta);
       
       LinkedList<String> resultado = query.query(consulta);
       
       for (int i=0; i<resultado.size();i++){
           System.out.println(resultado.get(i));   
       }
       
       
        
    }
    
}
