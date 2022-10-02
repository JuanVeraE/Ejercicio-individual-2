package parte2;

public class Circulo {
    int radio;
    
    Circulo(int radio){
        this.radio = radio;
    }
    
    double calcularArea(){
        return (Math.PI*radio*radio);
    }
    
    double calcularPerimetro(){
        return (2*Math.PI*radio);
    }
}
