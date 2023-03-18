/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dificultadMedia;

import java.util.Scanner;

public class ej14 {
    public static void main(String[] args){
        
        double euros = solicitarEuros();
        String moneda = solicitarMoneda();
        
        convertirMonedayMostrar(euros,moneda);
    }
    
    public static void convertirMonedayMostrar(double euros,String moneda){
        double vectorMonedas[] = {1.28611,129.852,0.86};
        
        switch (moneda){
        case "dolar":
            System.out.println("conversion: " + (euros*vectorMonedas[0]));
            break;
        case "yen":
            System.out.println("conversion: " + (euros*vectorMonedas[1]));
            break;
        case "libra":
            System.out.println("conversion: " + (euros*vectorMonedas[2]));
            break;
        default:
            System.out.println("La moneda seleccionada es incorrecta");
            solicitarEuros();
            solicitarMoneda();
        }
    }
    
    public static double solicitarEuros(){
        double euros;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese cantidad en Euros:");
        euros = leer.nextDouble();
                
        return euros;
    }
    
        public static String solicitarMoneda(){
        String moneda;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese moneda a convertir (Dolar | Yen | Libra) :");
        moneda = leer.nextLine();
                
        return moneda;
    }
}
