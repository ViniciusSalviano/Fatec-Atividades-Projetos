package pacote;

public class EscreverMatriz {
    public static int escreverMatriz(int[][] matriz) {
        int soma = 0;
        System.out.println("\nMatriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " - ");
                soma += matriz[i][j];
            }
            System.out.println();
        }
//        System.out.println("\nSoma dos elementos da matriz: " + soma);
        return soma;
    }   
}
