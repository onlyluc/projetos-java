package Pequenos;

import java.util.Scanner;

public class ConversorFahrenheitKelvin {
	
	public static void main(String[] args) {
		
		
		// Now I'm doing the same but in English 
		
		System.out.println("Now let's convert Fahrenheit to Kelvin");
		
		System.out.println("Please insert the temperature you want to convert: ");
		
		Scanner enter = new Scanner(System.in);
		
		double fahrenheit = enter.nextDouble();
		
		double kelvin = (fahrenheit + 459.67) * 5 / 9;
		
		System.out.printf("%sºF is equivalent to %.7sºK", fahrenheit, kelvin);
		
		enter.close();
	}

}
