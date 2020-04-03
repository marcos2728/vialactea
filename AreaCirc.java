package classe;

public class AreaCirc {

	double raio;
	final static double PI = 3.14;
	
	AreaCirc(double raioInic) {
		raio = raioInic;
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}
}
