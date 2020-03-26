package controle;

public class DesafioFor {
	public static void main(String[] args) {

		String val = "#";	
		for(String cont = "x"; !cont.equals("xxxxxx"); cont+="x") {
			System.out.println(val);
			
			val += "#";
		}
	}
}
