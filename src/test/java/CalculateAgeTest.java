package test.java;
import org.junit.jupiter.api.Test;

import main.java.CalculateAge;

import static org.junit.jupiter.api.Assertions.*;


public class CalculateAgeTest {
    CalculateAge calculator = new CalculateAge();

    // Test cases for method getAgeInDays
    @Test
    public void whenPassAInvalidDateShouldReturnZero() {
        // arrange
        int years, months, days, expected, result;
        years = 0;
        months = 0;
        days = 0;
        expected = 0;

        // act
        result = calculator.getAgeInDays(years, months, days);

        // assert
        assertEquals(expected, result);

    }

    // Test cases for method getAgeInDays
    @Test
    public void whenPassADateShouldReturnYearsInDays() {
        // arrange
        int years, months, days, expected, result;
        years = 3;
        months = 2;
        days = 15;
        expected = 1170;

        // act
        result = calculator.getAgeInDays(years, months, days);

        // assert
        assertEquals(expected, result);

    }
}
