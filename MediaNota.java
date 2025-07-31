package exercicios;

import java.util.Scanner;

//10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.

public class MediaNota {
    public static void main(String[] args) {
        
Scanner entrada = new Scanner(System.in);

System.out.println("Nota de Matematica: ");
double notaMat = entrada.nextDouble();
System.out.println("Nota de Matematica: ");
double notaPort = entrada.nextDouble();
System.out.println("Nota de Matematica: ");
double notaGeo = entrada.nextDouble();

double media = (notaMat + notaGeo + notaPort)/3;

System.out.println("Sua media e: " + media);

entrada.close();
    }
    
}
