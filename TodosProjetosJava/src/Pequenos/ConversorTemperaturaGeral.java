package Pequenos;

import java.util.Scanner;

public class ConversorTemperaturaGeral {
	
	public static void main(String[] args) {
		
		System.out.println("Conversor de temperaturas");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escolha a temperatura principal.\n" 
				+ "Digite [C] para Celcius\n"
				+ "Digite [F] para Fahrenheit\n"
				+ "Digite [K] para Kelvin");
		
		String temp1 = entrada.next();
		
		if("C".equalsIgnoreCase(temp1) 
				|| "F".equalsIgnoreCase(temp1)
				|| "K".equalsIgnoreCase(temp1)) {
			
				System.out.println("Para qual temperatura deseja converter?\n" 
				+ "Digite [C] para Celcius\n"
				+ "Digite [F] para Fahrenheit\n"
				+ "Digite [K] para Kelvin\n"); }
		
		else { 
			System.out.println("Digite um valor válido.");
		}
		entrada.close();
		
	}

}
