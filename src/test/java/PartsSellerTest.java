package test.java;
import org.junit.jupiter.api.Test;

import main.java.PartsSeller;
import main.java.Part;

import static org.junit.jupiter.api.Assertions.*;


public class PartsSellerTest {
    PartsSeller partsSeller = new PartsSeller();

    // Testes para o método getTotalPrice
    @Test
    public void testGetTotalPriceWithOnePart() {
        // arrange
        Part[] parts = new Part[1];
        parts[0] = new Part(1, 10, 1);

        partsSeller.parts = parts;
        partsSeller.ipiForThisSale = 10;
        double expectedTotalPrice = 11;

        // act
        double totalPrice = partsSeller.getTotalPrice();

        // assert
        assertEquals(expectedTotalPrice, totalPrice);
    }

    @Test
    public void testGetTotalPriceWithTwoParts() {
        // arrange
        Part[] parts = new Part[2];
        parts[0] = new Part(1, 10, 1);
        parts[1] = new Part(2, 20, 1);

        partsSeller.parts = parts;
        partsSeller.ipiForThisSale = 10;
        double expectedTotalPrice = 33;

        // act
        double totalPrice = partsSeller.getTotalPrice();

        // assert
        assertEquals(expectedTotalPrice, totalPrice);
    }

    @Test
    public void testGetTotalPriceWithZeroParts() {
        // arrange
        Part[] parts = new Part[0];

        partsSeller.parts = parts;
        partsSeller.ipiForThisSale = 10;
        double expectedTotalPrice = 0;

        // act
        double totalPrice = partsSeller.getTotalPrice();

        // assert
        assertEquals(expectedTotalPrice, totalPrice);
    }

    @Test
    public void testGetTotalPriceWithIpiZero() {
        // arrange
        Part[] parts = new Part[1];
        parts[0] = new Part(1, 10, 1);

        partsSeller.parts = parts;
        partsSeller.ipiForThisSale = 0;
        double expectedTotalPrice = 10;

        // act
        double totalPrice = partsSeller.getTotalPrice();

        // assert
        assertEquals(expectedTotalPrice, totalPrice);
    }

    @Test
    public void testGetTotalPriceWithMoreThanOneQuantity() {
        // arrange
        Part[] parts = new Part[1];
        parts[0] = new Part(1, 10, 2);

        partsSeller.parts = parts;
        partsSeller.ipiForThisSale = 10;
        double expectedTotalPrice = 22;

        // act
        double totalPrice = partsSeller.getTotalPrice();

        // assert
        assertEquals(expectedTotalPrice, totalPrice);
    }

}
