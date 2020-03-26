package Fundamentos;

import java.util.Scanner;

public class console {
	public static void main(String[] args) {
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2 ,3, 4, 5, 6 );
		System.out.printf("Salario %.1f %n", 1234.56789);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite Sobrenome: ");
		String sobreNome = entrada.nextLine();
		
		System.out.print("Digite idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("\n\nNome        = " + nome);
		System.out.printf("\nSobreNome   = " + sobreNome);
		System.out.printf("\nNome        = " + idade);
		
		System.out.printf("\n\nO nome do cidadão é %s %s e tem %d anos.", nome,sobreNome,idade);
		
		entrada.close();
		
	}

}
