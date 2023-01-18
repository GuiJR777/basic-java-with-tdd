/*
    - Fazer um programa que imprima a média aritmética dos números 8,9 e 7.
    - A média dos números 4, 5 e 6.
    - A soma das duas médias.
    - A média das médias.
*/

package main.java;

import java.util.Scanner;

public class AverageCalculator {
    Scanner dataInput = new Scanner(System.in);
    int[] averages;

    public void main(String[] args) {
        int averagesToCalculate = getAveragesToCalculate();
        averages = new int[averagesToCalculate];

        getTheAverages(averagesToCalculate);

        int averagesSum, averagesAverage;

        averagesSum = getAveragesSum();
        averagesAverage = getAverage(averages);

        logResults(averagesSum, averagesAverage);

    }

    private int getAveragesToCalculate() {
        int averagesToCalculate;

        System.out.println("How many averages do you want to calculate?");
        averagesToCalculate = dataInput.nextInt();

        return averagesToCalculate;
    }

    private void getTheAverages(int averagesToCalculate) {
        for (int i = 0; i < averagesToCalculate; i++) {
            int[] values = getValues();
            int average = getAverage(values);

            System.out.println("The average of the values " + arrayToString(values) + " is: " + average + "\n");

            averages[i] = getAverage(values);
        }
    }

    private int[] getValues() {
        int[] values;
        int valuesToCalculate;

        System.out.println("How many values do you want to calculate?");
        valuesToCalculate = dataInput.nextInt();

        values = new int[valuesToCalculate];

        for (int i = 0; i < valuesToCalculate; i++) {
            System.out.println("Enter the value " + (i + 1) + ":");
            values[i] = dataInput.nextInt();
        }

        return values;
    }

    private String arrayToString(int[] array) {
        String arrayString = "";

        for (int i = 0; i < array.length; i++) {
            arrayString += array[i];

            if (i < array.length - 1) {
                arrayString += ", ";
            }
        }

        return arrayString;
    }

    private int getAveragesSum() {
        int averagesSum = 0;

        for (int average : averages) {
            averagesSum += average;
        }

        return averagesSum;
    }

    public int getAverage(int[] values) {
        int average;
        int sum = 0;

        if (values.length == 0) {
            return 0;
        }

        for (int value : values) {
            sum += value;
        }

        average = sum / values.length;

        return average;

    }

    private void logResults(int averagesSum, int averagesAverage) {
        System.out.println("The sum of the averages is: " + averagesSum);
        System.out.println("The average of the averages is: " + averagesAverage);
    }
}
