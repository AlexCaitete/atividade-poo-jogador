package ventilador;

public class Ventilador {
	
	boolean ligado;
	int velocidade;
	
	boolean ligarDesligar() {
		return ligado=! ligado;
		
		
	}
	int definirVelocidade(int valor) {
		
		velocidade = valor;
		if (velocidade < 0) {
			velocidade = 0;
		}
		if(velocidade > 3) {
			velocidade = 3;
		}
		
		
		return velocidade;
	}
	

}
