/*4. Construa um programa que preencha aleatoriamente uma 
matriz 4x4 entre 1 e 20, substitua a 1ª linha da matriz pela 2ª e a 
4ª pela 3ª  */

import pacote.CriarMatriz;

public class App {
    public static void main(String[] args) throws Exception {
        CriarMatriz criarMatriz = new CriarMatriz();
        int[][] matriz = criarMatriz.GerarMatriz();
        int aux1 = 0, aux2 = 0;

        System.out.println("Matriz original");
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j]<10) {
                    System.out.print(" 0"+matriz[i][j]+" ");    
                }else{
                    System.out.print(" "+matriz[i][j]+" ");
                }
            }    
            System.out.println("");
        }
        System.out.println("\nMatriz modificada");
        
        for (int i = 0; i < matriz.length; i++) {
            aux1 = matriz[0][i];
            matriz[0][i] = matriz[1][i]; // LINHA 1 PEGA O VALOR DA LINHA 2
            matriz[1][i] = aux1;

            aux2 = matriz[3][i];
            matriz[3][i] = matriz[2][i]; //LINHA 4 PEGA O VALOR DA LINHA 3
            matriz[2][i] = aux2;
        }

        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j]<10) {
                    System.out.print(" 0"+matriz[i][j]+" ");    
                }else{
                    System.out.print(" "+matriz[i][j]+" ");
                }
            }    
            System.out.println("");
        }
        
        
    }
}