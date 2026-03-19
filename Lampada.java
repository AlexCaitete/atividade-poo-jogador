package lampada;

public class Lampada {
	
	boolean ligado;
	int brilho;
	
	boolean ligarDesligar() {
		
		return ligado = !ligado;
	}
	int ajustarbrilho(int valor) {
		
		brilho = valor;
		if (brilho < 0) {
			brilho = 0;
		}
		if (brilho > 100) {
			brilho = 100;
		}
		return brilho;
	}

}
