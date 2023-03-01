/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_6;

import java.util.Scanner;

/**
 *
 * @author intercab
 */
public class ej12 {
     public static void main(String[] args) {
         
         int num1, num2;
         
         Scanner leer = new Scanner(System.in);
         
         System.out.println("Ingrese los dos numeros: ");
         
         num1 = leer.nextInt();
         num2 = leer.nextInt();
         
         esMultiplo(num1, num2);
     }
     
     public static void esMultiplo(int num1, int num2){
         if ((num1 % num2) == 0){
             System.out.println("El primer numero es multiplo del segundo");
        } else {
             System.out.println("No son multiplos");
          }
     }
}
