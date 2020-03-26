package controle;

import java.util.Scanner;

public class IfElseIF {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a nota:");
		double nota = entrada.nextDouble();
		
		if (nota > 10 || nota < 0) {
			System.out.println("Nota invalida!");
		}else if (nota >= 8) {
			System.out.println("Conceito A!");
		}
		else if (nota >= 6) {
			System.out.println("Conceito B!");
		}
		else if (nota >= 4) {
			System.out.println("Conceito C!");
		}
		else if (nota >= 3) {
			System.out.println("Conceito D!");
		}
		else {
			System.out.println("Conceito E!");
		}
		entrada.close();
	}

}
