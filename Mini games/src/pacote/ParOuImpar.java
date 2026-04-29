package pacote;

import java.util.Random;
import java.util.Scanner;

public class ParOuImpar {
    public void parouimpar(Scanner sc){
        Random rand = new Random();
        System.out.println("\n====== PAR OU IMPAR ======");
        int NumeroDoJogador = 0, OpcaoDoJogador = 0;
        int op = 0;

        while (op != 1) {

            int NumeroAleatorio = rand.nextInt(11);
            System.out.println("\nJá escolhi um numero, agora escolha um tambem =)");
            System.out.println("O numero pode ser de 0 a 10");
            System.out.print("Numero: ");
            NumeroDoJogador = sc.nextInt();

            System.out.println("\nPar ou impar?");
            System.out.println("1. Par");
            System.out.println("2. Impar");
            System.out.print("Opçao: ");
            OpcaoDoJogador = sc.nextInt();
            int soma = NumeroAleatorio + NumeroDoJogador;

            if (soma %2==0 && OpcaoDoJogador == 1) {

                System.out.println("\nVITORIAAA, O NUMERO É PAAAARR!!");
                System.out.println("Seu numero: "+NumeroDoJogador+" || Meu numero: "+NumeroAleatorio);
                System.out.println("Os numeros somados resultam em "+soma);
                System.out.println("O numero "+soma+" é par.");

            }else if(soma%2 != 0 && OpcaoDoJogador == 2){

                System.out.println("\nVITORIAAA, O NUMERO É IMPAARR!!!");
                System.out.println("Seu numero: "+NumeroDoJogador+" || Meu numero: "+NumeroAleatorio);
                System.out.println("Os numeros somados resultam em "+soma);
                System.out.println("O numero "+soma+" é impar.");

            } else{

                System.out.println("\nIhhh você errou kkk\n");
                System.out.println("Seu numero: "+NumeroDoJogador+" || Meu numero: "+NumeroAleatorio);
                System.out.println("Os numeros somados resultam em "+soma);

                if (soma%2==0) {
                    System.out.println("O numero "+soma+" é par e você escolheu impar.");
                }else{
                    System.out.println("O numero "+soma+" é impar e você escolheu par");
                }

            }
            System.out.println("\nQuer tentar Novamente?");
            System.out.println("Sim - Digite qualquer numero");
            System.out.println("Não - Digite 1");
            System.out.print("Opção: ");
            op = sc.nextInt();
        }  
    }    
}
