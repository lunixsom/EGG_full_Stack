/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dificultadMedia;

import java.util.Scanner;

public class ej14 {
    public static void main(String[] args){
        double euros;
        String moneda;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad en Euros: ");
        euros = leer.nextDouble();
        System.out.println("Ingrese a que moneda realizar conversion: ");
        moneda = leer.nextLine();
        
        convertirMonedayMostrar(euros,moneda);
    }
    
    public static void convertirMonedayMostrar(double euros,String moneda){
        double vectorMonedas[] = {12.3,1.22,129.123};
        
        System.out.println("vec: " + vectorMonedas[1]);
        System.out.println("conversion: " + (euros*vectorMonedas[0]));
    }
}
