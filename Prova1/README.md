# 🛒 Sistema de Simulação de Vendas de Eletrodomésticos

Este projeto em **Java** simula o processo de vendas de uma loja de eletrodomésticos de forma automatizada. Ele utiliza lógica de sorteio para processar 10 vendas aleatórias e gera relatórios em tempo real sobre faturamento, quantidade de itens e porcentagem de saída de cada produto.

## 🚀 Funcionalidades

*   **Simulação Automatizada**: Utiliza a classe `Random` para gerar vendas sem necessidade de entrada manual.
*   **Gestão de Estoque e Valor**: Calcula o faturamento total e a quantidade individual de cada item vendido.
*   **Análise de Dados**: Gera porcentagens precisas (formatadas com duas casas decimais) sobre a relevância de cada produto no total de vendas.
*   **Modularização**: O projeto é dividido em classes para separar a lógica de processamento da exibição de informações.

## 📦 Estrutura do Projeto

O código está organizado em dois arquivos principais:

1.  **`Eletrodomesticos.java`**: Contém o método `main`, o loop de repetição e o controle do faturamento.
2.  **`informacoes.java`**: Localizada no pacote `Pacote`, é responsável por toda a interface de saída (menus e relatórios).

## 🛠️ Produtos Simulados

| ID | Produto | Valor Unitário |
|:---:|:---:|:---:|
| 1 | Celular | R$ 100,00 |
| 2 | Liquidificador | R$ 200,00 |
| 3 | Rádio Relógio | R$ 300,00 |
| 4 | Forno Elétrico | R$ 400,00 |

## 💻 Exemplo de Execução

Ao rodar o programa, o console exibirá:
- O menu inicial de preços.
- O resumo a cada venda processada.
- A distribuição percentual final dos produtos.

---
Desenvolvido como parte dos estudos de **Análise e Desenvolvimento de Sistemas**.
