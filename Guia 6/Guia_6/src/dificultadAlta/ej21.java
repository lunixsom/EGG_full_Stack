/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dificultadAlta;

import java.util.Scanner;

public class ej21 {
    public static void main(String[] args){
        int[][] matrizM = new int[4][4];
        int[][] matrizP = new int[2][2];
        
        Scanner leer = new Scanner(System.in); 
        
        llenarMatriz(matrizM);
        llenarMatriz(matrizP);
        
        mostrarMatriz(matrizM);
        mostrarMatriz(matrizP);
    }

    
    public static void llenarMatriz(int[][] matriz){
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int)(Math.random()*10);    
            }
        }
    }
    
    public static void mostrarMatriz(int[][]matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "");
            }
            System.out.println("");             
        }
    }
    
  /*  public static boolean identicas(int[][] matrizM, int[][] matrizP){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                
            }
        }
    }*/
}
