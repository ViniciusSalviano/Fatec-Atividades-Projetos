package batalhanaval;

import java.util.Random;
import java.util.Scanner;

public class BatalhaNaval {

    public int[] naviosJogador = new int[81];
    public int[] naviosComp    = new int[81];
    public int[] ataquesJogador = new int[81];
    public int[] ataquesComp    = new int[81];
    public Scanner sc = new Scanner(System.in);
    public Random random = new Random();

    public void iniciar() {
        posicionarNavios(naviosJogador);
        posicionarNavios(naviosComp);

        while (naviosAfundados(naviosComp, ataquesJogador) < 5 && naviosAfundados(naviosJogador, ataquesComp) < 5) {
            exibirTabuleiros();
            turnoJogador();
            if (naviosAfundados(naviosComp, ataquesJogador) == 5) break;
            turnoComputador();
        }

        exibirTabuleiros();
        if (naviosAfundados(naviosComp, ataquesJogador) == 5) System.out.println("Voce venceu!");
        else System.out.println("O computador venceu!");
    }

    public void posicionarNavios(int[] navios) {
        int colocados = 0;
        while (colocados < 5) {
            int pos = random.nextInt(81);
            if (navios[pos] == 0) { navios[pos] = 1; colocados++; }
        }
    }

    public void turnoJogador() {
        System.out.print("\nSua vez! Linha (1-9): ");  int linha = sc.nextInt() - 1;
        System.out.print("Coluna (1-9): ");            int coluna = sc.nextInt() - 1;
        int pos = linha * 9 + coluna;

        if (linha < 0 || linha > 8 || coluna < 0 || coluna > 8)
            { System.out.println("Posicao invalida!"); return; }
        if (ataquesJogador[pos] != 0)
            { System.out.println("Voce ja atacou essa posicao!"); return; }

        ataquesJogador[pos] = 1;
        if (naviosComp[pos] == 1) System.out.println("Acertou um navio inimigo!");
        else System.out.println("Agua!");
    }

    public void turnoComputador() {
        int pos;
        do { pos = random.nextInt(81); } while (ataquesComp[pos] != 0);
        ataquesComp[pos] = 1;
        int linha = pos / 9 + 1, coluna = pos % 9 + 1;
        System.out.print("Computador atacou linha " + linha + " coluna " + coluna + ": ");
        if (naviosJogador[pos] == 1) System.out.println("Acertou seu navio!");
        else System.out.println("Agua!");
    }

    public void exibirTabuleiros() {
        System.out.println("\n--- TABULEIRO INIMIGO ---");
        System.out.println("  1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < 9; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 9; j++) {
                int pos = i * 9 + j;
                if (ataquesJogador[pos] == 1 && naviosComp[pos] == 1) System.out.print("X ");
                else if (ataquesJogador[pos] == 1) System.out.print("O ");
                else System.out.print(". ");
            }
            System.out.println();
        }

        System.out.println("\n--- SEU TABULEIRO ---");
        System.out.println("  1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < 9; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 9; j++) {
                int pos = i * 9 + j;
                if (ataquesComp[pos] == 1 && naviosJogador[pos] == 1) System.out.print("X ");
                else if (ataquesComp[pos] == 1) System.out.print("O ");
                else if (naviosJogador[pos] == 1) System.out.print("N ");
                else System.out.print(". ");
            }
            System.out.println();
        }
        System.out.println("\nSeus navios afundados: " + naviosAfundados(naviosJogador, ataquesComp) + "/5");
        System.out.println("Navios inimigos afundados: " + naviosAfundados(naviosComp, ataquesJogador) + "/5");
    }

    public int naviosAfundados(int[] navios, int[] ataques) {
        int count = 0;
        for (int i = 0; i < 81; i++)
            if (navios[i] == 1 && ataques[i] == 1) count++;
        return count;
    }
}