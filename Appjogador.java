package atv04;

public class Appjogador {

    public static void main(String[] args) {
        
        // 1. Declarar e instanciar um objeto da classe Jogador
        Jogador jogador = new Jogador();
        
        // 2. Atribuir nome, situação e pontos
        jogador.nome = "O maior";
        jogador.situacao = true;
        jogador.pontuacao = 5;
        
        // 3. Mostre todos os dados do jogador
        System.out.println("--- DADOS INICIAIS ---");
        MostrarJogador(jogador);
        
        // 4. Faça o jogador ganhar 3 pontos.
        jogador.ganharPontos(3);
        
        // 5. Mostre todos os dados do jogador
        System.out.println("\n--- APÓS GANHAR 3 PONTOS ---");
        MostrarJogador(jogador);
       
        // 6. Faça o jogador perder 20 pontos.
        jogador.perderPontos(20);
        
        // 7. Mostre todos os dados do jogador
        System.out.println("\n--- APÓS PERDER 20 PONTOS ---");
        MostrarJogador(jogador);
        
    }
    
    // Método auxiliar para imprimir os dados
    public static void MostrarJogador(Jogador jogador) {
         System.out.println("Nome: " + jogador.nome);
         System.out.println("Pontuação: " + jogador.pontuacao);
         System.out.println("Situação: " + (jogador.situacao ? "Jogando" : "Eliminado"));
    }

}