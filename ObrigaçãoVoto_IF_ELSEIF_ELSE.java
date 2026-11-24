''    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao9;

import java.util.Scanner;

/**
 *
 * @author Gerfesson
 */
public class Questao9 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.print("Digite sua idade: ");
       int idade = scanner.nextInt();
       
       if (idade < 16) {System.out.println("Não pode Votar");}
       else if (idade >15 && idade <18 || idade >= 70) {System.out.println("Voto facultativo(Nao obrigatorio)");}
       else {System.out.println("Voto obrigatorio");
       
       }
    }
}
