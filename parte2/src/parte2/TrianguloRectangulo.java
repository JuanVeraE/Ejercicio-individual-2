package parte2;

public class TrianguloRectangulo {
    int base;
    int altura;
    public TrianguloRectangulo (int base,int altura){
        this.base = base;
        this.altura = altura;
    }
    
    double calcularArea(){
        return (base * altura)/2;
    }
    
    double calcularPerimetro(){
        return (base + altura + calcularHipotenusa());
    } 
    
    double calcularHipotenusa(){
        return Math.pow(base*base + altura*altura, 0.5);
    }
    
    String determinarTipoTriangulo() {
        if ((base == altura) && (base == calcularHipotenusa())&&(altura == calcularHipotenusa())){
            return("Es un triangulo equilátero");
        } else if ((base != altura) && (base != calcularHipotenusa())&&(altura != calcularHipotenusa())){
            return("Es un triangulo escaleno");
        } else {
            return("Es un triangulo isóceles");
        }
    }
}
