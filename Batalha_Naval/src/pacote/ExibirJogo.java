package pacote;

public class ExibirJogo {
    public void exibirEstadoJogo(char[][] tab1, char[][] tab2, int pts1, int pts2) {
        System.out.printf("Jogador 1 (Pontos: %d) \t|\t Jogador 2 (Pontos: %d)\n", pts1, pts2);
        System.out.println("---------------------------------------------------------");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(tab1[i][j] + " ");
            }
            
            System.out.print("\t\t|\t");
            
            for (int j = 0; j < 5; j++) {
                System.out.print(tab2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }    
}
