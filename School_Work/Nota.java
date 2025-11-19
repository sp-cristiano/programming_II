
// Criar um programa que permita ler trez notas de um estudante e calcular a media. No mesmo programa, Informe a condição do aluno
import java.util.Scanner;

public class Nota {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double nota1, nota2, nota3, soma, media;

    System.out.print("Digita Primeira Nota: ");
    nota1 = input.nextDouble();
    System.out.print("Digita a segunda Nota: ");
    nota2 = input.nextDouble();
    System.out.print("Digita a Tereceira Nota: ");
    nota3 = input.nextDouble();
    soma = nota1 + nota2 + nota3;
    media = soma / 3;
    if (media < 10) {
      System.out.printf("A tua media e: %.2f%n", media);
      System.out.printf("Estas Reprovado");
    } else {
      System.out.printf("A tua media e: %.2f%n", media);
      System.out.printf("Estas Aprovado");
    }
  }
}
