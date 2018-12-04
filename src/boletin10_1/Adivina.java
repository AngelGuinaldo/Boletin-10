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
    private int numeroadivinar;
    private int numerointentos;
    
    
    public int pedirNumero(){
        do{
        numeroadivinar = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero a adivinar entre 1 y 50")); 
        }while(numeroadivinar<1 || numeroadivinar>50);
        return numeroadivinar;
    }
    public int numeroIntentos(){
        
        numerointentos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de intentos"));
        return numerointentos;
        
    }
    public void adivinar() {
        
        for(int cont=0;cont<numerointentos;cont++){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero que creas correcto"));
        if(num>numeroadivinar)
            JOptionPane.showMessageDialog(null,"El numero secreto es menor");
        else if(num<numeroadivinar)
            JOptionPane.showMessageDialog(null,"El numero secreto es mayor");
        else{
            JOptionPane.showMessageDialog(null,"Has acertado");
            cont=numerointentos;
        }
        }
            
      
            
    }
   
    
    }


