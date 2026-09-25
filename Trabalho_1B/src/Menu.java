import java.util.Scanner;

public class Menu {

    //Função para ordenar o NOME = Texto
    public static void bubbleSortNome(Aluno[] alunos, int totalAlunos){
        for (int i = 0 ; i < totalAlunos ; i++ ){
            for (int j = 0 ; j < totalAlunos - 1; j++){ //-1 porque um número compara com o proximo, mas e quando chegar no último número? Qual é o proximo?
                if (alunos[j].getNome().compareTo( alunos[j+1].getNome() ) > 0){  //A=65  |  Z=90 | ou seja A-Z= 25  | 25 > 0
                    Aluno temp = alunos[j+1];
                    alunos[j+1] = alunos[j];
                    alunos[j] = temp;
                }
            }
        }
    }

    //Função para ordenar o RA = numero
    public static void bubbleSortRA(Aluno[] alunos, int totalAlunos){
        for (int i = 0 ; i < totalAlunos ; i++ ){
            for (int j = 0 ; j < totalAlunos - 1; j++){ //-1 porque um número compara com o proximo, mas e quando chegar no último número? Qual é o proximo?
                if (alunos[j].getRa() < alunos[j+1].getRa()){  //A=65  |  Z=90 | ou seja A-Z= 25  | 25 > 0
                    Aluno temp = alunos[j+1];
                    alunos[j+1] = alunos[j];
                    alunos[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Aluno[] alunos = new Aluno[5];
        int totalAlunos = 0,op, play = 0;

        while (play == 0){

            try {

                System.out.println("\n---  MENU  ---");
                System.out.println("1. Cadastrar Alunos");
                System.out.println("2. Relatório por Nome (Crescente)");
                System.out.println("3. Relatório por RA (Decrescente)");
                System.out.println("4. Relatório de Aprovados (Crescente por Nome)");
                System.out.println("5. Sair");
                System.out.print("\nDigite o (Numero) da opção que deseja: ");
                op = sc.nextInt();
                sc.nextLine();

            } catch (Exception e){

                sc.nextLine();
                System.out.println("\n==================================================================");
                System.out.println("ERRO!!! Você não digitou um numero inteiro!");
                System.out.println("Digite somente o numero da opção desejada para executar o programa!");
                System.out.println("==================================================================");
                continue;

            }
            switch (op){

                case 1: // CADASTRAR ALUNOS

                    System.out.println("\n---  Cadastrando aluno  ---");

                    if (totalAlunos < alunos.length){

                        try {

                            System.out.print("NOME: "); String nome = sc.nextLine();
                            System.out.print("RA: "); int ra = sc.nextInt();
                            System.out.print("IDADE: "); int idade = sc.nextInt();
                            sc.nextLine();
                            System.out.print("SEXO [M/F]: "); String sexo = sc.nextLine();
                            System.out.print("MEDIA: "); double media = sc.nextDouble();
                            sc.nextLine();

                            Aluno novo = new Aluno(nome,ra,idade,sexo,media);

                            alunos[totalAlunos] = novo;
                            totalAlunos++;
                            System.out.println("\n---  Aluno cadastrado com sucesso!  ---");

                        }catch (Exception e){

                            sc.nextLine();
                            System.out.println("\n==================================");
                            System.out.println("ERRO!!!");
                            System.out.println("Você digitou um dado incorreto!");
                            System.out.println("Ex: Letra em campo de numero");
                            System.out.println("====================================");

                        }

                    } else {System.out.println("Numero máximo de alunos cadastrados, atingidos!");}
                    break;

                case 2:  // MOSTRAR RELATÓRIO DOS ALUNOS POR ORDEM CRESCENTE - POR NOME

                    bubbleSortNome(alunos,totalAlunos);

                    //MOSTRA DADOS DE TODOS OS ALUNOS
                    System.out.println("\n---  Alunos ordenados por NOME (CRESCENTE)  ---");
                    System.out.printf("%-15s | %-10s | %-6s | %-5s | %-6s | %-10s%n",
                    "NOME","RA","IDADE","SEXO","MEDIA","RESULTADO");
                    System.out.println("------------------------------------------------------------------");

                    for (Aluno a : alunos){

                        if (a != null) {

                            System.out.printf("%-15s | %-10d | %-6d | %-5s | %-6.2f | %-10s%n",
                            a.getNome(),a.getRa(),a.getIdade(),a.getSexo(),a.getMedia(),a.getResultado());

                        }
                    }
                    break;

                case 3: // MOSTRAR RELATÓRIO DOS ALUNOS POR ORDEM DECRESCENTE - POR RA

                    bubbleSortRA(alunos,totalAlunos);

                    System.out.println("\n---  Alunos ordenados por RA (DECRESCENTE) ---");
                    System.out.printf("%-15s | %-10s | %-6s | %-5s | %-6s | %-10s%n",
                    "NOME","RA","IDADE","SEXO","MEDIA","RESULTADO");
                    System.out.println("------------------------------------------------------------------");

                    for (Aluno a : alunos){

                        if (a != null) {

                            System.out.printf("%-15s | %-10d | %-6d | %-5s | %-6.2f | %-10s%n",
                            a.getNome(),a.getRa(),a.getIdade(),a.getSexo(),a.getMedia(),a.getResultado());
                        }
                    }

                    break;

                case 4: // MOSTRAR RELATÓRIO DOS ALUNOS APROVADOS

                    bubbleSortNome(alunos,totalAlunos);

                    System.out.println("\n---  Todos os alunos aprovados  ---");
                    System.out.printf("%-15s | %-10s | %-6s | %-5s | %-6s | %-10s%n",
                    "NOME","RA","IDADE","SEXO","MEDIA","RESULTADO");
                    System.out.println("------------------------------------------------------------------");

                    for (Aluno a : alunos){

                        if (a != null){

                            if (a.getResultado().equals("Aprovado")) {

                                System.out.printf("%-15s | %-10d | %-6d | %-5s | %-6.2f | %-10s%n",
                                a.getNome(),a.getRa(),a.getIdade(),a.getSexo(),a.getMedia(),a.getResultado());

                            }
                        }
                    }

                    break;

                case 5:

                    System.out.print("\n---  Saindo do programa...  ---\n");
                    play = 1;
                    break;

                default: System.out.print("Numero invalido");break;
            }
        }
    }
}
