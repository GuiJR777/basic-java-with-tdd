/*
    Escrever um algoritmo que lê:
    - a porcentagem do IPI a ser acrescido no valor das peças
    - o código da peça 1, valor unitário da peça 1, quantidade de peças 1
    - o código da peça 2, valor unitário da peça 2, quantidade de peças 2

    O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
    Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
 */

package main.java;

import java.util.Scanner;

public class PartsSeller {
    public Part[] parts;
    public double ipiForThisSale;

    Scanner dataInput = new Scanner(System.in);

    public void main(String[] args) {
        System.out.println("Welcome to the parts seller!");
        startSale();

        double totalPrice = getTotalPrice();

        System.out.println("The total of this sale is: " + totalPrice);

    }

    private void startSale() {
        System.out.println("How the value of IPI for this sale?");
        ipiForThisSale = dataInput.nextDouble();

        System.out.println("How many parts do you want to sell?");
        int amountOfPartsToSale = dataInput.nextInt();

        parts = new Part[amountOfPartsToSale];

        for (int index = 0; index < amountOfPartsToSale; index++) {
            System.out.println("Enter the code of the part " + (index + 1) + ":");
            int code = dataInput.nextInt();

            System.out.println("Enter the unit price of the part " + (index + 1) + ":");
            double unitPrice = dataInput.nextDouble();

            System.out.println("Enter the quantity of the part " + (index + 1) + ":");
            int quantity = dataInput.nextInt();

            parts[index] = new Part(code, unitPrice, quantity);

        }
    }

    public double getTotalPrice() {
        double totalPrice = 0;

        for (Part part : parts) {
            totalPrice += part.unitPrice * part.quantity;
        }

        totalPrice *= (ipiForThisSale / 100 + 1);

        return totalPrice;
    }
}
