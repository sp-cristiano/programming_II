package exercicios_sequencial.part2;

import java.util.Scanner;

public class PassOrFailed {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the student's score: ");
    double score = input.nextDouble();

    if (score >= 10) {
      System.out.println("The student has passed with a score of " + score + ".");
    } else {
      System.out.println("The student has failed with a score of " + score + ".");
    }

    input.close();
  }
}