package pacote;

import java.util.Random;

public class Posicionar {
    public void posicionarNavios(char[][] tabuleiro) {
        Random random = new Random();
        int naviosPosicionados = 0;

        while (naviosPosicionados < 10) {
            int linha = random.nextInt(5);
            int coluna = random.nextInt(5);

            if (tabuleiro[linha][coluna] != 'X') {
                tabuleiro[linha][coluna] = 'X';
                naviosPosicionados++;
            }
        }
    }
}
