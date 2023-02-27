/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_6;

import java.util.Scanner;

public class ej10 {

    public static void main(String[] args) {    
       
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los 4 numeros :");
        for (int i = 0; i < 4; i++) {
            int num = leer.nextInt();
            System.out.print(num + " ");
            for (int j = 0; j < num; j++) {               
                System.out.print("*");
            }   
                System.out.println(" ");
        }
    }
}
