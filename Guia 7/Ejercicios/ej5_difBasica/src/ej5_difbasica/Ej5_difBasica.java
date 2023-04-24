
package ej5_difbasica;

import ej5_difbasica.entidades.Cuenta;
import ej5_difbasica.servicios.ServicioCuenta;
import java.util.Scanner;

public class Ej5_difBasica {

    public static void main(String[] args) {
        double monto;
        
        Scanner leer = new Scanner(System.in);
        
        ServicioCuenta sv = new ServicioCuenta();
        
        Cuenta c1 = sv.crearCuenta();
        
        System.out.print("Ingresar monto a depositar: ");
        monto = leer.nextDouble();
        c1.ingresar(monto);
        
        System.out.println(c1);
        
        System.out.print("Ingrese monto a retirar: ");
        monto = leer.nextDouble();
        c1.retirar(monto);
        
        System.out.println(c1);
        
        c1.consultarSaldo();
        
        sv.extraccionRapida(c1);
        
        c1.consultarSaldo();
                
    }
    
}
