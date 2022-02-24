/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

import java.util.Scanner;

/**
 *
 * @author IFSC
 */
public class Aula1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leia = new Scanner (System.in);
       
       System.out.print("Qual é o seu nome: ");
       String nome = leia.nextLine();
       System.out.print(nome+"Bem vindo ao GitHub!!!");
    }
    
}
