package forca;

import java.util.Random;
import java.util.Scanner;

public class Forca {

    public String[] palavras = {"java", "vetor", "classe", "metodo", "pacote", "random", "scanner"};
    public Scanner sc = new Scanner(System.in);

    public void iniciar() {
        Random random = new Random();
        String palavra = palavras[random.nextInt(palavras.length)];
        char[] letrasCorretas = new char[palavra.length()];
        for (int i = 0; i < letrasCorretas.length; i++) letrasCorretas[i] = '_';

        int erros = 0;

        while (erros < 6 && jogoCompleto(letrasCorretas) == 0) {
            exibirEstado(letrasCorretas, erros);
            System.out.print("Digite uma letra: ");
            char letra = sc.next().charAt(0);

            int acertou = 0;
            for (int i = 0; i < palavra.length(); i++)
                if (palavra.charAt(i) == letra) { letrasCorretas[i] = letra; acertou = 1; }

            if (acertou == 0) { erros++; System.out.println("Errou! Tentativas restantes: " + (6 - erros)); }
            else System.out.println("Acertou!");
        }

        exibirEstado(letrasCorretas, erros);
        if (jogoCompleto(letrasCorretas) == 1) System.out.println("Parabens! Voce adivinhou!");
        else System.out.println("Voce perdeu! A palavra era: " + palavra);
    }

    public void exibirEstado(char[] letras, int erros) {
        System.out.print("\nPalavra: ");
        for (char c : letras) System.out.print(c + " ");
        System.out.println("\nErros: " + erros + "/6\n");
    }

    public int jogoCompleto(char[] letras) {
        for (char c : letras) if (c == '_') return 0;
        return 1;
    }
}