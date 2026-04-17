package Pacote;

public class informacoes {
    public void menu(){
        System.out.println("\n--- MENU DE PRODUTOS ---");
        System.out.println("1 - Celular (R$ 100)");
        System.out.println("2 - Liquidificador (R$ 200)");
        System.out.println("3 - Rádio Relógio (R$ 300)");
        System.out.println("4 - Forno Elétrico (R$ 400)");
    }
    public void ResumoAtual(int totalVendas, double totalValor){
        System.out.println("\n----- RESUMO ATUAL -----");
        System.out.println("Total de vendas: " + totalVendas);
        System.out.println("Faturamento: R$ " + totalValor); 
        System.out.println("------------------------");  
    }
    public void Quantidade(int celular,int liquidificador, int radio, int forno){
        System.out.println("\nQuantidade por produto:");
        System.out.println("Celular: " + celular);
        System.out.println("Liquidificador: " + liquidificador);
        System.out.println("Rádio Relógio: " + radio);
        System.out.println("Forno Elétrico: " + forno);
        System.out.println("");
    }
    public void Porcentagem(int celular, int liquidificador, int radio, int forno, int totalVendas){
        System.out.println("Porcentagem por produto:");
        System.out.printf("Celular: %.2f%%\n", (celular * 100.0) / totalVendas);
        System.out.printf("Liquidificador: %.2f%%\n", (liquidificador * 100.0) / totalVendas);
        System.out.printf("Rádio Relógio: %.2f%%\n", (radio * 100.0) / totalVendas);
        System.out.printf("Forno Elétrico: %.2f%%\n", (forno * 100.0) / totalVendas);
        System.out.println("");
    }
}
