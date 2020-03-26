package Fundamentos;

public class Wrapper {
	
	public static void main(String[] args) {
	//	Scanner entrada = new Scanner(System.in);
		//  byte
		Byte b = 1;
		Short s = 1000;
		//Integer.parseInt(entrada.next());
		
		Integer i = 10000;// Tipo primitivo é int
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		//entrada.close();
		
	}

}
