package ejercicio22;

public class Salario {
    public static boolean verificar (int salarioH, int valorH){
        boolean v;
        if ((salarioH * valorH) > 450000) {
            v = true;
        } else {
            v = false;
        }
        return v;
    }
}
