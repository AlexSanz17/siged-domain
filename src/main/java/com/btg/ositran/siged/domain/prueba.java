/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.btg.ositran.siged.domain;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Calendar;
/**
 *
 * @author consultor_jti15
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
        Date d = new Date();  
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss:SS");
        String dateInString = "06-08-2018 08:00:00:00";

        
         try{
            Date date = formatter.parse(dateInString);
            
            long n = date.getTime()-d.getTime();   
            long valor = n/60000;
            
            System.out.println("Diferencia======================" + valor);
            System.out.println("Difxxxx============" + new Date(date.getTime() + (8000-valor)));
            
            
         }catch(Exception e){
             e.printStackTrace();
         }
         
         
        }
    
}
