package pacote;

public class EscreverVetor {
    public static int escreverVetor(int[] vetor) {
        int soma = 0;
        System.out.println("\nVetor: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " - ");
            soma += vetor[i];
        }
        System.out.println("");
        System.out.println("\nSoma dos elementos do vetor: " + soma);
        return soma;
    }
}
