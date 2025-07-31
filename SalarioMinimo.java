package exercicios;

import java.util.Scanner;

/* Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, 
   calcule quantos salários mínimos esse usuário ganha e imprima na tela o resultado. 
   (Base para o Salário mínimo R$ 1.293,20). */
public class SalarioMinimo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salarioMinimo = 1293.20;

        System.out.print("Digite o valor do seu salário: ");
        double salarioUsuario = entrada.nextDouble();

        
        double quantidadeSalarios = salarioUsuario / salarioMinimo;

      
        if (salarioUsuario > salarioMinimo) {
            System.out.printf("Você recebe mais que um salário mínimo. Equivalente a %.2f salários mínimos.%n", quantidadeSalarios);
        } else if (salarioUsuario == salarioMinimo) {
            System.out.println("Você recebe exatamente um salário mínimo.");
        } else {
            System.out.printf("Você recebe menos de um salário mínimo. Equivalente a %.2f salários mínimos.%n", quantidadeSalarios);
        }

        entrada.close();
    }
}
