package Pequenos;

import java.util.Scanner;

public class ConversorCelciusKelvin {
	
	public static void main(String[] args) {
		
		System.out.println("Conversor de Celcius para Kelvin");
		
		System.out.println("Insira a temperatura que deseja converter: ");
		
		Scanner entrada = new Scanner(System.in);
		
		double celcius = entrada.nextDouble();
		
		double kelvin = celcius + 273.15;
		
		System.out.printf("O valor de %sºC equivale a %sºK", celcius, kelvin);
		
		entrada.close();
	}

}
