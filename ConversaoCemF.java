package Fundamentos.Conlus�oModulo;

import java.util.Scanner;

public class ConversaoCemF {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Informe a temperatura em �C");
		double tempC = entrada.nextDouble();
		
		double TempF = (tempC * 9/5) + 32;
		
		System.out.printf("A temperatura em Fahrenheit � : %.2f", TempF);
		
		entrada.close();
		
	}
}
