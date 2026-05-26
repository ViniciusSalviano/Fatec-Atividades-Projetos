# 🚢 Simulação de Batalha Naval

Este é um projeto desenvolvido em **Java** que simula de forma automatizada uma partida de Batalha Naval entre dois jogadores. O jogo roda diretamente no console, alternando turnos e exibindo o estado dos tabuleiros em tempo real até que um dos jogadores vença.

## ⚙️ Funcionalidades

* **Geração Automática**: Os tabuleiros de tamanho 5x5 são inicializados dinamicamente.
* **Posicionamento Aleatório**: Cada jogador recebe 10 navios posicionados aleatoriamente pelo sistema.
* **Modo Simulação**: Os tiros são disparados de forma automática e inteligente (evitando atirar no mesmo lugar duas vezes).
* **Visualização em Tempo Real**: O console exibe o placar e o mapa de ambos os jogadores a cada rodada com uma pausa de 1 segundo para melhor acompanhamento.

---

## 🗺️ Legenda do Tabuleiro

Durante a execução, o tabuleiro utiliza os seguintes caracteres:

| Ícone | Descrição |
| :---: | --- |
| `~` | Água (Posição ainda não atingida) |
| `X` | Navio (Escondido ou posicionado) |
| `*` | Fogo (Navio atingido com sucesso) |
| `-` | Água atingida (Tiro na água/Erro) |

---

## 📦 Estrutura do Projeto

O código está organizado em pacotes para separar as responsabilidades de cada classe:

```text
├── BatalhaNavalSimulacao.java   # Classe principal (contém o loop do jogo)
└── pacote/
    ├── CriarTabuleiro.java      # Inicializa a matriz do tabuleiro
    ├── Posicionar.java          # Distribui os navios aleatoriamente
    ├── Atirar.java              # Lógica de disparos aleatórios e validações
    └── ExibirJogo.java          # Formatação e exibição gráfica no console
