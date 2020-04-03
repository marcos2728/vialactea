package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
	
		Produto p1 = new Produto("Notebook",4300);
		//p1.nome = "Notebook";
		
		var p2 = new Produto("Caneta Azul", 12);
		//p2.nome = "Caneta Azul";
		//p2.preco = 12;
		
		double prcFinal1 = p1.precoComDesconto();
		double prcFinal2 = p2.precoComDesconto();
		
		System.out.println("Preço 1 -> " + prcFinal1);
		System.out.println("Preço 2 -> " + prcFinal2);
		System.out.println((prcFinal1 + prcFinal2) / 2);
		
	}

}
