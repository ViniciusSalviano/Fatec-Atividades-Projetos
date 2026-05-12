package pacote;

import java.util.Scanner;

public class Assentos {

    public static void inicializar(String[][] poltronas) {
        int num = 1;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 4; j++) {
                poltronas[i][j] = String.format("%02d", num++);
            }
        }
    }

    public static void listar(String[][] poltronas) {
        System.out.println("\n  ESQUERDO | DIREITO");
        System.out.println("  ---------+---------");
        for (int i = 0; i < 12; i++) {
            System.out.printf("  %s   %s  |  %s   %s%n",
            poltronas[i][0], poltronas[i][1],
            poltronas[i][2], poltronas[i][3]);
        }
        System.out.println("  ---------+---------");
        System.out.println("  XX = Ocupada\n");
    }

    public static void reservar(String[][] poltronas, Scanner sc) {
        System.out.print("Número da poltrona (1-48): ");
        int num = sc.nextInt();
        sc.nextLine();
        if (!validar(num)) return;
        int[] pos = posicao(num);
        if (poltronas[pos[0]][pos[1]].equals("XX")) {
            System.out.println("Poltrona já está ocupada!\n");
        } else {
            poltronas[pos[0]][pos[1]] = "XX";
            System.out.println("Poltrona " + num + " reservada com sucesso!\n");
        }
    }

    public static void liberar(String[][] poltronas, Scanner sc) {
        System.out.print("Número da poltrona (1-48): ");
        int num = sc.nextInt();
        sc.nextLine();
        if (!validar(num)) return;
        int[] pos = posicao(num);
        if (!poltronas[pos[0]][pos[1]].equals("XX")) {
            System.out.println("Poltrona já está livre!\n");
        } else {
            poltronas[pos[0]][pos[1]] = String.format("%02d", num);
            System.out.println("Poltrona " + num + " liberada com sucesso!\n");
        }
    }

    public static void trocar(String[][] poltronas, Scanner sc) {
        System.out.print("Poltrona de origem (1-48): ");
        int origem = sc.nextInt();
        System.out.print("Poltrona de destino (1-48): ");
        int destino = sc.nextInt();
        sc.nextLine();
        if (!validar(origem) || !validar(destino)) return;
        int[] posOrigem = posicao(origem);
        int[] posDestino = posicao(destino);
        if (!poltronas[posOrigem[0]][posOrigem[1]].equals("XX")) {
            System.out.println("Poltrona de origem não está ocupada!\n");
        } else if (poltronas[posDestino[0]][posDestino[1]].equals("XX")) {
            System.out.println("Poltrona de destino já está ocupada!\n");
        } else {
            poltronas[posOrigem[0]][posOrigem[1]] = String.format("%02d", origem);
            poltronas[posDestino[0]][posDestino[1]] = "XX";
            System.out.println("Troca realizada: poltrona " + origem + " → " + destino + "\n");
        }
    }

    public static int contarOcupadas(String[][] poltronas) {
        int total = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 4; j++) {
                if (poltronas[i][j].equals("XX")) total++;
            }
        }
        return total;
    }

    private static int[] posicao(int num) {
        return new int[]{ (num - 1) / 4, (num - 1) % 4 };
    }

    private static boolean validar(int num) {
        if (num < 1 || num > 48) {
            System.out.println("Número inválido! Informe entre 1 e 48.\n");
            return false;
        }
        return true;
    }
}