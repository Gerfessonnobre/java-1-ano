/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._questao1;

import java.util.Scanner;

/**
 *
 * @author Gerfesson
 */
public class VerificaPositivoNegativo {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
        double a;
        double b;
       
       System.out.print("Digite o seu Numero");
       double numero = input.nextDouble();
       
       if (numero >=0) {
           a = numero;
           System.out.println("Seu numero está em A");
       } else {
           b = numero;
           System.out.println("Seu numero está em B");
           
       }
       
        
    }
}
