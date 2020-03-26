package Fundamentos.ConlusãoModulo;

import java.util.Scanner;

public class ConversaoFemC {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Informe a temperatura em °F");
		double tempF = entrada.nextDouble();
		
		double TempC = (tempF - 32 ) * 5/9;
		
		System.out.printf("A temperatura em Celsius é : %.2f", TempC);
		
		entrada.close();	
		
	}
}
