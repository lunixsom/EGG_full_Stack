/*
 * To change this license header, choose License Headers in Project Properties.
 * To changporte this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dificultadBaja;

import java.util.Scanner;

/**
 *
 * @author esome
 */
public class ej1 {
    public static void main(String[] args){
        int num1, num2;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los dos numeros a sumar: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        mostraSumaEnPantalla(num1, num2);
    }
    
    public static void mostraSumaEnPantalla(int num1, int num2){
        int suma = num1 + num2;
        System.out.println("El resultado de la suma es: " + suma);
    }
}
