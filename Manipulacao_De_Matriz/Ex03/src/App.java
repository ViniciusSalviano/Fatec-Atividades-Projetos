/*3. Construa um programa que preencha aleatoriamente uma 
matriz 4x4 entre 1 e 20, calcule e apresente: 
a. Maior número da matriz 
b. Menor número da matriz 
c. Informe a diferença de números entre o menor e o maior  */

import pacote.CriarMatriz;

public class App {
    public static void main(String[] args) throws Exception {
        CriarMatriz criarMatriz = new CriarMatriz();

        int matriz[][] = criarMatriz.GerarMatriz();
        int maior = 0,menor = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j]<10) {
                    System.out.print(" 0"+matriz[i][j]+" ");
                }else{
                    System.out.print(" "+matriz[i][j]+" ");
                }

                if (matriz[i][j] >maior && menor == 0) {
                    maior = matriz[i][j];
                    menor = matriz[i][j];
                }

                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }

                if (matriz[i][j]<menor) {
                    menor = matriz[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("O maior numero da matriz é: "+ maior);
        System.out.println("O menor numero da matriz é: "+menor);
        System.out.println("A diferença do maior e menor numero é de: "+ (maior-menor));

    }
}