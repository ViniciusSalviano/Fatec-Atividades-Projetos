package Pacotes;

public class MaiorMenor {
    public int[] BuscandoMaiorMenor(int numeros[]){
        int[] resultado = new int[2];
        int maior = 0,menor = 0;
        for(int i = 0; i<numeros.length;i++){
            if (numeros[i]>maior) {
                maior = numeros[i];
                resultado[0] = maior;
                menor = numeros[i];
            }
            if (numeros[i]<menor) {
                menor = numeros[i];
                resultado[1] = menor; 
            }
        }
        return resultado;
    }
}
