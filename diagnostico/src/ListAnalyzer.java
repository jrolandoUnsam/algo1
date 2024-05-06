import java.util.ArrayList;
import java.util.List;

public class ListAnalyzer {

    public static int contadorImpares(List<Integer> miLista) {
        int contador = 0;
        for (int numero : miLista) {  
            if (numero % 2 == 1) {  
                contador++;
            }
        }
        return contador; 
    }
    
    
    


    public static List<Integer> numerosConsecutivos(List<Integer> miLista) {
        List<Integer> numsCons = new ArrayList<>();
        for (int i = 0; i<miLista.size()-1; i++){
            int num = miLista.get(i);
            int numSig= miLista.get(i+1);

            if(num == (numSig-1)){
                numsCons.add(i);
            }
            
            //aca me trabé, no se como agregar el consecutivo.            
        }
        return numsCons;
        
    }

}
