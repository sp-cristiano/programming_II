package exercicios_sequencial;

import java.util.Scanner;

public class FinalPriceOfProduct{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the product price: ");
    double productPrice = input.nextDouble();

    System.out.print("Enter the discount percentage: ");
    double discountPercentage = input.nextDouble();

    double discountAmount = (discountPercentage / 100) * productPrice;
    double finalPrice = productPrice - discountAmount;

    System.out.println("The final price of the product after a discount of " + discountPercentage + "% is: " + finalPrice);

    input.close();
  }
}