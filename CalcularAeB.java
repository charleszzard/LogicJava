package exercicios;

import java.util.Scanner;

/*
 * Faça um algoritmo que leia dois valores inteiros A e B. 
 * Se os valores de A e B forem iguais, deverá somar os dois valores. 
 * Caso contrário, deverá multiplicar A por B. 
 * Ao final de qualquer um dos cálculos, deve-se atribuir o resultado a uma variável C e imprimir seu valor na tela.
 */
public class CalcularAeB {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o valor A: ");
        int a = entrada.nextInt();

        System.out.println("Insira o valor B: ");
        int b = entrada.nextInt();

        int c; 

        if (a == b) {
            c = a + b; 
        } else {
            c = a * b; 
        }
        
        System.out.println("O valor de C é: " + c);

        entrada.close();
    }
}