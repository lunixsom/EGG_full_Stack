
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
    
    public void ingresar(Cuenta objeto){
        
        System.out.println("Ingresar monto a depositar: ");
        double monto = leer.nextDouble();
        
        objeto.aumentarSaldoActual(monto);
    }
}
