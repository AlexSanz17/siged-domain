/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.btg.ositran.siged.domain;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author consultor_jti15
 */
public class prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
           
              Calendar temp = Calendar.getInstance();
              Calendar temp1 = Calendar.getInstance();
              try{
                    temp.setTime(new SimpleDateFormat("yyyy-MM-dd").parse("2018-09-03"));
                    temp1.setTime(new SimpleDateFormat("yyyy-MM-dd").parse("2018-10-05"));
               
             
               int plazo = 0;               
               
                   
                    while (temp1.get(Calendar.DAY_OF_YEAR)>temp.get(Calendar.DAY_OF_YEAR)){
                        plazo ++;
                        temp.add(Calendar.DAY_OF_MONTH, 1);

                        if (temp.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || temp.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
                            while (temp.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || temp.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                                 temp.add(Calendar.DAY_OF_MONTH, 1);
                            }
                        }
                    }
                    
                    System.out.println("Plazos========" + plazo);

               }catch(Exception e){
                   
               }
    }
}
