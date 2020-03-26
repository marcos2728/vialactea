package Fundamentos;

public class notacaoPonto {
	public static void main(String[] args) {

		String s = "Bom Dia X";
		s = s.replace("X", "Senhor");
		s = s.concat("!!!");
		s = s.toUpperCase();
		
		System.out.println(s);
		System.out.println("marcos".toUpperCase());
		
		String y = "Bom Dia X".replace("X", "Marcos").toUpperCase().concat("!!!");
		
		System.out.println(y);
		
		// tipos primitivos nao tem operador "."
		
		
	}

}
