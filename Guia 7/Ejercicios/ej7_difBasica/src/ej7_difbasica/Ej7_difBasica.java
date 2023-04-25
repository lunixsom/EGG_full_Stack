
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

        decimeMiEstadoPeso(p1);
        
        Persona arrayP[] = {p1, p2, p3};
        
        porcentajesEdad(arrayP);
        porcentajesPeso(arrayP);
    }
    
    public static void decimeMiEstadoPeso(Persona unaPersona){
        if (unaPersona.calcularIMC() == -1){
            System.out.println("Su peso esta debajo del ideal");
        } if (unaPersona.calcularIMC() == 0){
            System.out.println("Su peso es el ideal");
        } if (unaPersona.calcularIMC() == 1){
            System.out.println("Tiene sobrepeso");
        }
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
    
        public static void porcentajesPeso(Persona[] array){
        int contBajo = 0;
        int contIdeal = 0;
        int contSobre = 0;
        
        for (int i = 0; i < array.length; i++){
            if (array[i].calcularIMC() == -1){
                contBajo++;
            } if (array[i].calcularIMC() == 0){
                contIdeal++;
            } if (array[i].calcularIMC() == 1){
                contSobre++;
            }
        }
        
        System.out.println("Bajo peso son: "+contBajo+" , Ideal son: "+contIdeal+", Sobrepeso son: "+contSobre);
    }
}
