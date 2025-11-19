
/**
 * Cria um programa que permita lei a idade de uma persoa e informe dois prompt.
 * criança de 0 á 12 ano.
 * Adolecente de 13 á 17.
 * Adulto de 18 a 59 ano.
 * Idoso de 60 a mais.
 */

 import java.util.Scanner;

public class Idade {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int age = 0;    // Initialize the age to zerro

    System.out.print("Digita tua idade: ");

    // Validate input to make sure it is an integer.

    while (!input.hasNextInt()) {
      System.out.println("Entrada Invalida. Por favor digita um numero.");

      input.next(); // This will discard the invalid input

      System.out.print("Digita tua idade: ");
    }
    age = input.nextInt();


    if (age >= 0 && age <= 12) {

      System.out.println("Voce tem " + age + " ano. Ainda  és criança.");
    } else if (age >= 13 && age <= 17) {
      System.out.println("Voce tem " + age + " ano. Ainda és um adolecente.");
    } else if (age >= 18 && age <= 59) {

      System.out.println("Voce tem " + age + " ano. Ainda és um adulto.");
    } else {
      System.out.println("Voce tem " + age + " ano. És um idoso.");
    }

    input.close();
  }
}