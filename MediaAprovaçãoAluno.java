    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicioifeelse;

import javax.swing.JOptionPane;

/**
 *
 * @author Gerfesson
 */
public class ExercicioIFeElse {

    public static void main(String[] args) {
        double media = 0,n1,n2;
        n1=Double.parseDouble(JOptionPane.showInputDialog("Digite sua 1 nota"));
        n2=Double.parseDouble(JOptionPane.showInputDialog("Digite sua 2 nota"));
        media = (n1+n2)/2;
        
            if (media >= 5) {
                
                if (media >= 7) {JOptionPane.showMessageDialog(null, "Aluno Aprovado");}
                else{JOptionPane.showMessageDialog(null, "Aluno precisa de uma nova avaliação"); }
                
            }else {JOptionPane.showMessageDialog(null, "Aluno Reprovado");
            }
        
    }
}
