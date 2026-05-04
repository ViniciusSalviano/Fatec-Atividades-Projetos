package campominado;

import java.util.Random;
import java.util.Scanner;

public class CampoMinado {

    public int[] tabuleiro = new int[81];
    public int[] revelado = new int[81];
    public Scanner sc = new Scanner(System.in);

    public void iniciar() {
        gerarTabuleiro();
        while (jogoCompleto() == 0) {
            exibirTabuleiro();
            if (fazerJogada() == -1) {
                exibirTabuleiro();
                System.out.println("Boom! Voce pisou em uma mina! Game over.");
                return;
            }
        }
        exibirTabuleiro();
        System.out.println("Parabens! Voce revelou todas as celulas!");
    }

    public void gerarTabuleiro() {
        Random random = new Random();
        int minas = 0;
        while (minas < 10) {
            int pos = random.nextInt(81);
            if (tabuleiro[pos] != -1) { tabuleiro[pos] = -1; minas++; }
        }
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++) {
                if (tabuleiro[i * 9 + j] == -1) continue;
                int count = 0;
                for (int di = -1; di <= 1; di++)
                    for (int dj = -1; dj <= 1; dj++) {
                        int ni = i + di, nj = j + dj;
                        if (ni >= 0 && ni < 9 && nj >= 0 && nj < 9 && tabuleiro[ni * 9 + nj] == -1) count++;
                    }
                tabuleiro[i * 9 + j] = count;
            }
    }

    public int fazerJogada() {
        System.out.print("Linha (1-9): ");  int linha = sc.nextInt() - 1;
        System.out.print("Coluna (1-9): "); int coluna = sc.nextInt() - 1;
        int pos = linha * 9 + coluna;

        if (linha < 0 || linha > 8 || coluna < 0 || coluna > 8)
            { System.out.println("Posicao invalida!"); return 0; }
        else if (revelado[pos] == 1)
            { System.out.println("Celula ja revelada!"); return 0; }

        revelado[pos] = 1;
        return tabuleiro[pos];
    }

    public void exibirTabuleiro() {
        System.out.println("\n  1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < 9; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 9; j++) {
                int pos = i * 9 + j;
                if (revelado[pos] == 0) System.out.print(". ");
                else if (tabuleiro[pos] == -1) System.out.print("* ");
                else System.out.print(tabuleiro[pos] + " ");
            }
            System.out.println();
        }
    }

    public int jogoCompleto() {
        for (int i = 0; i < 81; i++)
            if (tabuleiro[i] != -1 && revelado[i] == 0) return 0;
        return 1;
    }
}