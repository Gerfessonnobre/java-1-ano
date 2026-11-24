/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao11switch_case;

import java.util.Scanner;

/**
 *
 * @author Gerfesson
 */
public class Questao11SWITCH_CASE {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um numero de 1 a 7: ");
        int dia = scanner.nextInt();
        
        switch (dia) {
            case 1: System.out.println("Segunda");
            break;
            
            case 2: System.out.println("Terça");
            break;
            
            case 3: System.out.println("Quarta");
            break;
            
            case 4: System.out.println("Quinta");
            break;
            
            case 5: System.out.println("Sexta");
            break; 
            
            default: System.out.println("Dia Invalido!");
            break;
        }
    }
}
