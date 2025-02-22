package classe;

public class DataTeste {
public static void main(String[] args) {
	
	
	Data d1 = new Data();
	
	d1.dia = 20;	
	d1.mes = 11;
	d1.ano = 2021;
	
	Data d2 = new Data();
	
	d2.dia = 10;
	d2.mes = 12;
	d2.ano = 2022;
	
	System.out.println(d1.obterDataFormatada());
	System.out.printf(d2.obterDataFormatada());
	
	}
}
