/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author daseg
 */
public class Mavenproject8 {

    public static void main(String[] args) throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        
        System.out.println("Ingrese el primer numero");
        String strNumero = buffer.readLine();
        Integer numero = Integer.valueOf(strNumero);
        
        //Boolean esPar = (numero % 2) == 0
        boolean esPar = (numero % 2) == 0;
        
        
        if (esPar) {
            System.out.println("El numero es par");
        } else {
            System.out.println ("El numero es impar");
        }        
    }
}