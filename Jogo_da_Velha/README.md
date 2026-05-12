# 🎮 Jogo da Velha - Java

Este é um projeto de **Jogo da Velha** desenvolvido em Java, focado na aplicação de lógica de programação, estruturas de dados e Programação Orientada a Objetos (POO). O sistema oferece uma interface via terminal onde o usuário pode escolher entre enfrentar o computador ou jogar contra um amigo localmente.

## 🚀 Funcionalidades

* **Modo Contra a Máquina:** O jogador escolhe seu símbolo (X ou O) e joga contra movimentos gerados aleatoriamente pelo computador.
* **Modo Contra Amigo (Local):** Permite que dois jogadores realizem partidas alternadas no mesmo dispositivo.
* **Validação de Entradas:** O sistema impede jogadas em posições inexistentes ou que já foram ocupadas no tabuleiro.
* **Tratamento de Erros:** O programa trata entradas inválidas no menu principal para evitar interrupções inesperadas.
* **Detecção de Fim de Jogo:** Verifica automaticamente condições de vitória (linhas, colunas e diagonais) ou empate (Velha).

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java.
* **Ambiente:** Terminal/Console.
* **Conceitos:** Matrizes (Arrays Multidimensionais), Estruturas de Repetição, Condicionais e Manipulação de Pacotes.

## 📂 Estrutura do Projeto

O código está organizado para facilitar a manutenção:

* `ClassePrincipal.java`: Contém o método `main` e gerencia o menu de navegação.
* `Jogo.GameContraMaquina.java`: Gerencia a lógica do modo single-player.
* `Jogo.GameLocal.java`: Gerencia a lógica do modo multiplayer local.

## 📖 Como Rodar o Projeto

1. Certifique-se de ter o **Java JDK** instalado.
2. Clone ou baixe os arquivos do repositório.
3. Compile os arquivos:
   ```bash
   javac ClassePrincipal.java Jogo/*.java
