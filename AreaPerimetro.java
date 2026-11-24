/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao3;

import java.util.Scanner;

/**
 *
 * @author Gerfesson
 */
public class Questao3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double area;
        double perimetro;
        
        System.out.print("Digite a Largura do Retangulo: ");
        double largura = scanner.nextDouble();
        
        System.out.print("Digite a Altura do Retangulo: ");
        double altura = scanner.nextDouble();
        
        area = largura*altura;
        perimetro = (largura + altura) + (largura + altura);
        
        System.out.println("A area do Retangulo e: " + area);
        System.out.println("O perimetro do Retangulo e: " + perimetro);
        
        
    }
}
