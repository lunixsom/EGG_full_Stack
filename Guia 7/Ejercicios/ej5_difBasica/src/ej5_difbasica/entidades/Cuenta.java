
package ej5_difbasica.entidades;

import java.util.Scanner;

public class Cuenta {
   
    private int numeroCuenta;
    private int dni;
    private int saldoActual;
    
    Scanner leer = new Scanner(System.in);

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, int dni, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getDni() {
        return dni;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    public void aumentarSaldoActual(double monto){
        saldoActual += monto;  
    }
    
    public void disminuirSaldoActual(double monto){
        if(monto>saldoActual){
            saldoActual = 0;
        } else{
            saldoActual -= monto;
          }        
    }
    
    public void consultarSaldo(){
    
        System.out.println("El saldo actual en su cuenta es: " + getSaldoActual());
    }
    
    public void consultarDatos(){
    
        System.out.println("El numero de cuenta es: " + getNumeroCuenta());
        System.out.println("El numero de DNI es: " + getDni());
    }

    public void ingresar(double monto){
        
        aumentarSaldoActual(monto);
    }
    
    public void retirar(double monto){
     
        disminuirSaldoActual(monto);
    }
    
    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", dni=" + dni + ", saldoActual=" + saldoActual + '}';
    }
    
    
    
}
