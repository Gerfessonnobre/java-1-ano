/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao7;

import java.util.Scanner;

/**
 *
 * @author Gerfesson
 */
public class Questao7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double media;
        
        System.out.print("Digite sua nota 1: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Digite sua nota 2: ");
        double nota2 = scanner.nextDouble();
        
        media = (nota1 + nota2)/2;
        
        if (media >= 6) {System.out.println("Aprovado com media: " + media);}
        else {System.out.println("Reprovado com media: " + media);}
        
    }
}
