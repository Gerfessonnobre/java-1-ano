/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao5;

import java.util.Scanner;

/**
 *
 * @author Gerfesson
 */
public class Questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double desconto;
        double valorComDesconto;
        double parcela;
        
        System.out.print("Digite seu RS ");
        double valor = scanner.nextDouble();
        
        desconto = (valor * 0.10);
        valorComDesconto = (valor - desconto);
        parcela = (valor / 3);
        
        System.out.println("O valor do desconto e de RS " + desconto);
        System.out.println("O valor final a vista e de RS " + valorComDesconto);
        System.out.println("O valor de cada parcela e de RS " + parcela);
    }
}
