package pacote;

public class CriarTabuleiro {
    public char[][] inicializarTabuleiro() {
        char[][] tabuleiro = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                tabuleiro[i][j] = '~';
            }
        }
        return tabuleiro;
    }    
}
