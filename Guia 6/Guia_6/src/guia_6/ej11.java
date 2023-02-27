package guia_6;

import java.util.Scanner;

public class ej11 {
     public static void main(String[] args) {     
        String frase;
        Scanner leer = new Scanner(System.in);
          
        do {
            System.out.println("Ingrese su oración (debe terminar con el caracter '.' ): ");
            frase = leer.nextLine();
        } while(!(frase.endsWith(".")));    

        String fraseCodificada = codificar(frase);
        System.out.println("la nueva frase CODIFICADA es: " + fraseCodificada);
     }
     
    public static String codificar (String frase){
        String fraseCodificada = "";
        int longitudFrase = frase.length();
          
        for (int i = 0; i < longitudFrase; i++) {
            switch(frase.charAt(i)){
                case 'A':
                    fraseCodificada = fraseCodificada.concat("@");
                    break;
                case 'e':
                    fraseCodificada = fraseCodificada.concat("#");
                    break;
                case 'i':
                    fraseCodificada = fraseCodificada.concat("$");
                    break;
                case 'o':
                    fraseCodificada = fraseCodificada.concat("%");
                    break;    
                case 'u':
                    fraseCodificada = fraseCodificada.concat("*");
                    break;
                default:
                    fraseCodificada = fraseCodificada + (frase.charAt(i));
            }
        }   
        return fraseCodificada;
    } 
}
