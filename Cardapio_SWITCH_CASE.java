q/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao12;

import java.util.Scanner;

/**
 *
 * @author Gerfesson
 */
public class Questao12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1 Cachorro Quente - R$ 10,00");
        System.out.println("2 X-Burguer - R$ 15,00");
        System.out.println("3 X-Salada - R$ 18,00");
        System.out.println("4 Refrigerante - R$ 6,00");
        
        System.out.print("Escolha: ");
        int pedido = scanner.nextInt();
        
        switch (pedido) {
            case 1:  System.out.println("1 Cachorro Quente - R$ 10,00");
            break;
            
            case 2:  System.out.println("2 X-Burguer - R$ 15,00");
            break;
            
            case 3:  System.out.println("3 X-Salada - R$ 18,00");
            break;
            
            case 4:  System.out.println("4 Refrigerante - R$ 6,00");
            break;
            
            default:  System.out.println("Opção não existe!");
            break;
    }
        
    }
}
