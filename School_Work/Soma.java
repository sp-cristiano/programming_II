import java.util.Scanner;

public class Soma{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double num1, num2, result;

    System.out.print("Digita o primeiro numero: ");
    num1 = input.nextDouble();

    System.out.print("Digita o segundo numero real: ");
    num2 = input.nextDouble();

    result = num1 + num2;

    System.out.println("A soma de " + num1 + " + " + num2 + " = " + result);

  }
}