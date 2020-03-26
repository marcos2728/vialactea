package Fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		double ºF = 86;
		
		final double PARM = 32;
		final double PARM2 = 5.0 / 9.0;
		
		double ºC = (ºF - PARM ) * PARM2;
		
		System.out.println("Temperatura em ºC " + ºC  );
	}

}
