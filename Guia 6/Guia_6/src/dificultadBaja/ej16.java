/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dificultadBaja;

import java.util.Scanner;

public class ej16 {

    public static void main(String[] args){
        int tamanio, num;
        int[] vect;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese tamanio de vector a rellenar: ");
        tamanio = leer.nextInt();
        
        vect = llenarConAleatorios(tamanio);
        mostrarVect(vect, tamanio);
        System.out.println("");
        System.out.println("");
        
        System.out.print("Ingrese numero a buscar en vector: ");
        num = leer.nextInt();
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("El numero " + estaNumEnVect(num, vect) + ", en la posicion: " + posicionNum(num, vect) + " y " + estaRepetido(num, vect)); 
   }
    
    public static int[] llenarConAleatorios(int tamanio){
        int vect[] = new int[tamanio];
        
        for (int i = 0; i < tamanio; i++) {
            vect[i] = (int) (Math.random() * 10);
        }
     
        return vect;
    }
    
    public static void mostrarVect(int[] vect, int tamanio){
        for (int i = 0; i < tamanio; i++) {
            System.out.print("[" + vect[i] + "]");
        }
    }
    
    public static String estaNumEnVect(int num, int[] vect){
        boolean encontrado = false;
        for (int n : vect) {
            if (n == num) {
                encontrado = true;
                break;
            }
        }
        if (encontrado){
            return "SI se encuentra en el vector";
        } else{
            return "NO se encuentra en el vector";
        }
    }
    
    public static int posicionNum(int num, int[] vect){
            int posicion  = 0;
            
            for (int i = 0; i < vect.length; i++) {
                if (vect[i] == num) {
                    posicion = i;
                    break;
                }
            }
            return posicion;
    }
    
    public static String estaRepetido(int num, int[] vect){
        boolean bandera = false;
        int contador = 0;
            for (int i = 0; i < vect.length; i++) {
                if (vect[i] == num) {
                    contador++;   
                }
                if (contador > 1){
                    bandera = true;
                }
            }
        if (bandera){
            return "SI esta repetido";
        } else{
            return "NO esta repetido";
          }          
    }
}
