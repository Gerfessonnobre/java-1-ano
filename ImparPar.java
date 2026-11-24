/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao6;

import java.util.Scanner;

/**
 *
 * @author Gerfesson
 */
public class Questao6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu numero inteiro: ");
        int numero = scanner.nextInt();
        
        if (numero % 2 ==0) {
            System.out.println("Seu numero e Par");}
        else { System.out.println("Seu numero e Impar");}
        
        }
    }

