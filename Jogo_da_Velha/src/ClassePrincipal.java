import java.util.Random;
import java.util.Scanner;
import Jogo.GameContraMaquina;
import Jogo.GameLocal;

public class ClassePrincipal {
    public static void main(String[] args) throws Exception {
        GameContraMaquina gameContraMaquina = new GameContraMaquina();
        GameLocal gameContraJogador = new GameLocal();
        Scanner sc = new Scanner(System.in);
        Random randi = new Random();
        try {
            int option = 0;
            while (option !=3) {
                System.out.println("\n======= Jogo da Velha =======");
                System.out.println("Como voce gostaria de jogar?");
                System.out.println("1. Contra a maquina.");
                System.out.println("2. Contra um amigo (Local)");
                System.out.println("3. Sair do jogo");
                System.out.print("Opção: ");
                option = sc.nextInt();
                System.out.println("=============================");
        
                switch (option) {
                    case 1:
                        gameContraMaquina.ContraMaquina(sc,randi);
                        break;
                    case 2:
                        gameContraJogador.ContraJogador(sc,randi);
                        break;
                    case 3:
                        System.out.println("\nSaindo do programa.....\n");
                        break;
                    default:
                        System.out.println("[ERRO] Opção invalida!!!");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("\n-------------[ERRO]---------------");
            System.out.println("Opção invalida!!!");
            System.out.println("Você deve digitar um numero inteiro");
            System.out.println("correspondente a opção que deseja.");
            System.out.println("-------------[ERRO]---------------\n");
        } finally{
            sc.close(); 
        }
    }
}