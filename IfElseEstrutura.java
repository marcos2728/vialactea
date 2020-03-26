package controle;

import javax.swing.JOptionPane;

public class IfElseEstrutura {

	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog("Informe o número");
		
		int numero = Integer.parseInt(valor);
		
		if (numero % 2 == 0 ) {
			System.out.println("O numero é par!!!");
		}
		else {
			System.out.println("O numero é impar!!!");
		}
	}
}
