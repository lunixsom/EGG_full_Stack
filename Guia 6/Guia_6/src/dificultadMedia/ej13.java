/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dificultadMedia;

import java.util.Scanner;

public class ej13 {
    public static void main(String[] args){
        int cant;
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese cantidad de elementos: ");
        cant = leer.nextInt();
        
        for (int i = 0; i < cant; i++) {
            System.out.print("*");
            if (i == 0 || i == cant){
                for (int j = 0; j < (cant - 1); j++) {
                    System.out.println("*");
                }
            }
            /*for (int j = 0; j < cant; j++) {
                System.out.print("*");
            } */               
        }
    }
}
