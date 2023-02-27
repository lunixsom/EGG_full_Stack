/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_6;

import java.util.Scanner;

public class ej9 {
    
    public static void main(String[] args) {    
        Scanner leer = new Scanner(System.in);

        int num;
        int contador = 0;
        int suma = 0;
        
        do {
            System.out.println("Ingrese un numero:");
            num = leer.nextInt();
            if (num>0){
                suma += num;
            }
            contador++;
        } while (!(num == 0) && !(contador == 5) );

        System.out.println("Se capturo el numero 0");
        System.out.println("La suma de los numeros leidos es: " + suma);
    }
}
