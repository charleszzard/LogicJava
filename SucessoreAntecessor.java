package exercicios;

import java.util.Scanner;

// Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

public class SucessoreAntecessor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();

        int sucessor = numero + 1;
        int antecessor = numero - 1;

        System.out.printf("O número escolhido foi: %d%n", numero);
        System.out.printf("Antecessor: %d%n", antecessor);
        System.out.printf("Sucessor: %d%n", sucessor);

        entrada.close();
    }
}
