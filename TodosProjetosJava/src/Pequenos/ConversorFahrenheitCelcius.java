package Pequenos;

import java.util.Scanner;

public class ConversorFahrenheitCelcius {
	
	public static void main(String[] args) {
		
		System.out.println("Conversor de Fahrenheit para Celcius.");
		
		System.out.println("Insira a temperatura que deseja converter: ");
		
		Scanner entrada = new Scanner(System.in);
		
		double fahrenheit = entrada.nextDouble();
		
		double celcius = (fahrenheit - 32) / 1.8;
		
		System.out.printf("%sºF equivale a %sºC", fahrenheit, celcius);
		
		entrada.close();
	}

}
