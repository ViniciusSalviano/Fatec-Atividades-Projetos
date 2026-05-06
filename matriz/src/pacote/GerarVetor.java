package pacote;

import java.util.Random;

public class GerarVetor {
    public static int[] popularVetorAleatorio(int tamanho) {
        Random aleatorio = new Random();
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = aleatorio.nextInt(5)+1;
        }
        return vetor;
    }
}
