package pacote;

public class AcumularRepetidos {
    public static int acumularRepetidos(int[][] matriz, int[] vetorRepetidos) {
        int valor = 0, soma = 0, nro = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) { 
                valor = matriz[i][j];
                acumulaElemento(valor, vetorRepetidos);
            }
        }

        System.out.println("\nVetor de Repetidos: ");
        for (int i = 0; i < vetorRepetidos.length; i++) {
            nro = i + 1;
            System.out.println("Numero " + nro + " se repete " + vetorRepetidos[i] + " vezes.");

        }
        return soma;
    }
    public static void acumulaElemento(int valor, int[] vetorRepetidos) {
        switch (valor) {
            case 1:
                vetorRepetidos[0] = vetorRepetidos[0] + 1;
                break;
            case 2:
                vetorRepetidos[1] = vetorRepetidos[1] + 1;
                break;
            case 3:
                vetorRepetidos[2] = vetorRepetidos[2] + 1;
                break;
            case 4:
                vetorRepetidos[3] = vetorRepetidos[3] + 1;
                break;
            case 5:
                vetorRepetidos[4] = vetorRepetidos[4] + 1;
                break;
            default:
                break;
        }
    }  
}
