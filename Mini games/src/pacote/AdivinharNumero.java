package pacote;

import java.util.Random;
import java.util.Scanner;

public class AdivinharNumero {
    public void adivinhacao(Scanner sc){
        Random rand = new Random();
        System.out.println("\n====== ADIVINHA O NUMERO ======");

        int op = -1;
        while (op != 1) {
            
            int NumeroAleatorio = rand.nextInt(11);
            System.out.println("\nQual é o numero aleatorio? =)");
            System.out.println("O numero pode ser de 0 a 10\n");
            System.out.print("Numero: ");
            int EscolhaDoJogador = sc.nextInt();

            if (EscolhaDoJogador == NumeroAleatorio) {

                System.out.println("\nVITORIAAAA!! VOCÊ ACERTOU O NUMERO ALEATORIIO");
                System.out.println("O NUEMRO ALEATORIO É: "+NumeroAleatorio+"\n");

            }else{

                System.out.println("\nIhhhh errou kkkk");
                System.out.println("O numero aleatorio era "+NumeroAleatorio+"\n");

            }
            
            System.err.println("Quer tentar Novamente?");
            System.out.println("Sim - Digite qualquer numero");
            System.out.println("Não - Digite 1");
            System.out.print("Opção: ");
            op = sc.nextInt();
        }
    }    
}
