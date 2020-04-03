package classe;

public class DesafioPessoa {

	String NomePess;
	Double PesoPess;
	
	DesafioPessoa(String NomePess, double PesoPess){
		this.NomePess = NomePess;
		this.PesoPess = PesoPess;
	}
	
	void comer (DesafioComida comida){
		if(comida != null) {
			this.PesoPess += comida.PesoComi;
		}
	}
	
	String Apresentar(){
		return "Meu nome é " + NomePess + " e peso " + PesoPess + " Kg.";
	}
	
}
