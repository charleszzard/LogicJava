package exercicios;

import java.util.Scanner;

// Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.

public class OrdemDecrescente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

    
        System.out.print("Digite o primeiro número: ");
        double num1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = entrada.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double num3 = entrada.nextDouble();

       
        if (num1 >= num2 && num1 >= num3) {
            if (num2 >= num3) {
                System.out.printf("Ordem decrescente: %.2f, %.2f, %.2f%n", num1, num2, num3);
            } else {
                System.out.printf("Ordem decrescente: %.2f, %.2f, %.2f%n", num1, num3, num2);
            }
        } else if (num2 >= num1 && num2 >= num3) {
            if (num1 >= num3) {
                System.out.printf("Ordem decrescente: %.2f, %.2f, %.2f%n", num2, num1, num3);
            } else {
                System.out.printf("Ordem decrescente: %.2f, %.2f, %.2f%n", num2, num3, num1);
            }
        } else {
            if (num1 >= num2) {
                System.out.printf("Ordem decrescente: %.2f, %.2f, %.2f%n", num3, num1, num2);
            } else {
                System.out.printf("Ordem decrescente: %.2f, %.2f, %.2f%n", num3, num2, num1);
            }
        }

        entrada.close();
    }
}
