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
public class ej4 {
    public static void main(String[] args){
        int gradosCentigrados;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese grados centigrados: ");
        gradosCentigrados = leer.nextInt();
        
        pasarAFahrenheitYMostrar(gradosCentigrados);
    }
    
    public static void pasarAFahrenheitYMostrar(int gradosCentigrados){
        int gradosF = 32 + (9 * gradosCentigrados/5);
        
        System.out.println("Es equivalente en Fharenheit a: " + gradosF);
    }
}
