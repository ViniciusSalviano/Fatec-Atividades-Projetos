package pacote;

import java.util.Random;

public class GerarMatriz {
    public static int[][] popularMatrizAleatoria(int linhas, int colunas) {
        Random aleatorio = new Random();
        int[][] matriz = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = aleatorio.nextInt(5)+1;
            }
        }
        return matriz;
    }   
}
