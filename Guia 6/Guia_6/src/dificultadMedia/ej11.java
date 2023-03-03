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
public class ej11 {
    public static void main(String[] args){
        int num1, num2, opcion;
        
        Scanner leer = new Scanner(System.in);
        
        do{
            System.out.println("Ingrese 2 numeros enteros positivos");
            num1=leer.nextInt();
            num2=leer.nextInt();
        }while(num1<0 || num2<0);
        
        mostrarMenu();
        
        do{
            System.out.println("Elija una opcion: ");
            opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    sumar(num1,num2);
                    mostrarMenu();
                    break;
                case 2:
                    restar(num1,num2);
                    mostrarMenu();
                    break;
                case 3:
                    multiplicar(num1,num2);
                    mostrarMenu();
                    break;
                case 4:
                    dividir(num1,num2);
                    mostrarMenu();
                    break;
                default:
                    System.out.println("El valor ingresado no corresponde a los indicados en Menu");
            }
        } while(opcion!=5);
    }
    
    public static void mostrarMenu(){
        System.out.println("MENU");
        System.out.println("1. SUMAR");
        System.out.println("2. RESTAR");
        System.out.println("3. MULTIPLICAR");
        System.out.println("4. DIVIDIR");
        System.out.println("5. SALIR");
        System.out.println("Elija opción: ");
    }
    
    public static void sumar(int num1, int num2){
        System.out.println("La suma es: " + (num1 + num2));
    }
    public static void restar(int num1, int num2){
        System.out.println("La resta es: " + (num1 - num2));
    }
    public static void multiplicar(int num1, int num2){
        System.out.println("La multiplicacion es: " + num1 * num2);
    }
    public static void dividir(int num1, int num2){
        System.out.println("La division es: " + num1 / num2);
    }
}
