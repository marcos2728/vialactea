package controle;

import java.util.Scanner;

public class EstruturaIF {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a media: ");
		double media = entrada.nextDouble();
		
		if (media <= 10.0 && media >= 7.0) {
			System.out.println("Aprovado!!!!");
			
		}
		
		entrada.close();
	}

}
