package controle;

public class Switch {
	
	public static void main(String[] args) {
		
		String faixa = "preta";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("blz");
		case "marron":
			System.out.println("ta quase");
		case "verde":
			System.out.println("Cansei");
		}
	}
}
