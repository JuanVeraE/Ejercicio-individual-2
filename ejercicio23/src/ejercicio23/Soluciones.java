package ejercicio23;

public class Soluciones {
    public static double[] calcular(double a, double b, double c){
        double s1, s2;
        s1 =  (-b + Math.sqrt(((b*b)-(4*a*c))))/(2*a);
        s2 =  (-b - Math.sqrt(((b*b)-(4*a*c))))/(2*a);
        
        double ls[] = new double[2];
        ls[0] = s1;
        ls[1] = s2;
       
        return ls;
    }
}
