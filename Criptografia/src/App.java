import java.util.Scanner;
import pacote.criptografar;     
import pacote.descriptografar; 

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
        'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String textoEscondido = "";
        int op = -1; 
        while (op != 3) {
            System.out.println("\n ==== Menu ===");
            System.out.println("1. Criptografar frase");
            System.out.println("2. Descriptografar frase");
            System.out.println("3. Sair do programa\n");
            System.out.print("Digite o numero da opção desejada: ");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    System.out.print("\nDigite uma frase (somente letras minusculas): ");
                    String fraseOriginal = sc.nextLine();
                    textoEscondido = criptografar.funcaocriptografar(fraseOriginal, letras);
                    System.out.println("\nCriptografada: " + textoEscondido);
                    break;
                case 2:
                    String textoRevelado = descriptografar.funcaoDescriptografar(textoEscondido, letras);
                    System.out.println("Descriptografada: " + textoRevelado+"\n");
                    break;
                case 3:
                    System.out.println("Saindo do programa....");
                        break;
                    default:
                        System.out.println("[ERRO] Numero invalido");
                        break;
                }
            
        }

        sc.close();
    }
}
