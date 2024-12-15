package exercicios;

import java.util.Scanner;

// Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

public class Reajuste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um valor: ");
        double valor = entrada.nextDouble();

       
        double reajuste = valor * 1.05;

       
        System.out.printf("O valor original era: R$ %.2f%n", valor);
        System.out.printf("O valor reajustado com 5%% de aumento é: R$ %.2f%n", reajuste);

        entrada.close();
    }
}
