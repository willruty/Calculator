package Calculadora;

public class Teste extends Saida {

	public static void main(String[] args) {
		
		Saida saida = new Saida();
		System.out.println("Olá, Seja bem vindo!");
		
		do { 
			saida.ExecutarCalculos();
			
		} while (saida.continuar);
		
	}
}
