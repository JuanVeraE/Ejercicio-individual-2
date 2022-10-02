package ejercicio18;

public class calcularSalario {
    public static double Salariobruto(double valorHora, double numHoras){
        double salarioBto;
        salarioBto = valorHora * numHoras;
        return salarioBto;
    }
    public static double Salarioneto(double valorHora, double numHoras, double ret){
        double salarioNto;
        salarioNto = (valorHora * numHoras) - ((valorHora * numHoras) * ret/100);
        return salarioNto;
    }
}
