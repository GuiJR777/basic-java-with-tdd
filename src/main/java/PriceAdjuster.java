/*
    Informar um saldo e imprimir o saldo com reajuste de 1%.
*/

package main.java;
import java.util.Scanner;

public class PriceAdjuster {
    Scanner dataInput = new Scanner(System.in);
    public void main(String[] args) {
        double priceToAdjust, adjustedPrice;
        int percentToAdjust;

        System.out.println("Enter the price to adjust:");
        priceToAdjust = dataInput.nextDouble();

        System.out.println("Enter the percent to adjust:");
        percentToAdjust = dataInput.nextInt();

        adjustedPrice = increasePricePercent(priceToAdjust, percentToAdjust);

        System.out.println("The adjusted price is: " + adjustedPrice);

    }

    public double increasePricePercent(double price, int percent) {
        return price * (1 + percent / 100.0);
    }
}
