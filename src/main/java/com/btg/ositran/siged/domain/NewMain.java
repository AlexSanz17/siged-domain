/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.btg.ositran.siged.domain;

/**
 *
 * @author consultor_jti15
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena_1 = "JUAN CARLOS BENGOA ACHATA";
        int fin = cadena_1.indexOf("BENGOA");
        String nombreArchivo=cadena_1.substring(cadena_1.indexOf(']')+1);
        System.out.println("Valores=" + nombreArchivo);
    }
    
}
