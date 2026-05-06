import pacote.AcumularRepetidos;
import pacote.EscreverMatriz;
import pacote.EscreverVetor;
import pacote.GerarMatriz;
import pacote.GerarVetor;


public class TratarMatrizeVetor {
    public static void main(String[] args) throws Exception {
        GerarVetor GerarVetor = new GerarVetor();
        GerarMatriz gerarMatriz = new GerarMatriz();
        EscreverVetor escreverVetor = new EscreverVetor();
        EscreverMatriz escreverMatriz = new EscreverMatriz();
        AcumularRepetidos acumularRepetidos = new AcumularRepetidos();

        System.out.println("Tratar Matriz e Vetor....");

        int[] vetorAleatorio = GerarVetor.popularVetorAleatorio(5);
        int[][] matrizAleatoria = gerarMatriz.popularMatrizAleatoria(5, 5);
        int [] vetorRepetidos = new int[5];

        int soma = EscreverVetor.escreverVetor(vetorAleatorio);
        System.out.println("Soma retornada do Vetor....: " + soma);

        soma = EscreverMatriz.escreverMatriz(matrizAleatoria);
        System.out.println("Soma retornada da Matriz....: " + soma);

       
        soma = acumularRepetidos.acumularRepetidos(matrizAleatoria, vetorRepetidos); 
    }
     
}
