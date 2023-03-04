/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dificultadMedia;

import java.util.Scanner;

public class ej12 {
    public static void main(String[] args){
        String frase, primerLetra, ultimaLetra;
        int longFrase;
        
        Scanner leer = new Scanner (System.in);
        
        do{
            System.out.println("Requisitos: ");
            System.out.println("1. cadena maximo de 5 caracteres");
            System.out.println("2. El primer caracter tiene que ser X");
            System.out.println("3. El ultimo caracter tiene que ser O");
            System.out.print("Ingrese cadena: ");
            frase = leer.nextLine();
            longFrase = frase.length();
            primerLetra = frase.substring(0, 1);
            ultimaLetra = frase.substring(longFrase - 1, longFrase);
            System.out.println(primerLetra);
            System.out.println(ultimaLetra);
        }while(!(longFrase<6) || !(primerLetra.equals("X")) || !(ultimaLetra.equals("O")));
        System.out.println("saliste del bucle");
    }
}
