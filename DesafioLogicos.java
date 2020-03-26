package Fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		
		// Trabalho na terça(V ou F)
		// Trabalho na quinta(V ou F)
		
		// Se os dois trabalhos der certo tv 50 
		// Se um dos dois trabalhos derem certos tv 32
		// E vai comprar sorve independente do resultado
		// Senão der certo nenhum dos dois trabalhos der certo
		
		
		boolean trab1 = false;
		boolean trab2 = false;
		
		boolean cmpTv50 = trab1 && trab2;
		
		System.out.println("Realizou a compra da tv 50 Polegadas : " + cmpTv50);
		
		boolean cmpTv32 = trab1 ^ !trab2;
		
		System.out.println("Realizou a compra da Tv 32 Polegadas : " + cmpTv32);
		
	}
}
