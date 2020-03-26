package Fundamentos;

import javax.swing.JOptionPane;

public class DesafioConversao {
	
	public static void main(String[] args) {
		// Pegar 3 strings para cpturar os 3 ultimos salario e fazer media, pode ser digitado com virgula ou com ponto
		
		String sal1 = JOptionPane.showInputDialog("Favor informar o 1º salario: ");
		String sal2 = JOptionPane.showInputDialog("Favor informar o 2º salario: ");
		String sal3 = JOptionPane.showInputDialog("Favor informar o 3º salario: ");
		
		String salConv1 = sal1.replace(",", ".");
		String salConv2 = sal2.replace(",", ".");
		String salConv3 = sal3.replace(",", ".");
		
		double sal1Num = Double.parseDouble(salConv1);
		double sal2Num = Double.parseDouble(salConv2);
		double sal3Num = Double.parseDouble(salConv3);
		
		double media = ((sal1Num + sal2Num + sal3Num) / 3);
				
		 System.out.println(media);
		
		
	}
}
