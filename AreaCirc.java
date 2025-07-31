package classe;

public class AreaCirc {
double raio;
final static double PI = 3.14;

AreaCirc(double raioInicial) {
	
	raio = raioInicial;
}
	double area() {
		return raio * raio * PI;
	}
	
}
