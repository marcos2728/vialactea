package Fundamentos.operadores;

public class DesafioAritimetico {
	
	public static void main(String[] args) {
		double expr1 = 6 * (3+2);
		double resuExp1 = Math.pow(expr1, 2);
		double den1 = 3*2;
		double resul1 =  resuExp1 / den1;
		
		double expr2 = (1-5) * (2-7);
		double resuExp2 = Math.pow(expr2/2, 2);
		
		double resuExp3 = Math.pow((resul1 - resuExp2), 3);
		double expr3 = Math.pow(10, 3);
		
		double resuFinal = resuExp3 / expr3;
		
		System.out.println("Resultado é : " + resuFinal);
		
		
	
	}
	
	
}
