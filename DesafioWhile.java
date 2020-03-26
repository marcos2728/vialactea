package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double nota = 0;
		double qtdnok = 0;
		double media = 0;
		double total = 0;
		double qtdok = 0;
		
		while(nota != -1){
			System.out.println("Informe a nota ou menos -1 para sair: ");
			nota = entrada.nextDouble();
			
			if(nota > 10 || (nota <0 && nota != -1)){
				qtdnok++;
			}else{
				if(nota == -1) {
					System.out.println("Processo Finalizado! Segue os dados do processamento.");
				}else {
					total += nota;
					qtdok++;
				}
			}
		}	
		media = total/qtdok;
		
		System.out.printf("Quantidade de notas informadas nok é: %.2f", qtdnok);
		System.out.printf("\nQuantidade de notas informadas ok é: %.2f", qtdok);
		System.out.printf("\nMedia das notas é: %.2f", media);
		entrada.close();
	}
}
