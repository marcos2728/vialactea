package Fundamentos.operadores;

public class Relacionais {

	public static void main(String[] args) {
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a != b);
		
		double nota = 7.3;
		boolean bomComp = false;
		boolean passouMd = nota >= 7;
		boolean temDesc = bomComp && passouMd;
		
		
		System.out.println("Tem Desconto ? " + temDesc);
	}
}
