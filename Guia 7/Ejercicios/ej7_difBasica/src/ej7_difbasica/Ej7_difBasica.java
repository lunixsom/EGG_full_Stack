
package ej7_difbasica;

import ej7_difbasica.entidades.Persona;
import ej7_difbasica.servicios.ServicioPersona;

public class Ej7_difBasica {

    public static void main(String[] args) {
        
        ServicioPersona sv = new ServicioPersona();
        Persona p1 = sv.crearPersona();
        Persona p2 = sv.crearPersona();
        Persona p3 = sv.crearPersona();
        //Persona p4 = sv.crearPersona();
        
        System.out.println("imc "+p1.calcularIMC());
        if (p1.calcularIMC() == -1){
            System.out.println("Su peso esta debajo del ideal");
        } if (p1.calcularIMC() == 0){
            System.out.println("Su peso es el ideal");
        } if (p1.calcularIMC() == 1){
            System.out.println("Tiene sobrepeso");
        }
        
        Persona arrayP[] = {p1, p2, p3};
        porcentajesEdad(arrayP);
    }
    
    public static void porcentajesEdad(Persona[] array){
        int contMay = 0;
        int contMen = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i].esMayorDeEdad()){
                contMay++;
            } else {
                contMen++;
            }
        }
        
        System.out.println("Mayores son: "+contMay+" , menores son: "+contMen);
    }
}
