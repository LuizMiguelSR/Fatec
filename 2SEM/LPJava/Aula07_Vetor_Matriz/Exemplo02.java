/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula07_Vetor_Matriz;

import java.util.Scanner;

/**
 *
 * @author Luiz Miguel
 */
public class Exemplo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.print("Informe o tamanho do vetor: "); 
        int n = in.nextInt();
        int[] vetor = new int[n];
        System.out.print("Informe os "+n+" elementos do vetor: ");
        for (int i = 0; i < n; i++) {
            vetor[i] = in.nextInt();
        }
        System.out.println("Vetor apenas com os números pares: ");
        for (int x = 0; x < n; x++){
            if (vetor[x]%2==0){
                System.out.print(vetor[x] + " ");
            }
        }
        System.out.println();
        in.close();
    }
    
}
