/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10_1;

import javax.swing.JOptionPane;

/**
 *
 * @author aguinaldogonzalez
 */
public class Adivina {

    public void adivinar() {

        String numadivinar = JOptionPane.showInputDialog(null, "Ingresa el numero a adivinar entre 1 y 50");
        int numenteroadivinar = Integer.parseInt(numadivinar);
        if (numenteroadivinar >= 1 && numenteroadivinar <= 50) {
            String numerointentos = JOptionPane.showInputDialog(null, "Ingresa el numero de intentos");
            int numerointent = Integer.parseInt(numerointentos);
        } else {
            JOptionPane.showMessageDialog(null, "Introduce un numero válido");
        }
        
        int conta;
        int intentos=0;
        for (conta=0; conta==intentos; conta++){
            
        }
   
    
    }

}
