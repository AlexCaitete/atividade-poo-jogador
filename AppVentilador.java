package ventilador;

public class AppVentilador {

	public static void main(String[] args) {
		
		Ventilador ventiladorSala = new Ventilador();
		
		//ligar o ventilador
		ventiladorSala.ligarDesligar();	
		System.out.println("Estado: " + estadoVentilador(ventiladorSala.ligado));
		
		//alterar a velocidade;
		System.out.println("Velocidade: " + ventiladorSala.definirVelocidade(5));
		
		//desligar o ventilador;
		ventiladorSala.ligarDesligar();
		System.out.println("Estado: " + estadoVentilador(ventiladorSala.ligado));
		
		//exibir o estado e a velocidade atual
		System.out.println("--------------------");
		System.out.println("Estado: " + estadoVentilador(ventiladorSala.ligado) );
		System.out.println("velocidade: " + ventiladorSala.definirVelocidade(2));

	}
	public static String estadoVentilador(boolean estado) {
		return estado ? "ligado" : "desligado";
	}
}
