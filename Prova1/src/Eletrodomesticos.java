import java.util.Scanner;
import java.util.Random;
import Pacote.informacoes;
public class Eletrodomesticos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random gerador = new Random();
        informacoes informacoes = new informacoes();
        int opcao = 0;
        int celular = 0;
        int liquidificador = 0;
        int radio = 0;
        int forno = 0;
        int totalVendas = 0;
        double totalValor = 0;
        informacoes.menu();
        for (int i = 1; i <= 10; i++) {
            opcao = gerador.nextInt(4)+1;
            System.out.println("Produto escolhido: "+opcao);
            switch (opcao) {
                case 1:
                    celular++;
                    totalValor += 100;
                    break;
                case 2:
                    liquidificador++;
                    totalValor += 200;
                    break;
                case 3:
                    radio++;
                    totalValor += 300;
                    break;
                case 4:
                    forno++;
                    totalValor += 400;
                    break;
                default:
                    i--;
                    continue;
            }
            totalVendas++;
            informacoes.ResumoAtual(totalVendas, totalValor);
            informacoes.Quantidade(celular, liquidificador, radio, forno);
            informacoes.Porcentagem(celular, liquidificador, radio, forno, totalVendas);
            Linha();
        }
        System.out.println("Processo finalizado!!");
        sc.close();
    }
    static void Linha(){System.out.println("==========================");}
}