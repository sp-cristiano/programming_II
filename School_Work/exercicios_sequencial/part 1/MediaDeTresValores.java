package exercicios_sequencial;

import java.util.Scanner;

public class MediaDeTresValores {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the first value: ");
    double valor1 = input.nextDouble();

    System.out.println("Enter the second value: ");
    double valor2 = input.nextDouble();

    System.out.println("Enter the third value: ");
    double valor3 = input.nextDouble();

    double media = (valor1 + valor2 + valor3) / 3;

    System.out.println("The average of " + valor1 + " + " + valor2 + " + " + valor3 + " is " + media);

    input.close();
  }
}
