/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplo_aula_8;

import javax.swing.JOptionPane;

/**
 *
 * @author Gerfesson
 */
public class EXEMPLO_AULA_8 {

    public static void main(String[] args) {
        int idade;
        String nome;
        
        nome = JOptionPane.showInputDialog("Digite seu nome");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?"));
        JOptionPane.showMessageDialog(null,"Obrigado por informar seus dados" + nome + idade);
    }
}
