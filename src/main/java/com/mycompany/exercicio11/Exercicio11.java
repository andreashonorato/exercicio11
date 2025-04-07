
package com.mycompany.exercicio11;

import javax.swing.JOptionPane;
public class Exercicio11 {

    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
        if( (a %2)==0){
            JOptionPane.showMessageDialog(null, "é Multiplo de 2!");
        }else{
            JOptionPane.showMessageDialog(null, "Não é multiplo de 2!");
        }
            
        }
    }

