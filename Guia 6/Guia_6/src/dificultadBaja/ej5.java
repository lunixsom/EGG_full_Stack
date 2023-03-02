/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dificultadBaja;

import java.util.Scanner;
/**
 *
 * @author esome
 */
public class ej5 {
    public static void main(String[] args){
        double num;
    
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        num = leer.nextDouble();
        
        mostrarDoble(num);
        mostrarTriple(num);
        mostrarRaizCuadrada(num);
    }
    
    public static void mostrarDoble(double num){
        System.out.println("El doble del numero ingresado es: " + num*2);
    }
    
    public static void mostrarTriple(double num){
        System.out.println("El triple del numero ingresado es: " + num*3);
    }
        
    public static void mostrarRaizCuadrada(double num){
        System.out.println("La raiz cuadrada del numero ingresado es: " + Math.sqrt(num));
    }
}
