/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._questao3;

import java.util.Scanner;

/**
 *
 * @author Gerfesson
 */
public class App {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      
      int numero;
      int P = 0;
      int I = 0;
      
      System.out.print("Digite Seu Numero: ");
      numero = entrada.nextInt();
      
      if(numero % 2 == 0) {
          P = numero;
      } else { I = numero;
      }
      System.out.println("Seu numero PAR é: " + P);
      System.out.println("Seu numero IMPAR é: " + I);
                    
            }
    }

