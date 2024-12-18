package exercicios;

import java.util.Scanner;

//  Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.

public class CondicoesPagamento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        
        System.out.print("Digite o valor do produto: R$ ");
        double valorProduto = entrada.nextDouble();

        
        System.out.println("\nEscolha a forma de pagamento:");
        System.out.println("1 - À Vista em Dinheiro ou Pix (15% de desconto)");
        System.out.println("2 - À Vista no Cartão de Crédito (10% de desconto)");
        System.out.println("3 - Parcelado no cartão em 2 vezes (sem juros)");
        System.out.println("4 - Parcelado no cartão em 3 vezes ou mais (10% de juros)");

       
        System.out.print("\nDigite o código da forma de pagamento: ");
        int opcao = entrada.nextInt();

        double valorFinal = 0;

        
        switch (opcao) {
            case 1: 
                valorFinal = valorProduto - (valorProduto * 0.15);
                System.out.printf("Você escolheu pagar à vista em dinheiro ou Pix.%n");
                break;

            case 2: 
                valorFinal = valorProduto - (valorProduto * 0.10);
                System.out.printf("Você escolheu pagar à vista no cartão de crédito.%n");
                break;

            case 3: 
                valorFinal = valorProduto;
                System.out.printf("Você escolheu parcelar em 2 vezes sem juros.%n");
                break;

            case 4: 
                valorFinal = valorProduto + (valorProduto * 0.10);
                System.out.printf("Você escolheu parcelar em 3 vezes ou mais (com juros de 10%%).%n");
                break;

            default: 
                System.out.println("Opção inválida. Por favor, escolha um código válido.");
                entrada.close();
                return; 
        }

        
        System.out.printf("O valor final do produto a ser pago é: R$ %.2f%n", valorFinal);

        entrada.close();
    }
}
