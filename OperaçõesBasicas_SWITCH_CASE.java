/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao13;

import java.util.Scanner;

/**
 *
 * @author Gerfesson
 */
public class Questao13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double resultado;
        
        System.out.print("Digite seu 1 numero: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Digite seu 2 numero: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("1: Somar (num1 + num2)");
        System.out.println("2: Subtrair (num1 - num2)");
        System.out.println("3: Multiplicar (num1 * num2)");
        System.out.println("4: Dividir (num1 / num2)");
        
        System.out.print("Escolha: ");
        int escolha = scanner.nextInt();
        
        switch (escolha) {
            case 1: 
                resultado = (num1 + num2);
                System.out.println("O resultado da soma é:" + resultado);
                break;
                
            case 2 : 
                resultado = (num1 - num2);
                System.out.println("O resultado da subtração é: " + resultado);
                break;
                
            case 3:
                resultado = (num1 * num2);
                System.out.println("O resultado da multiplicação é: " + resultado);
                break;
                
            case 4:
                resultado = (num1 / num2);
                System.out.println("O resultado da divisão é: " + resultado);
                break;
        }
    }
}
