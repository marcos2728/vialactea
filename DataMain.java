package classe;

public class DataMain {

	public static void main(String[] args) {
		
		Data Dt1 = new Data();
		Data Dt2 = new Data();
		
		Dt1.dia = 31;
		Dt1.mes = 8;
		Dt1.ano = 1995;
		
		//Dt2.dia = 12;
		//Dt2.mes = 10;
		//Dt2.ano = 1994;
		
		String DataForm = Dt1.dataFormatada(); 
		System.out.printf("A primeira data é : " + DataForm);
		System.out.printf("\nA segunda data é %d/%d/%d",Dt2.dia,Dt2.mes,Dt2.ano);
	}
}
