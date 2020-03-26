package Fundamentos.ConlusãoModulo;

import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um numero: ");
		double num1 = entrada.nextDouble();
		
		double resul2 = Math.pow(num1, 2);
		double resul3 = Math.pow(num1, 3);
		
		System.out.printf("O resultado ao quadrado é %.2f e ao cubo é %.2f.", resul2, resul3);
		
		entrada.close();
		
	}	
}
