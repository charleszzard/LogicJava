package exercicios;

import java.util.Scanner;

public class CalculadoraSalario{
public static void main(String[] args) {
    
Scanner entrada = new Scanner (System.in);

double hr = 180;

System.out.println("Informe o valor do seu salario: ");
double salario = entrada.nextDouble();

double salarioHora = salario/hr;

System.out.println("O seu salario por hora : " + salarioHora + " reais");

    entrada.close();
    }
}