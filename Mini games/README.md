# 🎮 Java Game Center

Um console de jogos clássicos desenvolvido em **Java** que reúne quatro modalidades diferentes em uma única interface de menu[cite: 2]. O projeto foca na organização modular, utilizando pacotes para separar a lógica de controle da interface com o usuário[cite: 2, 3].

## 🕹️ Jogos Inclusos

*   **Adivinha o Número**: O sistema gera um valor aleatório de 0 a 10 e o jogador deve tentar acertar, com a opção de repetir a partida[cite: 3].
*   **Par ou Ímpar**: Simulação clássica contra a máquina. O programa soma os valores escolhidos e utiliza o operador de módulo para definir o vencedor[cite: 5].
*   **Jaquempô (Pedra, Papel e Tesoura)**: Implementação de lógica de decisão onde a máquina escolhe uma jogada aleatória para enfrentar o jogador[cite: 4].
*   **21 (Blackjack com Dados)**: O jogo mais complexo do pacote, envolvendo acumuladores de pontuação e uma lógica de decisão para a máquina decidir se continua ou para de jogar os dados[cite: 6].

## 🛠️ Tecnologias e Conceitos Aplicados

*   **Linguagem**: Java[cite: 2].
*   **Programação Orientada a Objetos (POO)**: Divisão de responsabilidades em diferentes classes para cada jogo[cite: 3, 4, 6].
*   **Encapsulamento**: Uso de pacotes (`package pacote`) para organizar o diretório do projeto[cite: 2, 3].
*   **Estruturas de Controle**: Aplicação intensiva de `while` para loops de jogo, `switch case` para menus e `if/else` para validação de vitórias[cite: 2, 4, 6].
*   **Geração Aleatória**: Uso da classe `java.util.Random` para simular as jogadas da máquina[cite: 3, 5, 6].

## 📂 Estrutura de Arquivos

Conforme o padrão de estrutura do VS Code[cite: 1], os arquivos estão organizados da seguinte forma:

*   `Menu.java`: Classe principal que gerencia o fluxo de navegação e a entrada de dados inicial[cite: 2].
*   `src/pacote/AdivinharNumero.java`: Lógica do jogo de adivinhação[cite: 1, 3].
*   `src/pacote/Jaquempo.java`: Lógica do Pedra, Papel e Tesoura[cite: 1, 4].
*   `src/pacote/ParOuImpar.java`: Lógica do jogo Par ou Ímpar[cite: 1, 5].
*   `src/pacote/Vinteum.java`: Lógica do jogo 21 com dados[cite: 1, 6].

## 🚀 Como Executar

1.  Certifique-se de ter o **JDK** instalado em sua máquina.
2.  Clone o repositório.
3.  Abra a pasta no **VS Code**.
4.  Compile e execute através da classe `Menu.java`.

---
Desenvolvido por Vinicius Salviano como projeto prático de estudos em **Análise e Desenvolvimento de Sistemas**.
