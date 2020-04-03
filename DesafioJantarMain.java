package classe;

public class DesafioJantarMain {
	
	public static void main(String[] args) {
		
		DesafioPessoa p1 = new DesafioPessoa("Marcos", 99.3);
		DesafioComida c1 = new DesafioComida("Lasanha", 0.5);
		DesafioComida c2 = new DesafioComida("Hamburguer", 0.300); 
		
		System.out.println(p1.Apresentar());
		
		p1.comer(c1);
		System.out.println(p1.Apresentar());
		
		p1.comer(c2);
		System.out.println(p1.Apresentar());
		
	}

}
