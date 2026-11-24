/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._questao2;

import java.util.Scanner;

/**
 *
 * @author Gerfesson
 */
public class ClassificaMediaAluno {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
        System.out.print("Digite sua nota 1");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Digite sua nota 2");
        double nota2 = scanner.nextDouble();
        
        System.out.print("Digite sua nota 3");
        double nota3 = scanner.nextDouble();
        
        double media = (nota1+nota2+nota3)/3;
        
        if (media <5) {System.out.println("Seu conceito é D");}
        if (media >=5  && media<7) {System.out.println("Seu conceito é C");}
        if (media >=7 && media<9) {System.out.println("Seu conceito é B");}
        if (media >=9 && media <10) {System.out.println("Seu conceito é A");}
       
        else {System.out.println("Sua média não clasificasse em nenhum dos conceitos");}
        System.out.println("Sua média foi : " + media);
        
        
    }
}
