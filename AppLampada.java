package lampada;

public class AppLampada {

	public static void main(String[] args) {
		
		Lampada lampadaSala = new Lampada();
		
		// ligar a lâmpada da sala e mostrar o estado atual da lampada,
		// subtituindo true por ligada e false por desligada
		System.out.println("Estado atual: " + estadoLampada(lampadaSala.ligado));
		System.out.println("Brilho: " + lampadaSala.brilho);
		
		// ligar a lâmpada da sala e mostrar o estado atual da lampada,
		// subtituindo true por ligada e false por desligada
		lampadaSala.ligarDesligar();
		System.out.println("Estado atual:" + estadoLampada(lampadaSala.ligado));
		
		// definir um brilho da lampada da sala em 40 e mostrar o brilho atual
		lampadaSala.ajustarbrilho(40);
		System.out.println("Brilho: " + lampadaSala.brilho);
		
		// definir um brilho da lampada da sala em 200 e mostrar o brilho atual
		lampadaSala.ajustarbrilho(200);
		System.out.println("Brilho: " + lampadaSala.brilho);
		
		// definir um brilho da lampada da sala em -1 e mostrar o brilho atual
		lampadaSala.ajustarbrilho(-1);
		System.out.println("Brilho: " + lampadaSala.brilho);
		
		// desligar a lâmpada da sala e mostrar o estado atual da lampada,
		// subtituindo true por ligada e false por desligada;
		lampadaSala.ligarDesligar();
		System.out.println("Estado: " + estadoLampada(lampadaSala.ligado));		
			
		
		

	}
	public static String estadoLampada(boolean estado) {
		return estado ? "Ligada" : "Desligada";
	}

}
