package Fundamentos;

public class tipoString {
		public static void main(String[] args) {
			System.out.println("Ola Pessoal".charAt(2));
			String s = "Boa Tarde";
			System.out.println("!!!");
			System.out.println(s + "!!!");
			System.out.println(s.toLowerCase().startsWith("boa"));
			System.out.println(s.length());
			System.out.println(s.endsWith("Tarde"));
			System.out.println(s.equals("Boa Tarde"));
			System.out.println(s.equalsIgnoreCase("Boa Tarde"));
			
			var nome = "Pedro";
			var sobrenome = "Santos";
			var idade = 33;
			var salario = 12345.987;
			
			System.out.printf("O senhor %s %s tem %d anos e ganha %.2f.", nome,sobrenome,idade,salario);
		}

}
