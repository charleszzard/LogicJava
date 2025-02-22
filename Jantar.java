package classe;

public class Jantar {
	public static void main(String[] args) {
		
		Comida c1 = new Comida("Arroz", 0.223);
		Comida c2 = new Comida("Feijao", 0.5);
		Comida c3 = new Comida("Batata", 0.6);
		Comida c4 = new Comida("Cenoura", 0.3);
		
		Pessoa p = new Pessoa ("Joao", 99.8);
		
		System.out.println(p.apresentar());
		p.comer(c1);
		
		System.out.println(p.apresentar());
		p.comer(c2);
		
		System.out.println(p.apresentar());
		p.comer(c3);
		
		System.out.println(p.apresentar());
		p.comer(c4);
		
		System.out.println(p.apresentar());
	}

}
