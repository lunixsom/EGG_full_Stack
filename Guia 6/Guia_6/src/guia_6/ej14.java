/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_6;

import java.util.Scanner;

public class ej14 {
        public static void main(String[] args) {
            String[] equipo = new String[5];

            Scanner leer = new Scanner(System.in);

            for (int i = 0; i < 5; i++) {
                System.out.println("Ingrese el nombre: ");
                equipo[i] = leer.nextLine();
            }
            
            mostrarVector(equipo);
        }
        
        public static void mostrarVector(String equipo[]){
            for (int i = 0; i < 5; i++) {
                    System.out.println("nombre" + "[" + i + "]: "+ equipo[i]);                  
            }
        }
}
