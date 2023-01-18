package test.java;
import org.junit.jupiter.api.Test;

import main.java.AverageCalculator;

import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {
    AverageCalculator calculator = new AverageCalculator();

    // Test cases for method getAverage
    @Test
    public void whenPassAInvalidArrayShouldReturnZero() {
        // arrange
        int[] array = {};
        int expected = 0;

        // act
        int result = calculator.getAverage(array);

        // assert
        assertEquals(expected, result);

    }

    // Test cases for method getAverage
    @Test
    public void whenPassAValidArrayShouldReturnAverage() {
        // arrange
        int[] array = {1, 2, 3, 4, 5};
        int expected = 3;

        // act
        int result = calculator.getAverage(array);

        // assert
        assertEquals(expected, result);

    }


}
