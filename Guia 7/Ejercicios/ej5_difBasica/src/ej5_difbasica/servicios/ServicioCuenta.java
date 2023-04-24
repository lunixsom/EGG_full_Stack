
package ej5_difbasica.servicios;

import ej5_difbasica.entidades.Cuenta;
import java.util.Scanner;

public class ServicioCuenta {
    
    Scanner leer = new Scanner(System.in);
    
    public Cuenta crearCuenta(){
        System.out.print("Ingresa tu numero de cuenta: ");
        int numeroCuenta = leer.nextInt();
        System.out.print("Ingresa tu numero de dni (sin punto): ");
        int dni = leer.nextInt();
        System.out.print("Ingresa tu saldo actual: ");
        int saldoActual = leer.nextInt();
        
      return new Cuenta(numeroCuenta,dni,saldoActual);  
    }
    
    public void extraccionRapida(Cuenta objeto){
        int monto;
        do{
            System.out.print("Ingrese monto menor al 20%: ");
            monto = leer.nextInt();
        }while(monto>(objeto.getSaldoActual()*.2));
        
        objeto.retirar(monto);
    }                
}
