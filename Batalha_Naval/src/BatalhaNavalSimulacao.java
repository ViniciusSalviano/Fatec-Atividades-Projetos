import pacote.Atirar;
import pacote.CriarTabuleiro;
import pacote.ExibirJogo;
import pacote.Posicionar;

public class BatalhaNavalSimulacao {
    public static void main(String[] args) throws InterruptedException {
        CriarTabuleiro criarTabuleiro = new CriarTabuleiro();
        Posicionar posicionar = new Posicionar();
        Atirar atirar = new Atirar();
        ExibirJogo exibirJogo = new ExibirJogo();
        char[][] tabuleiroJ1 = criarTabuleiro.inicializarTabuleiro();
        char[][] tabuleiroJ2 = criarTabuleiro.inicializarTabuleiro();

        posicionar.posicionarNavios(tabuleiroJ1);
        posicionar.posicionarNavios(tabuleiroJ2);

        int pontosJ1 = 10;
        int pontosJ2 = 10;
        int rodada = 1;

        while (pontosJ1 > 0 && pontosJ2 > 0) {
            System.out.println("\n--- RODADA " + rodada + " ---");
            
            if (atirar.atirarAleatoriamente(tabuleiroJ2)) {
                pontosJ2--;
            }

            if (pontosJ2 == 0) break;

            if (atirar.atirarAleatoriamente(tabuleiroJ1)) {
                pontosJ1--;
            }

            exibirJogo.exibirEstadoJogo(tabuleiroJ1, tabuleiroJ2, pontosJ1, pontosJ2);
            rodada++;
            
            Thread.sleep(1000); //Caso eu quiser de uma pausa entre turnos
        }

        System.out.println("\n=== FIM DE JOGO ===");
        exibirJogo.exibirEstadoJogo(tabuleiroJ1, tabuleiroJ2, pontosJ1, pontosJ2);

        if (pontosJ1 == 0) {
            System.out.println("Vitória do Jogador 2!\n");
        } else {
            System.out.println("Vitória do Jogador 1!\n");
        }
    }
}