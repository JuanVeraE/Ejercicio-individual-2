package ejercicio19;

public class calculosTriangulo {
    public static double perimetro(int lado){
        double per;
        per = 3*lado;
        return per;
    }
    public static double altura(int lado){
        double alt;
        alt = (lado*0.5*Math.sqrt(3));
        return alt;
    }
    public static double areaT(int lado, double alturaT){
        double area;
        area = (lado * alturaT)/2;
        return area;
    }
}
