package atv04;

public class Jogador {
	
	String nome;
	int pontuacao;
	boolean situacao;
	
	
	int ganharPontos(int pontos) {
		
		if (situacao == true) {
			pontuacao = pontuacao + pontos;
		}
		return pontuacao;
		
	}
	
	int perderPontos(int pontos) {
		
		if (situacao == true) {
			pontuacao = pontuacao - pontos;
			
			if (pontuacao <= 0) {
				pontuacao = 0;
				situacao = false;
			}
		}
		return pontuacao;
	}

}
