/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dificultadMedia;

import java.util.Scanner;

public class ej17 {
    public static void main(String[] args){        
        //int cant;
        int[] vect = {1,123,55643,42,7};
        
        Scanner leer = new Scanner(System.in);
        
//        System.out.print("Ingresa tamaño del vector: ");
//        cant = leer.nextInt();
        
        //vect = llenarConAleatorios(cant);
        
        mostrarVect(vect);
        
        contaPorDigitosHastaCinco(vect);
        
    }
    
//    public static int[] llenarConAleatorios(int tamanio){
//        int vect[] = new int[tamanio];
//
//        for (int i = 0; i < tamanio; i++) {
//            vect[i] = (int) (Math.random() * 100000);
//        }
//
//        return vect;
//    }
    
        public static void mostrarVect(int[] vect){
        for (int i = 0; i < vect.length; i++) {
            System.out.print("[" + vect[i] + "]");
        }
    }
        
        public static void contaPorDigitosHastaCinco(String[] vect){
            
        }
}
