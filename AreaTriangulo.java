package Fundamentos.ConlusãoModulo;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor da base do triangulo: ");
		double base = entrada.nextDouble();
		
		System.out.println("Informe o valor da altura do triangulo: ");
		double altura = entrada.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.printf("Area do triangulo é %.2f.", area);
		
		entrada.close();
	
	}
}
