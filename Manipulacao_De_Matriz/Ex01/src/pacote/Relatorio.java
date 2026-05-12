package pacote;

public class Relatorio {

    public static void exibir(String[][] poltronas, String destino, String motorista,
        String numeroOnibus, double valorPassagem) {
        int ocupadas = Assentos.contarOcupadas(poltronas);
        int livres = 48 - ocupadas;

        System.out.println("\n====== RESUMO ECONOMICO ======");
        System.out.println("Destino: " + destino);
        System.out.println("Motorista: " + motorista);
        System.out.println("Onibus n.: " + numeroOnibus);
        System.out.printf("Passagem: R$ %.2f%n", valorPassagem);
        System.out.println("------------------------------");
        System.out.println("Poltronas ocupadas: " + ocupadas);
        System.out.println("Poltronas livres:   " + livres);
        System.out.printf("Receita arrecadada: R$ %.2f%n", ocupadas * valorPassagem);
        System.out.printf("Receita potencial:  R$ %.2f%n", livres * valorPassagem);
        System.out.println("==============================\n");
    }
}