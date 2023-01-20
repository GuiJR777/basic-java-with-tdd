package test.java;

import org.junit.jupiter.api.Test;

import main.java.CPF;

import static org.junit.jupiter.api.Assertions.*;

public class CPFTest {
    // Test cases for method getNormalizedCpf()
    @Test
    public void whenCPFIsCreatedThenReturnNormalizedCpf() {
        // Arrange
        String cpf, expected, result;

        cpf = "111.444.777-35";
        expected = "11144477735";

        // Act
        result = new CPF(cpf).getNormalizedCpf();

        // Assert
        assertEquals(expected, result);
    }

    // Test cases for method isValid()
    @Test
    public void whenCPFIsInvalidThenReturnFalse() {
        // Arrange
        String cpf;
        boolean result;

        cpf = "111.444.777-00";

        // Act
        result = new CPF(cpf).isValid();

        // Assert
        assertFalse(result);

    }

    @Test
    public void whenCPFIsValidThenReturnTrue() {
        // Arrange
        String cpf;
        boolean result;

        cpf = "111.444.777-35";

        // Act
        result = new CPF(cpf).isValid();

        // Assert
        assertTrue(result);
    }
}
