package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Quer sair?");
			texto = entrada.next();
		}while(!texto.equalsIgnoreCase("Sim"));
		
		
		entrada.close();
	}

}
