package Fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o primeiro numero: ");
		double valor1 = entrada.nextDouble();
		
		System.out.println("Informe o segundo numero: ");
		double valor2 = entrada.nextDouble();
		
		System.out.println("Informe o operador: ");
		String oper = entrada.next();
		
		double result = "+".equals(oper) ? valor1 + valor2 : 0;
			   result = "-".equals(oper) ? valor1 - valor2 : result;
			   result = "*".equals(oper) ? valor1 * valor2 : result;
			   result = "/".equals(oper) ? valor1 / valor2 : result;
			   result = "%".equals(oper) ? valor1 % valor2 : result;
		
		System.out.printf("%f %s %f = %.2f" , valor1 , oper , valor2, result);
		
		
		entrada.close();
		
		
	}

}
