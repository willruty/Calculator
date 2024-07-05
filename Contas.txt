package Calculadora;

public class Contas {

	protected Double somar(Double n1, Double n2) {
		double soma = n1 + n2;
		return soma;
	}
	
	protected double subtrair(Double n1, Double n2) {
		double subtracao = n1 - n2;
		return subtracao;
	}
	
	protected double multiplicar(Double n1, Double n2) {
		double vezes = n1 * n2;
		return vezes;
	}
	
	protected double dividir(Double n1, Double n2) {
		double dividir = n1 / n2;
		return dividir;
	}
	
	protected int fatorial(Integer n1) {
		int f = 1;
		
		for (int i = 1; i <= n1; i++) {
			f = f * i;
		}
		return f;
	}
	
	protected String parOuImpar(Integer n1) {
		int num = n1;
		
		boolean expressao = (num % 2) == 0;
		
		String resposta = expressao ? "Par" : "Impar";
		
		return resposta;
	}

	protected String baskara(Double a, Double b, Double c) {
		
		double DeltainSquareRoot = (b * b) - 4 * a * c;
		double FinalDelta = Math.sqrt(DeltainSquareRoot);
		
		double supCase1 = -(b) + FinalDelta;
		double supCase2 = -(b) - FinalDelta;
		
		double inf = 2 * a;
		
		double R1 = supCase1 / inf;
		double R2 = supCase2 / inf;
		
		String result = R1 + " e " + R2;
		return result;
	}
}
