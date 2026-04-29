package pacote;

import java.util.Random;
import java.util.Scanner;

public class Vinteum {
    public void vinteum(Scanner sc){
        Random rand = new Random();

        System.out.println("\n====== 21 ======");
        int acumuladorjogador = 0,acumuladormaquina = 0, dado = 0, decisaomaquina = -1;
        int op = 0;
        while (op != 1) {

            dado = rand.nextInt(6)+1;
            System.out.println("Resultado do dado: "+dado);
            acumuladorjogador = acumuladorjogador + dado;
            System.out.println("\nSua pontuação: ["+acumuladorjogador+"]");

            if (acumuladorjogador<21) {

                System.out.println("\nQuer jogar o dado mais uma vez?");
                System.out.println("> Sim, quero continuar - Digite qualquer numero");
                System.out.println("> Não, quero parar - Digite 1");
                System.out.print("Opção: ");
                op = sc.nextInt();

            } else if (acumuladorjogador ==21) {

                System.out.println("\nVitoriaaaa!!!! 21!!!!!!!!!");
                break;
            }else{

                System.out.println("\nVocê perdeu!! Seu numero ["+acumuladorjogador+"] passou de 21.");
                System.out.println("Digite 1 para sair");
                op = sc.nextInt();

            }

            System.out.println("");
        }

        while (acumuladormaquina < 15) {

            dado = rand.nextInt(6)+1;
            System.out.println("Resultado do dado: "+dado);
            acumuladormaquina = acumuladormaquina + dado;
            System.out.println("\nSua pontuação: ["+acumuladormaquina+"]");

        }

        while (acumuladormaquina < 21) {
            
            decisaomaquina = rand.nextInt(2);
            if (decisaomaquina == 0) {

                System.out.println("Maquina decidiu parar com o que tem: "+acumuladormaquina);
                break;

            } else{

                dado = rand.nextInt(6)+1;
                System.out.println("Resultado do dado: "+dado);
                acumuladormaquina = acumuladormaquina + dado;
                System.out.println("\nSua pontuação: ["+acumuladormaquina+"]");    

            }
        }
        
        if (acumuladorjogador>acumuladormaquina) {

            System.out.println("\nO JOGADOR VENCEU!!!!");
            System.out.println("Jogador: "+acumuladorjogador);
            System.out.println("Maquina: "+acumuladormaquina+"\n");

        } else if (acumuladorjogador==acumuladormaquina) {
            System.out.println("\nEMPATEEE!!!!");
            System.out.println("Jogador: "+acumuladorjogador);
            System.out.println("Maquina: "+acumuladormaquina+"\n");
        }else {

            System.out.println("\nA MAQUINA VENCEU!!!!");
            System.out.println("Jogador: "+acumuladorjogador);
            System.out.println("Maquina: "+acumuladormaquina+"\n");

        }
    }    
}
