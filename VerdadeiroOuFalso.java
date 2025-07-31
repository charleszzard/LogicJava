package exercicios;

import java.util.Scanner;

// Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.

public class VerdadeiroOuFalso {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro valor booleano (true ou false): ");
        boolean num1 = entrada.nextBoolean();

        System.out.print("Digite o segundo valor booleano (true ou false): ");
        boolean num2 = entrada.nextBoolean();

        
        if (num1 && num2) {
            System.out.println("Ambos os valores são VERDADEIRO.");
        } else if (!num1 && !num2) {
            System.out.println("Ambos os valores são FALSO.");
        } else {
            System.out.println("Um dos valores é VERDADEIRO e o outro é FALSO.");
        }

        entrada.close();
    }
}
