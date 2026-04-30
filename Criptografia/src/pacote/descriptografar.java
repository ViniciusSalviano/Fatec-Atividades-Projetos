package pacote;

public class descriptografar {
    
    public static String funcaoDescriptografar(String fraseCripto, char[] letras) {
        String resultado = "";

        for (int i = 0; i < fraseCripto.length(); i++) { 

            char letraCripto = fraseCripto.charAt(i);

            if (letraCripto == ' ') {
                resultado += ' ';
            }else{

                for (int j = 0; j < letras.length; j++) {
                    
                    if (letraCripto == letras[j]) {
                        int posicaoOriginal = (j - 3 + 26) % 26;
                        
                        resultado += letras[posicaoOriginal];
                        break;
                    }
                }
            }
        }
        return resultado;
    }
}