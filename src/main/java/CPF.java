package main.java;
import java.util.regex.Pattern;

public class CPF {
    private String cpf;

    public CPF(String cpf) {
        String cpf_cleaned;

        String no_digits_regex = "\\D";
        Pattern no_digits_pattern = Pattern.compile(no_digits_regex);
        cpf_cleaned = no_digits_pattern.matcher(cpf).replaceAll("");

        this.cpf = cpf_cleaned;
    }

    public String getNormalizedCpf() {
        return this.cpf;
    }

    public boolean isValid() {
        String firstNineDigitsOfCpf = this.cpf.substring(0, 9);
        String lastTwoDigitsOfCpf = this.cpf.substring(9, 11);

        String firstValidatorDigit = this.getValidatorDigit(firstNineDigitsOfCpf);
        String secondValidatorDigit = this.getValidatorDigit(firstNineDigitsOfCpf + firstValidatorDigit);

        return lastTwoDigitsOfCpf.equals(firstValidatorDigit + secondValidatorDigit);
    }

    private String getValidatorDigit(String digitsToValidate){
        final int TOTAL_DIGITS_OF_CPF = 11;

        int[] digitsToValidateAsInteger = new int[digitsToValidate.length()];  // Create array to store digits as integers

        for (int index = 0; index < digitsToValidateAsInteger.length; index++) {  // Convert every digit to integer
            digitsToValidateAsInteger[index] = Integer.parseInt(digitsToValidate.substring(index, index + 1));
        }

        int sumOfMultiplications = 0;  // Create variable to store sum of multiplications

        for (int index = 0; index < digitsToValidateAsInteger.length; index++){  // Perform multiplications and sum them
            sumOfMultiplications += digitsToValidateAsInteger[index] * ((digitsToValidateAsInteger.length + 1) - index);
        }

        int restOfDivision = sumOfMultiplications % TOTAL_DIGITS_OF_CPF;  // Get rest of division

        if (restOfDivision < 2){  // If rest of division is less than 2, return 0
            return "0";
        }

        return String.valueOf(TOTAL_DIGITS_OF_CPF - restOfDivision);  // Else, return the difference between 11 and rest of division
    }
}
