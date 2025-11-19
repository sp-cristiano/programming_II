package exercicios_sequencial;

import java.util.Scanner;

public class SalarioFinal{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter your basic salary: ");
    double basicSalary = input.nextDouble();

    System.out.print("Enter your gratification: ");
    double gratification = input.nextDouble();

    double finalSalary = basicSalary + gratification;

    System.out.println("Final Salary: " + finalSalary);

    input.close();
  }
}