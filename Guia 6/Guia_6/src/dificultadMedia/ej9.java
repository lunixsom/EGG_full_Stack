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
public class ej9 {
    public static void main(String[] args){
        String frase;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese frase: ");
        frase = leer.nextLine();
        
        primerLetraEsA(frase);
    }
    
    public static void primerLetraEsA(String frase){
        String primerLetra = frase.substring(0,1);
        //System.out.println(primerLetra);
        if(primerLetra.equals("A")){
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
