package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	String obterDataFormatada(){
		
		return String.format("%d/%d/%d\n", dia, mes, ano);
		
		
	}
	
}
