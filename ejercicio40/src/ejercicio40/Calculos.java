
package ejercicio40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculos {
    public static String calcular(String n){
        
        String respuesta = "";
        double cuadrado,raiz,cubo,num;
        
        List<String> numeros = new ArrayList<String>(Arrays.asList(n.split(",")));
        
        for (int i=0;i<numeros.size();i++) {
                num = Double.parseDouble(numeros.get(i));
                cuadrado = Math.pow(num, 2);
                raiz=Math.sqrt(num);
                cubo=Math.pow(num, 3);
                respuesta = respuesta + "Número: "+num+"\n"+"Cuadrado: "+cuadrado+"\n"+"Raiz: "+raiz+"\n"+"Cubo: "+cubo+"\n ///";
        }
        return respuesta;
    }
}
