import sudoku.Jogo;
import forca.Forca;
import campominado.CampoMinado;
import batalhanaval.BatalhaNaval;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = -1;
        while (opcao!=5) {
            System.out.println("=== MENU ===");
            System.out.println("1 - Sudoku");
            System.out.println("2 - Forca");
            System.out.println("3 - Campo Minado");
            System.out.println("4 - Batalha Naval");
            System.out.println("5 - Sair do programa");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
    
            if (opcao == 1)      new Jogo().iniciar();
            else if (opcao == 2) new Forca().iniciar();
            else if (opcao == 3) new CampoMinado().iniciar();
            else if (opcao == 4) new BatalhaNaval().iniciar();
            else if (opcao == 5) System.out.println("\nSaindo do programa...\n");
            else System.out.println("\nOpcao invalida!\n");
        }
        sc.close();
    }
}