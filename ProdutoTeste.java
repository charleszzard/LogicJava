package classe;


public class ProdutoTeste {

public static void main(String[] args) {
	
	//construtor com parametro
	
	Produto p1 = new Produto("Notebook",4888);
	
	//sem parametro
	
	var p2 = new Produto();
	
	var p3 = p1;
	
	p2.nome = "Caneta";
	p2.preco = 12.56;
	
	Produto.desconto = 0.50;
	
	System.out.println("Prduto: "+ p1.nome + "\nPreco: " + p1.precoComDesconto());
	System.out.println("\nPrduto: "+ p2.nome + "\nPreco: " + p2.precoComDesconto());
	System.out.println(p3);

	}
}
