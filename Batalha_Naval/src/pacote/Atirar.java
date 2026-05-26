package pacote;

import java.util.Random;

public class Atirar {
    public boolean atirarAleatoriamente(char[][] tabuleiroAlvo) {
        Random random = new Random();
        int linha, coluna;

        do {
            linha = random.nextInt(5);
            coluna = random.nextInt(5);
        } while (tabuleiroAlvo[linha][coluna] == '*' || tabuleiroAlvo[linha][coluna] == '-');

        if (tabuleiroAlvo[linha][coluna] == 'X') {
            tabuleiroAlvo[linha][coluna] = '*';
            return true;
        } else {
            tabuleiroAlvo[linha][coluna] = '-';
            return false;
        }
    }    
}
