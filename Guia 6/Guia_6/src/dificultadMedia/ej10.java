/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dificultadMedia;

import java.util.Scanner;
/**
 *
 * @author UdeSA
 */
public class ej10 {
    public static void main(String[] args){
        int suma = 0;
        int num1, numLimite;
        
        Scanner leer = new Scanner(System.in);
        
        do{
            System.out.println("Ingrese un numero limite positivo por fa: ");
            numLimite = leer.nextInt();
        } while(numLimite<0);
        
        while (suma <= numLimite){
            System.out.println("Ingrese numero");
            num1 = leer.nextInt();
            suma = suma + num1;
        }
    }
}
