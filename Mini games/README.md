# 🎮 Java Game Center

Um console de jogos clássicos desenvolvido em **Java** que reúne quatro modalidades diferentes em uma única interface de menu. O projeto foca na organização modular, utilizando pacotes para separar a lógica de controle da interface com o usuário.

## 🕹️ Jogos Inclusos

*   **Adivinha o Número**: O sistema gera um valor aleatório de 0 a 10 e o jogador deve tentar acertar, com a opção de repetir a partida.
*   **Par ou Ímpar**: Simulação clássica contra a máquina. O programa soma os valores escolhidos e utiliza o operador de módulo para definir o vencedor.
*   **Jaquempô (Pedra, Papel e Tesoura)**: Implementação de lógica de decisão onde a máquina escolhe uma jogada aleatória para enfrentar o jogador.
*   **21 (Blackjack com Dados)**: O jogo mais complexo do pacote, envolvendo acumuladores de pontuação e uma lógica de decisão para a máquina decidir se continua ou para de jogar os dados.

## 🛠️ Tecnologias e Conceitos Aplicados

*   **Linguagem**: Java.
*   **Programação Orientada a Objetos (POO)**: Divisão de responsabilidades em diferentes classes para cada jogo.
*   **Encapsulamento**: Uso de pacotes (`package pacote`) para organizar o diretório do projeto.
*   **Estruturas de Controle**: Aplicação intensiva de `while` para loops de jogo, `switch case` para menus e `if/else` para validação de vitórias.
*   **Geração Aleatória**: Uso da classe `java.util.Random` para simular as jogadas da máquina.

## 📂 Estrutura de Arquivos

Conforme o padrão de estrutura do VS Code, os arquivos estão organizados da seguinte forma:

*   `Menu.java`: Classe principal que gerencia o fluxo de navegação e a entrada de dados inicial.
*   `src/pacote/AdivinharNumero.java`: Lógica do jogo de adivinhação.
*   `src/pacote/Jaquempo.java`: Lógica do Pedra, Papel e Tesoura.
*   `src/pacote/ParOuImpar.java`: Lógica do jogo Par ou Ímpar.
*   `src/pacote/Vinteum.java`: Lógica do jogo 21 com dados.

## 🚀 Como Executar

1.  Certifique-se de ter o **JDK** instalado em sua máquina.
2.  Clone o repositório.
3.  Abra a pasta no **VS Code**.
4.  Compile e execute através da classe `Menu.java`.

---
Desenvolvido por Vinicius Salviano como projeto prático de estudos em **Análise e Desenvolvimento de Sistemas**.
