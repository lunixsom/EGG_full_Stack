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
public class ej6 {
    public static void main(String[] args){
        int num;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        num = leer.nextInt();
        
        esPar(num);
    }
    
    public static void esPar(int num){
        if (num % 2 == 0){
            System.out.println("El numero ingresado es PAR");
        } else {
            System.out.println("El numero ingresado en IMPAR");
          }
    }
}
