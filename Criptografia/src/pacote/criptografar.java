package pacote;

public class criptografar {
    
    public static String funcaocriptografar(String frase, char[] letras) {
        String resultado = "";

        for (int i = 0; i < frase.length(); i++) {

            char letra = frase.charAt(i);

            if (letra == ' ') {
                resultado += ' ';
            }else{

                for (int j = 0; j < letras.length; j++) {

                    if (letra == letras[j]) {
                        resultado += letras[(j + 3) % 26];
                        break;
                    }
                }
            }
        }
        return resultado;
    }
}