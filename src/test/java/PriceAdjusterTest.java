package test.java;
import org.junit.jupiter.api.Test;

import main.java.PriceAdjuster;

import static org.junit.jupiter.api.Assertions.*;


public class PriceAdjusterTest {
    PriceAdjuster priceAdjuster = new PriceAdjuster();

    // Testes para o método increasePricePercent
    @Test
    public void whenPriceIsZeroThenReturnZero() {
        // Arrange
        double price = 0;
        int percent = 1;
        double expectedPrice = 0;

        // Act
        double actualPrice = priceAdjuster.increasePricePercent(price, percent);

        // Assert
        assertEquals(expectedPrice, actualPrice);
    }

    @Test
    public void whenPriceIsPositiveAndPercentIsZeroThenReturnPrice() {
        // Arrange
        double price = 10;
        int percent = 0;
        double expectedPrice = 10;

        // Act
        double actualPrice = priceAdjuster.increasePricePercent(price, percent);

        // Assert
        assertEquals(expectedPrice, actualPrice);
    }

    @Test
    public void whenPriceIsPositiveAndPercentIsPositiveThenReturnPriceWithPercent() {
        // Arrange
        double price = 10;
        int percent = 1;
        double expectedPrice = 10.1;

        // Act
        double actualPrice = priceAdjuster.increasePricePercent(price, percent);

        // Assert
        assertEquals(expectedPrice, actualPrice);
    }
}
