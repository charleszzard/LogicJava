package exercicios;

import java.util.Scanner;

/*Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e 

 se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.*/

public class AprovadoReprovado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

       
        System.out.print("Insira seu nome: ");
        String nome = entrada.nextLine(); 

        
        System.out.print("Nota de Matemática: ");
        double notaMat = entrada.nextDouble();

        System.out.print("Nota de Português: ");
        double notaPort = entrada.nextDouble();

        System.out.print("Nota de Geografia: ");
        double notaGeo = entrada.nextDouble();

        
        double media = (notaMat + notaPort + notaGeo) / 3;

        
        System.out.printf("Olá %s, sua média é: %.2f%n", nome, media);

        
        if (media >= 7) {
            System.out.printf("Parabéns %s, você foi aprovado(a)!%n", nome);
        } else {
            System.out.printf("Que pena %s, você foi reprovado(a).%n", nome);
        }

        entrada.close();
    }
}
