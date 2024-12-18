package exercicios;

import java.util.Scanner;

// 9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa,
// leia o seu peso e sua altura e imprima na tela sua condição de acordo com a tabela abaixo.

public class TabelaIMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

       
        System.out.print("Insira sua altura (em metros): ");
        double altura = entrada.nextDouble();

        System.out.print("Insira seu peso (em kg): ");
        double peso = entrada.nextDouble();

        
        double imc = peso / (altura * altura);

       
        System.out.printf("Seu IMC é: %.2f%n", imc);

   
        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Você está no peso ideal. Parabéns!");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Você está levemente acima do peso.");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Você está com Obesidade Grau I. Cuidado!");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Você está com Obesidade Grau II (Severa). Cuidado!");
        } else if (imc >= 40) {
            System.out.println("Você está com Obesidade Grau III (Mórbida). Cuidado!");
        }

        entrada.close();
    }
}
