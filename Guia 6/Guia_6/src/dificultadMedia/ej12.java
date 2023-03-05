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
        int contadorIncorrectas = 0;
        int contadorCorrectas = 0;
        
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
            //System.out.println(primerLetra);
            //System.out.println(ultimaLetra);
            if ((longFrase<6) || (primerLetra.equals("X")) || (ultimaLetra.equals("O"))){
                contadorCorrectas++;
            } else {
                contadorIncorrectas++;
            }
        }while(!(frase.equals("&&&&&")));
        
        System.out.println("palabras correctas: " + contadorCorrectas);
        System.out.println("palabras incorrectas: " + contadorIncorrectas);
    }
}
