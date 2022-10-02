package ejercicio41;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Verificar {
    public static int calcular(String n){
        
        String respuesta = "";
        int nMayor = 0, num;
        
        List<String> numeros;
        numeros = new ArrayList<String>(Arrays.asList(n.split(",")));
        
        for (int i=0;i<numeros.size();i++) {
            num = Integer.parseInt(numeros.get(i));
            if (num > nMayor) {
                nMayor = num;
            }
        } 
        return nMayor;
    }
}
