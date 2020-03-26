package Fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Dados funcionario 
		
		// Numeros interios
		byte anosDeEmpresa = 127;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		// tipos numericos reais
		float salario = 11_445.44F;
		double vendasAcumaladas = 22_991_797_103.01;
		
		// tipos booleano
		boolean estaDeFerias = false; //true
		
		//Tipo caractere
		char status = 'A';
		
		// Dias de empresa
		
		System.out.println(anosDeEmpresa * 365);
		
		// Numero de Viagens 
		System.out.println(numeroDeVoos / 2);
		
		// Numero por real
		System.out.println(pontosAcumulados/ vendasAcumaladas );
		
		System.out.println(id + ": ganha ->" + salario);
		System.out.println("Ferias ? " + estaDeFerias);
		System.out.println("Status: " + status);
		
	}

}
