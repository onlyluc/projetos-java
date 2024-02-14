package Pequenos;

import java.util.Scanner;

public class Adicao {
	
	public static void main(String[] args) {
		
		System.out.println("Aqui podemos realizar a adição de dois números");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		
		double num1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo número");
		
		double num2 = entrada.nextDouble();
		
		double soma = num1 + num2;
		
		System.out.printf("A soma dos números %s + %s equivale a %s", num1, num2, soma);
		
		entrada.close();
	}

}
