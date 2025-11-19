package exercicios_sequencial.part2;

import java.util.Scanner;

public class WhichIsGreater{
  public static void maiin(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    double num1 = input.nextDouble();

    System.out.print("Enter the second number: ");
    double num2 = input.nextDouble();

    if (num1 > num2) {
      System.out.println("The first number " + num1 + " is greater than the second number " + num2 + ".");
    } else if (num2 > num1) {
      System.out.println("The second number " + num2 + " is greater than the first number " + num1 + ".");
    } else {
      System.out.println("Both numbers are equal.");
    }

    input.close();
  }
}