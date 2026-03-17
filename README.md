# Atividade Prática: Orientação a Objetos - Classe Jogador 🎮

Este repositório contém a resolução de um exercício prático de **Programação Orientada a Objetos (POO)** desenvolvido em Java. O objetivo principal da atividade foi modelar e implementar o comportamento básico de um jogador, controlando sua pontuação e sua situação no jogo.

## 📝 Descrição do Exercício

O sistema é composto por duas classes principais e simula as ações de um jogador durante uma partida, respeitando regras específicas de pontuação e eliminação.

### Regras de Negócio Implementadas:
* **Atributos do Jogador:** Cada jogador possui um Nome (texto), uma Pontuação (inteiro) e uma Situação (lógico, onde `true` = Jogando e `false` = Eliminado).
* **Ganhar Pontos:** O jogador só pode receber novos pontos se a sua situação atual for "Jogando". Não há limite máximo de pontuação.
* **Perder Pontos:** O jogador perde pontos com base em um valor informado. A pontuação mínima é `0`. Se, ao perder pontos, a pontuação chegar a zero ou menos, o status do jogador é automaticamente alterado para "Eliminado" (`false`).

## 🛠️ Tecnologias e Conceitos Utilizados

* **Linguagem:** Java
* **IDE:** Eclipse
* **Conceitos de POO:**
  * Criação de Classes e Objetos (Instanciação).
  * Atributos de diferentes tipos (`String`, `int`, `boolean`).
  * Criação de Métodos com passagem de parâmetros.
  * Estruturas de controle de fluxo (`if/else`) aplicadas às regras de negócio.

## 📂 Estrutura do Código

O projeto está dividido em dois arquivos dentro do pacote `atv04`:

1. `Jogador.java`: É a classe "molde". Contém os atributos do jogador e a lógica dos métodos `ganharPontos()` e `perderPontos()`.
2. `Appjogador.java`: É a classe principal (`main`). Responsável por instanciar o jogador "O maior", atribuir os valores iniciais (5 pontos, situação: jogando) e testar os métodos exibindo os resultados no console passo a passo.

## ▶️ Como executar

1. Clone este repositório em sua máquina local.
2. Abra o projeto em sua IDE Java de preferência (recomendado: Eclipse).
3. Navegue até o pacote `atv04` e execute o arquivo `Appjogador.java`.
4. Acompanhe as saídas e as mudanças de status do jogador pelo console da IDE.

---
*Atividade desenvolvida para fins de estudo e prática de fundamentos de Java e POO.*
