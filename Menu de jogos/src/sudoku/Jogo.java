package sudoku;

import java.util.Random;
import java.util.Scanner;

public class Jogo {

    public int[] tabuleiro = new int[81];
    public int[] fixo = new int[81];
    public Scanner sc = new Scanner(System.in);

    public void iniciar() {
        gerarTabuleiro();
        while (jogoCompleto() == 0) {
            exibirTabuleiro();
            fazerJogada();
        }
        exibirTabuleiro();
        System.out.println("Parabens! Voce completou o Sudoku!");
    }

    public void gerarTabuleiro() {
        int[] base = {
            5,3,4,6,7,8,9,1,2,
            6,7,2,1,9,5,3,4,8,
            1,9,8,3,4,2,5,6,7,
            8,5,9,7,6,1,4,2,3,
            4,2,6,8,5,3,7,9,1,
            7,1,3,9,2,4,8,5,6,
            9,6,1,5,3,7,2,8,4,
            2,8,7,4,1,9,6,3,5,
            3,4,5,2,8,6,1,7,9
        };

        for (int i = 0; i < 81; i++)
            tabuleiro[i] = fixo[i] = base[i];

        Random random = new Random();
        int removidos = 0;
        while (removidos < 40) {
            int pos = random.nextInt(81);
            if (fixo[pos] != 0) { tabuleiro[pos] = fixo[pos] = 0; removidos++; }
        }
    }

    public void fazerJogada() {
        System.out.print("Linha (1-9): ");  int linha = sc.nextInt() - 1;
        System.out.print("Coluna (1-9): "); int coluna = sc.nextInt() - 1;
        System.out.print("Numero (1-9): "); int numero = sc.nextInt();
        int pos = linha * 9 + coluna;

        if (linha < 0 || linha > 8 || coluna < 0 || coluna > 8)
            System.out.println("Posicao invalida!");
        else if (fixo[pos] != 0)
            System.out.println("Posicao fixa, nao pode alterar!");
        else if (jogadaValida(linha, coluna, numero) == 0)
            System.out.println("Numero invalido para essa posicao!");
        else { tabuleiro[pos] = numero; System.out.println("Inserido com sucesso!"); }
    }

    public int jogadaValida(int linha, int coluna, int numero) {
        for (int j = 0; j < 9; j++) if (tabuleiro[linha * 9 + j] == numero) return 0;
        for (int i = 0; i < 9; i++) if (tabuleiro[i * 9 + coluna] == numero) return 0;
        int il = (linha / 3) * 3, ic = (coluna / 3) * 3;
        for (int i = il; i < il + 3; i++)
            for (int j = ic; j < ic + 3; j++)
                if (tabuleiro[i * 9 + j] == numero) return 0;
        return 1;
    }

    public void exibirTabuleiro() {
        System.out.println("\n+-------+-------+-------+");
        for (int i = 0; i < 9; i++) {
            System.out.print("| ");
            for (int j = 0; j < 9; j++) {
                int pos = i * 9 + j;
                System.out.print((tabuleiro[pos] == 0 ? "." : tabuleiro[pos]) + " ");
                if (j == 2 || j == 5 || j == 8) System.out.print("| ");
            }
            System.out.println();
            if (i == 2 || i == 5 || i == 8) System.out.println("+-------+-------+-------+");
        }
    }

    public int jogoCompleto() {
        for (int i = 0; i < 81; i++)
            if (tabuleiro[i] == 0) return 0;
        return 1;
    }
}