package ejercicior10;

public class calculoPago {
    public static boolean verificar(double patrimonio, double estrato) {
        boolean v;
        if ((patrimonio > 2000000) && (estrato > 3)){
        v = true;
        } else {
            v = false;
        }
        return v;
    }
    public static double calculo(double patrimonio) {
        double p;
        p = 50000 + (patrimonio * 0.03);
        return p;
    }
}
