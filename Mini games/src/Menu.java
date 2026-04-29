import java.util.Scanner;

import pacote.AdivinharNumero;
import pacote.Jaquempo;
import pacote.ParOuImpar;
import pacote.Vinteum;

public class Menu {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        AdivinharNumero  adivinha = new AdivinharNumero();
        Jaquempo ojaquempo = new Jaquempo();
        ParOuImpar parouimpar = new ParOuImpar();
        Vinteum vinteum = new Vinteum();

        int opcao = 0;
        while (opcao != 5) {
            System.out.println("__________________");
            System.out.println("       Menu       ");
            System.out.println("1. Adivinhação");
            System.out.println("2. Par ou impar");
            System.out.println("3. Jaquempô");
            System.out.println("4. 21");
            System.out.println("5. Sair");
            System.out.print("Opção desejada: ");
            
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    adivinha.adivinhacao(sc);
                    break;
                case 2:
                    parouimpar.parouimpar(sc);
                    break;    
                case 3:
                    ojaquempo.PedraPapelTesoura(sc);
                    break;
                case 4:
                    vinteum.vinteum(sc);
                    break;        
                case 5:
                    System.out.println("Saindo do programa...");
                    break;    
                default:    
                    System.out.println("[ERRO]");
                    break;
            }
        }
        sc.close();
    }
}
