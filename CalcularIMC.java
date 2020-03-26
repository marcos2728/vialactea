package Fundamentos.ConlusãoModulo;

import java.util.Scanner;

public class CalcularIMC {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a Altura: ");
		double altura = entrada.nextDouble();
	
		
		System.out.println("Informe o peso");
		double peso = entrada.nextDouble();
		
		double imc = peso / (Math.pow(altura, 2));
		
		System.out.printf("Seu IMC é de %.3f", imc);
		
		entrada.close();
	}

}
