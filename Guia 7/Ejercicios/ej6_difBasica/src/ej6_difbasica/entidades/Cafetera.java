
package ej6_difbasica.entidades;

public class Cafetera {
    
    public int capacidadMaxima;
    public int cantidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }
    
    public void llenarCafetera(){
        cantidadActual = capacidadMaxima;
    }
    
    public void vaciarCafetera(){
        cantidadActual = 0;
    }
    
    public void agregarCafe(int cantidad){
       cantidadActual += cantidad;
    }
    
    public void servirTaza(int tamañoTaza){
        if(cantidadActual >= tamañoTaza ){
            cantidadActual -= tamañoTaza;
            System.out.println("Se lleno la taza con cafe");
            System.out.println("Queda en la cafetera "+cantidadActual+" ml");
        } else {
            System.out.println("No se lleno la taza, solo se sirvio " +cantidadActual+ " ml de los " +tamañoTaza+ " ml de la taza");
            vaciarCafetera();
        }
    }
}
    
    

