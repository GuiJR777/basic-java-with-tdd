/*
    - Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
    mostre-a expressa em dias.
    - Leve em consideração o ano com 365 dias e o mês com 30.
    - Exemplo: 3 anos, 2 meses e 15 dias = 1170 dias.
 */

package main.java;
public class CalculateAge {
    public int getAgeInDays(int years, int months, int days){
        int ageInDays = days;

        ageInDays += this.convertYearsToDays(years);
        ageInDays += this.convertMonthsToDays(months);

        return ageInDays;
    }

    private int convertYearsToDays(int years){
        int oneYearInDays = 365;

        return years * oneYearInDays;
    }

    private int convertMonthsToDays(int months){
        int oneMonthInDays = 30;

        return months * oneMonthInDays;
    }
}
