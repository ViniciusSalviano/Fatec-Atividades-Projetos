package Jogo;

import java.util.Random;
import java.util.Scanner;

public class GameContraMaquina {
    public void ContraMaquina(Scanner sc,Random randi){
        System.out.println("");
        String Jogador="",Maquina="";
        int n1,n2,n1M,n2M;
        String[][] jogoatual = new String[3][3];
        boolean escolhaValida = false;
        boolean jogoAcabou = false;

        //VERIFICANDO A ESCOLHA DO JOGADOR E DETERMINANDO O SIMBOLO OPOSTO PARA A MAQUINA
        while (escolhaValida == false) {

            //JOGADOR ESCOLHENDO X OU O
            System.out.println("Qual vc prefere? X ou O");
            System.out.print("Escolho: ");
            String XouO = sc.next();

            //VALIDAÇÃO
            if (XouO.equals("X") || XouO.equals("x")) {
                Jogador = "X";
                Maquina = "O";
                escolhaValida = true; 
            }else if (XouO.equals("O") || XouO.equals("o")) {
                Jogador = "O";
                Maquina = "X"; 
                escolhaValida = true; 
            }else{
                System.out.println("\n    [ERRO]");
                System.out.println("Opção invalida");
                System.out.println("Digite X ou O\n");
                escolhaValida = false;
            }
        }
        System.out.println();

        //MOSTRANDO O JOGO VAZIO ANTES DA PRIMEIRA DECISÃO DO JOGADOR
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                jogoatual[i][j] = "-";
            }
        }
        mostrarJogo(jogoatual);

        //LOOP ATÉ O JOGO ACABAR
        while (jogoAcabou == false) {
            
            //VEZ DO JOGADOR JOGAR
            escolhaValida = false;
            while (escolhaValida == false) {

                //JOGADOR ESCOLHENDO LINHA E COLUNA
                System.out.println("\n========= VEZ DO "+Jogador+" ==========");
                System.out.println("Digite a |linha| e |coluna| em que vc quer colocar o "+Jogador+"?");
                System.out.print("Linha: ");
                n1 = sc.nextInt()-1;
                System.out.print("Coluna: ");
                n2 = sc.nextInt()-1;

                //VERIFICA SE O JOGADOR ESCOLHEU UMA POSIÇÃO JÁ PREENCHIDA
                if (n1 < 0 || n1 > 2 || n2 < 0 || n2 > 2) {
                    System.out.println("Posição inexistente! Digite de 1 a 3.");
                } else if (!jogoatual[n1][n2].equals("-")) {
                    System.out.println("Essa posição já está ocupada!");
                } else {
                    jogoatual[n1][n2] = Jogador;
                    escolhaValida = true;
                }
                
            }
            //===============================================================================================
            //VERIFICAR SE O JOGO ACABOU
            // ... jogador jogou ...
            jogoAcabou = statusDoJogo(jogoatual, Jogador, Maquina);
            if(jogoAcabou) break;
            // ... máquina jogou ...
            //jogoAcabou = statusDoJogo(jogoatual, Jogador, Maquina);
            //===============================================================================================
            System.out.println();

            //MOSTRANDO O JOGO ATUAL
            mostrarJogo(jogoatual); 

            //VEZ DA MAQUINA JOGAR
            escolhaValida = false;
            while (escolhaValida == false) {

                //MAQUINA ESCOLHENDO LINHA E COLUNA
                n1M = randi.nextInt(3); // Gera 0, 1 ou 2
                n2M = randi.nextInt(3); // Gera 0, 1 ou 2
                
                //VERIFICA SE A MAQUINA ESCOLHEU UMA POSIÇÃO JÁ PREENCHIDA
                if (jogoatual[n1M][n2M].equals("-")) {
                    System.out.println("\n========= VEZ DO "+Maquina+" ==========");
                    System.out.println("A maquina jogou na Linha: " + (n1M+1) + " Coluna: " + (n2M+1));
                    jogoatual[n1M][n2M] = Maquina;
                    escolhaValida = true;
                }
            }
            mostrarJogo(jogoatual);
            //===============================================================================================
            //VERIFICAR SE O JOGO ACABOU
            // ... jogador jogou ...
            jogoAcabou = statusDoJogo(jogoatual, Jogador, Maquina);
            if(jogoAcabou) break;
            // ... máquina jogou ...
            //jogoAcabou = statusDoJogo(jogoatual, Jogador, Maquina);
            //===============================================================================================
            
        }
        
        
    } 
    // METODO QUE MOSTRA O O JOGO ATUAL
    public void mostrarJogo(String jogoatual[][]){
        for(int l=0 ; l<3 ; l++){
            for(int c = 0;c<3;c++){
                if ("X".equals(jogoatual[l][c])) {
                    System.out.print(" X ");
                }else if ("O".equals(jogoatual[l][c])) {
                    System.out.print(" O ");
                }else{
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }

    }
    //===============================================================================================
    public boolean statusDoJogo(String[][] jogo, String p, String m) {
        // 1. VERIFICA VITÓRIA DO JOGADOR
        if ((jogo[0][0].equals(p) && jogo[0][1].equals(p) && jogo[0][2].equals(p)) ||
            (jogo[1][0].equals(p) && jogo[1][1].equals(p) && jogo[1][2].equals(p)) ||
            (jogo[2][0].equals(p) && jogo[2][1].equals(p) && jogo[2][2].equals(p)) ||
            (jogo[0][0].equals(p) && jogo[1][0].equals(p) && jogo[2][0].equals(p)) ||
            (jogo[0][1].equals(p) && jogo[1][1].equals(p) && jogo[2][1].equals(p)) ||
            (jogo[0][2].equals(p) && jogo[1][2].equals(p) && jogo[2][2].equals(p)) ||
            (jogo[0][0].equals(p) && jogo[1][1].equals(p) && jogo[2][2].equals(p)) ||
            (jogo[0][2].equals(p) && jogo[1][1].equals(p) && jogo[2][0].equals(p))) {
        
            System.out.println("\n--------- FIM DE JOGO ---------");
            System.out.println("Parabéns! O " + p + " venceu!");
            System.out.println("-------------------------------");
            return true; // Encerra o jogo
        }

        // 2. VERIFICA VITÓRIA DA MÁQUINA
        if ((jogo[0][0].equals(m) && jogo[0][1].equals(m) && jogo[0][2].equals(m)) ||
            (jogo[1][0].equals(m) && jogo[1][1].equals(m) && jogo[1][2].equals(m)) ||
            (jogo[2][0].equals(m) && jogo[2][1].equals(m) && jogo[2][2].equals(m)) ||
            (jogo[0][0].equals(m) && jogo[1][0].equals(m) && jogo[2][0].equals(m)) ||
            (jogo[0][1].equals(m) && jogo[1][1].equals(m) && jogo[2][1].equals(m)) ||
            (jogo[0][2].equals(m) && jogo[1][2].equals(m) && jogo[2][2].equals(m)) ||
            (jogo[0][0].equals(m) && jogo[1][1].equals(m) && jogo[2][2].equals(m)) ||
            (jogo[0][2].equals(m) && jogo[1][1].equals(m) && jogo[2][0].equals(m))) {
        
            System.out.println("\n--------- FIM DE JOGO ---------");
            System.out.println("Parabéns! O " + m + " venceu!");
            System.out.println("-------------------------------");
            return true; // Encerra o jogo
        }

        // 3. VERIFICA EMPATE (Se não houver mais "-")
        boolean temEspaco = false;
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                if (jogo[l][c].equals("-")) {
                    temEspaco = true;
                    break;
                }
            }
        }

        if (!temEspaco) {
            System.out.println("\n--- FIM DE JOGO ---");
            System.out.println("Deu Velha! Empate.");
            System.out.println("-------------------");
            return true; // Encerra o jogo
        }

        // 4. SE NÃO CAIU EM NADA DISSO, O JOGO CONTINUA
        return false;
    }
    //===============================================================================================

}