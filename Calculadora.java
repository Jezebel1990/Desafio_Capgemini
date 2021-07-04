package Desafio;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double numero1 = 0;
		double resultado = 0;
		double formula;   // Formula = ((alcance:12%) * (custo médio por pessoa:R$0,1) * (compartilhamento:3))//
		formula = 3.6;
		boolean opcao2 = false;
		boolean sair = false; 
		
		do {
			
			resultado = 0;
			
			System.out.println("............................................................");
			System.out.println("-------- CALCULADORA DE ALCANCE DE ANUNCIO ONLINE ----------");
			System.out.println("............................................................");
			System.out.println("Informe o Valor Investido: R$: ");
			numero1 = scanner.nextDouble();
			System.out.println("Para Estimativa Máxima de Visualizações DIGITE: 2 ");
		
			if(scanner.nextInt() != 2) {
				opcao2 = false;
				System.out.println("Valor não permitido!");
			}else {
		
					resultado = numero1/formula;
				}
			 
			System.out.println("............................................................");
			System.out.printf( "A Estimativa Máxima de Visualizações é de: %.0f", resultado );
			System.out.println("\n............................................................");
			System.out.println("\nPARA SAIR DIGITE: 0\n\nPARA CONTINUAR DIGITE: 1");
			if(scanner.nextInt() == 0) {
				sair = true;
			}
		}while(sair == false);
}
}

