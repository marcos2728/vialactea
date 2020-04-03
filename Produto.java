package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.5;
	
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}

	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
}
