import pacote.Assentos;
import pacote.Relatorio;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static String[][] poltronas = new String[12][4];
    static String destino, motorista, numeroOnibus;
    static double valorPassagem;

    public static void main(String[] args) {
        Assentos.inicializar(poltronas);

        System.out.println("====================================");
        System.out.println("      IDENTIFICAÇÃO DO ÔNIBUS       ");
        System.out.println("====================================");
        System.out.print("Destino: ");
        destino = sc.nextLine();
        System.out.print("Nome do motorista: ");
        motorista = sc.nextLine();
        System.out.print("Número do ônibus: ");
        numeroOnibus = sc.nextLine();
        System.out.print("Valor da passagem (R$): ");
        valorPassagem = sc.nextDouble();
        sc.nextLine();
        System.out.println("Informações salvas!\n");

        int opcao = 0;
        while (opcao != 6) {
            System.out.println("========== MENU ==========");
            System.out.println("1 - Listar poltronas");
            System.out.println("2 - Reservar poltrona");
            System.out.println("3 - Liberar poltrona");
            System.out.println("4 - Trocar reserva");
            System.out.println("5 - Resumo economico");
            System.out.println("6 - Sair");
            System.out.println("==========================");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1: Assentos.listar(poltronas); break;
                case 2: Assentos.reservar(poltronas, sc); break;
                case 3: Assentos.liberar(poltronas, sc); break;
                case 4: Assentos.trocar(poltronas, sc); break;
                case 5: Relatorio.exibir(poltronas, destino, motorista, numeroOnibus, valorPassagem); break;
                case 6: System.out.println("Sistema encerrado. Boa viagem!"); break;
                default: System.out.println("Opção inválida!\n"); break;
            }
        }

        sc.close();
    }
}