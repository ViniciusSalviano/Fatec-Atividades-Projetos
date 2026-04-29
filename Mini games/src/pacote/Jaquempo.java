package pacote;

import java.util.Random;
import java.util.Scanner;

public class Jaquempo {
    public void PedraPapelTesoura(Scanner sc){
        Random rand = new Random();
        System.out.println("\n====== JAQUEMPÔ ======");

        
        int EscolhaDoJogador = 0,NumeroAleatorio = 0;
        while (EscolhaDoJogador !=4) {
            System.out.println("Escolha sua jogada");
            System.out.println("1. Pedra");
            System.out.println("2. Papel");
            System.out.println("3. Tesoura");
            System.out.println("4. Sair");
            System.out.print("Opção: ");
            EscolhaDoJogador = sc.nextInt();
            NumeroAleatorio = rand.nextInt(3)+1;
            System.out.println("");
            
            switch (EscolhaDoJogador) {
                case 1:
                    if (NumeroAleatorio == 1) {
                        System.out.println("Empate - Pedra[Maquina] empata com Pedra[Jogador]\n");
                    } else if (NumeroAleatorio == 2) {
                        System.out.println("Maquina Vence - Papel[Maquina] vence de Pedra[Jogador]\n");
                    } else if (NumeroAleatorio == 3) {
                        System.out.println("Jogador Vence - Tesoura[Maquina] perde para Pedra[Jogador]\n");
                    }    
                    break;
                case 2:
                    if (NumeroAleatorio == 2) {
                        System.out.println("Empate - Papel[Maquina] empata com Papel[Jogador]\n");
                    } else if (NumeroAleatorio == 1) {
                        System.out.println("Jogador Vence - Pedra[Maquina] perde para Papel[Jogador]\n");
                    } else if (NumeroAleatorio == 3) {
                        System.out.println("Maquina Vence - Tesoura[Maquina] vence de Papel[Jogador]\n");
                    }    
                    break;
                case 3:
                    if (NumeroAleatorio == 3) {
                        System.out.println("Empate - Tesoura[Maquina] empata com Tesoura[Jogador]\n");
                    } else if (NumeroAleatorio == 2) {
                        System.out.println("Jogador Vence - Papel[Maquina] perde para Tesoura[Jogador]\n");
                    } else if (NumeroAleatorio == 1) {
                        System.out.println("Maquina Vence - Pedra[Maquina] vence de Tesoura[Jogador]\n");
                    }      
                    break;
                case 4:
                    System.out.println("Voltando ao menu principal");  
                    break;  
                default:
                    System.out.println("[ERRO] Jogador escolheu uma opção invalida");
                    break;
            }
        }
    }    
}
