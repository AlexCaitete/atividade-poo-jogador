package atv04;

public class Appjogador {

	public static void main(String[] args) {
		
		// 1. Declarar e instanciar um objeto da classe Jogador
		Jogador jogador1 = new Jogador();
		
		// 2. Atribuir nome "O maior", situação Jogando e 5 pontos
		jogador1.nome = "O maior";
		jogador1.situacao = true;
		jogador1.pontuacao = 5;
		
		// 3. Mostre todos os dados do jogador, substituindo o atributo lógico pelo correspondente texto (true = Jogando; false = Eliminado).
		System.out.println("---DADOS INICIAIS---");
		System.out.println("Nome: "+ jogador1.nome);
		System.out.println("Pontuaçao: "+ jogador1.pontuacao);
		if (jogador1.situacao == true) {
			System.out.println("Situação jogando");
		} else {
			System.out.println("Situação Eliminado");
		}
		// 4. Faça o jogador ganhar 3 pontos.
		jogador1.ganharPontos(3);
		
		// 5. Mostre todos os dados do jogador, substituindo o atributo lógico pelo correspondente texto...
        System.out.println("\n--- APÓS GANHAR 3 PONTOS ---");
        System.out.println("Nome: " + jogador1.nome);
        System.out.println("Pontuação: " + jogador1.pontuacao);
        if (jogador1.situacao == true) {
            System.out.println("Situação: Jogando");
        } else {
            System.out.println("Situação: Eliminado");
        }
        
        // 6. Faça o jogador perder 20 pontos.
        jogador1.perderPontos(20);
        
        // 7. Mostre todos os dados do jogador, substituindo o atributo lógico pelo correspondente texto...
        System.out.println("\n--- APÓS PERDER 20 PONTOS ---");
        System.out.println("Nome: " + jogador1.nome);
        System.out.println("Pontuação: " + jogador1.pontuacao);
        if (jogador1.situacao == true) {
            System.out.println("Situação: Jogando");
        } else {
            System.out.println("Situação: Eliminado");
        }
	}

}
