import java.util.Scanner;
import pacote.criptografar;     
import pacote.descriptografar; 

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        System.out.print("\nDigite uma palavra (minusculas): ");
        String fraseOriginal = sc.nextLine();

        // 1. Chama a criptografia
        String textoEscondido = criptografar.funcaocriptografar(fraseOriginal, letras);
        System.out.println("\nCriptografada: " + textoEscondido);

        // 2. Chama a descriptografia
        String textoRevelado = descriptografar.funcaoDescriptografar(textoEscondido, letras);
        System.out.println("Descriptografada: " + textoRevelado+"\n");

        sc.close();
    }
}