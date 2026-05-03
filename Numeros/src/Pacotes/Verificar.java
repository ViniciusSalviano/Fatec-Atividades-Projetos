package Pacotes;
import java.util.Random;
public class Verificar {
    public void verificarrandom(int numeros[]){
        Random rand = new Random();
        int N = rand.nextInt(20)+1;

        for(int i = 0; i<numeros.length; i++){
            if (numeros[i]== N) {
                System.out.println("O numero aleatorio "+N+" existe no vetor na posição: "+(i+1)+"°");
            }
        }
        int aux = 0;
        for(int i = 0; i<numeros.length; i++){
            if(numeros[i] == N){
                aux = 0;
                break;
            } else{
                aux = 1;
            }
        }
        if (aux == 1) {
            System.out.println("\nO numero aleatorio "+N+" não existe no vetor");
        }
        
        
    }
}
