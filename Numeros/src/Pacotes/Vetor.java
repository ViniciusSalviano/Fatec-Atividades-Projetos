package Pacotes;
import java.util.Random;
public class Vetor {
    public int[] gerandovetor(){
        Random rand = new Random();
        int[] resultado = new int[10];
        for(int i = 0; i<resultado.length;i++){
            resultado[i] = rand.nextInt(20)+1;
        }
        return resultado;
    }
}
