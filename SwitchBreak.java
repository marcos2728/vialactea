package controle;

import java.util.Scanner;

public class SwitchBreak {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a note: ");
		int nota = entrada.nextInt();
		
		String conceito = " ";
		
		switch (nota) {
			case 10: 
			case 9:
				conceito = "A";
				break;
			case 6: 
			case 8:
				conceito = "B";
				break;
			case 3: 
			case 5:
				conceito = "C";
				break;	
			case 0: 
			case 2:
				conceito = "D";
				break;
			default:
				conceito = "Nao encontrado";
				break;
		}	
		
		System.out.println("O conceito é " + conceito );
		entrada.close();
	}
	
}
