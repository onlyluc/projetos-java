package Pequenos;

import java.util.Scanner;

public class ConversorCelciusFahrenheit {

	public static void main(String[] args) {
		
		
		// Código simples para fixar meu conhecimento atual.
		
		System.out.println("Conversor de Celcius para Fahrenheit");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira a temperatura que deseja converter: ");
		
		double celcius = entrada.nextDouble();
		
		double fahrenheit = (celcius * 1.8) + 32;
		
		System.out.printf("O valor de %sºC equivale a %sºF", celcius, fahrenheit);
		
		entrada.close();
		
		
	}
}
