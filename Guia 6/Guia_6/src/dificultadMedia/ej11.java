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
        double divic;
        
        Scanner leer = new Scanner(System.in);
        
        do{
            System.out.println("Ingrese 2 numeros enteros positivos");
            num1=leer.nextInt();
            num2=leer.nextInt();
        }while(num1<0 || num2<0);
        
        System.out.println(" ");
        
        mostrarMenu();
        
        System.out.println(" ");
        
        do{
            opcion = leer.nextInt();
            
            System.out.println(" ");
            
            switch(opcion){
                case 1:
                    mostrarResultado(sumar(num1, num2));
                    mostrarMenu();
                    break;
                case 2:
                    mostrarResultado(restar(num1, num2));
                    mostrarMenu();
                    break;
                case 3:
                    mostrarResultado(multiplicar(num1, num2));
                    mostrarMenu();
                    break;
                case 4:
                    mostrarResultado(dividir(num1, num2));
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
        System.out.print("Elija opción: ");
    }
    
    public static void mostrarResultado(double resultado){
        System.out.println("La resultado es: " + resultado);
        System.out.println(" ");
    }
    
    public static int sumar(int num1,int num2){
        return (num1 + num2);
    }
    
    public static int restar(int num1, int num2){
        return (num1 - num2);
    }
    public static int multiplicar(int num1, int num2){
        return (num1 * num2);
    }
    public static double dividir(int num1, int num2){
        double divi = ((num1*1.0) / num2); 
        return divi;
    }
}
