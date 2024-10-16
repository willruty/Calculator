package Calculadora;

import java.util.Scanner;

public class Saida extends Contas{

	
	boolean continuar = true;
	@SuppressWarnings("resource")
	protected void ExecutarCalculos() {
		Contas contas = new Contas();		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\nSelecione um dos números:");
		System.out.println("1 - Soma\n"
						+ "2 - Subtração\n"
						+ "3 - Multiplicação\n"
						+ "4 - Divisão\n"
						+ "5 - Fatoração\n"
						+ "6 - Verificação de par ou impar\n"
						+ "7 - Baskara\n"
						+ "8 - Sair\n----------");
							int op = entrada.nextInt();
							
		if(op == 1) {
		
			System.out.println("Quais números serão somados? ");
			double num1 = entrada.nextDouble();
			double num2 = entrada.nextDouble();
			double result = contas.somar(num1, num2);
			System.out.println("O resultado é: " + result);
			
		} else if(op == 2) {
			
			System.out.println("Quais números serão subtraidos? ");
			double num1 = entrada.nextDouble();
			double num2 = entrada.nextDouble();
			double result = contas.subtrair(num1, num2);
			System.out.println("O resultado é: " + result);
			
		} else if(op == 3) {
			
			System.out.println("Quais números serão multiplicados? ");
			double num1 = entrada.nextDouble();
			double num2 = entrada.nextDouble();
			double result = contas.multiplicar(num1, num2);
			System.out.println("O resultado é: " + result);
			
		} else if(op == 4) {
			
			System.out.println("Qual número será divido e qual irá dividr?");
			double num1 = entrada.nextDouble();
			double num2 = entrada.nextDouble();
			double result = contas.dividir(num1, num2);
			System.out.println("O resultado é: " + result);
			
		} else if(op == 5) {
			
			System.out.println("Qual será o número a ser fatorado? ");
			int num = entrada.nextInt();
			double result = contas.fatorial(num);
			System.out.println("O resultado é: " + result);
			
		} else if(op == 6) {
			
			System.out.println("Qual é o número inteiro para a verificação? ");
			int num = entrada.nextInt();
			String result = contas.parOuImpar(num);
			System.out.println("O número é: " + result);
			
		} else if (op == 7){
			
			 System.out.println("Digite o coeficiente A: ");
			 double coef1 = entrada.nextDouble();
			 System.out.println("Digite o coeficiente B: ");
			 double coef2 = entrada.nextDouble();
			 System.out.println("Digite o coeficiente C: ");
			 double coef3 = entrada.nextDouble();
			 String result = contas.baskara(coef1, coef2, coef3);
			 
			 System.out.println("As raizes são: " + result);
		} else if (op == 8) {
			continuar = false;
			System.out.println("Tchau!");
		}
	}	
	
}
 
