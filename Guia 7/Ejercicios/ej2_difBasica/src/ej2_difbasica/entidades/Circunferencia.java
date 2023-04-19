
package ej2_difbasica.entidades;

public class Circunferencia {
  
    private float radio;
    
    // a)
    
    public Circunferencia(){}
    
    public Circunferencia(float radio){
        this.radio = radio;
    }

    // b)
    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    // d)
    
    public Double area(){
       
        Double area = ((radio*radio)*Math.PI);
        
        return area;
    }
    
    // e)
    
    public Double perimetro(){
    
        Double perimetro = 2*radio*Math.PI;
        
        return perimetro;
    }
}   
