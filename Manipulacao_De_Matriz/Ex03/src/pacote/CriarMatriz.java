package pacote;

import java.util.Random;

public class CriarMatriz {
    public int[][] GerarMatriz(){
        int[][] resultado = new int[4][4];
        Random random = new Random();
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado.length; j++) {
                resultado[i][j] = random.nextInt(20)+1;
            }
        }
        return resultado;
    }
}
