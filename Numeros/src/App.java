import Pacotes.Vetor;
import Pacotes.MaiorMenor;
import Pacotes.Verificar;

public class App {
    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor();
        MaiorMenor maiormenor = new MaiorMenor();
        Verificar verificar = new Verificar();

        int[] numeros = vetor.gerandovetor();
        for(int i = 0; i<numeros.length;i++){
            System.out.println((i+1)+"° Numero: "+ numeros[i]);
        }

        verificar.verificarrandom(numeros);

        int[] MaiorMenor = maiormenor.BuscandoMaiorMenor(numeros);
        System.out.println("O maior numero é o: "+MaiorMenor[0]);
        System.out.println("O menor numero é o: "+MaiorMenor[1]);


    }
}
