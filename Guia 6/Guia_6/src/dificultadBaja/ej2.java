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
public class ej2 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = leer.nextLine();
        mostrarNombreEnPantalla(nombre);
   
   }
    
    public static void mostrarNombreEnPantalla(String nombre){    
        System.out.println("El nombre ingresado es: " + nombre);
    }
}
