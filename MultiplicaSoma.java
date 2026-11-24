/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao1;

import java.util.Scanner;

/**
 *
 * @author Gerfesson
 */
public class Questao1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int multiplicação;
        int soma;
        
        System.out.print("Digite seu primeiro Numero (A): ");
        int a = ler.nextInt();
       
        System.out.print("Digite seu segundo Numero (B): ");
        int b = ler.nextInt();
        
        multiplicação = a*b;
        soma = a+b;
        
        System.out.println("Multiplicação: " + multiplicação);
        System.out.println("Soma: " + soma);
        ler.close();
        
        
    }
}
