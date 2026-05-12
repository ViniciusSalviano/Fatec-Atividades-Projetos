/*2. Construa um programa que preencha aleatoriamente uma 
matriz 3x3 entre 1 e 20, calcule e apresente: 
a. Soma dos números da matriz 
b. Média da soma dos números 
c. Mostrar a soma dos números dos índices pares */

import pacote.CriarMatriz;

public class App {
    public static void main(String[] args) throws Exception {
        CriarMatriz criarMatriz = new CriarMatriz();

        int matriz[][] = criarMatriz.GerarMatriz();
        int soma = 0, somaPar = 0;
        double media = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                if (matriz[i][j] <10) {
                    System.out.print(" 0"+matriz[i][j]+" ");
                }else{
                    System.out.print(" "+matriz[i][j]+" ");
                }
                
                soma = soma + matriz[i][j];
                media = soma / 9;

                if (matriz[i][j] % 2 == 0) {
                    somaPar = somaPar + matriz[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("A soma dos numeros da matriz é: "+ soma);
        System.out.println("A media dos numeros da matriz é: "+ media);
        System.out.println("A soma dos numeros pares da matriz são: "+somaPar);
    }
}