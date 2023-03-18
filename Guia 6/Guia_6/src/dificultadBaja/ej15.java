/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dificultadBaja;

// import java.util.Scanner;

public class ej15 {
    public static void main(String[] args){
        int vect[]= new int[100];
        
        llenarVec(vect);
        mostrarVec(vect);
    }
    
    public static void llenarVec(int vect[]){
    
        for (int i = 0; i < 100; i++) {
            vect[i] = i + 1;
        }
    }
    
    public static void mostrarVec(int vec[]){
        
        for (int i = 100; i > 0 ; i--) {
            System.out.println("[" + i + "]");
        }
    }
}
