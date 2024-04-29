package tv.ksstream.calculator.service;

import org.junit.jupiter.api.Test;
import tv.ksstream.calculator.exception.ZeroDividerException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceImplTest {
    private CalculatorService service = new CalculatorServiceImpl();
    @Test
    public void returnValidResultWhenAddingTwoNumbers() {
        //Arrange
        //Given

        //Act
        //When
        int result = service.plus(2,2);

        //Assert
        //Then
        assertEquals(4, result);
    }
    @Test
    public void returnValidResultWhenSubtractingTwoNumbers() {
        //Arrange
        //Given

        //Act
        //When
        int result = service.minus(2,2);

        //Assert
        //Then
        assertEquals(0, result);
    }
    @Test
    public void returnValidResultWhenMultiplyingTwoNumbers() {
        //Arrange
        //Given

        //Act
        //When
        int result = service.multiply(2,2);

        //Assert
        //Then
        assertEquals(4, result);
    }
    @Test
    public void returnValidResultWhenDividingTwoNumbers() {
        //Arrange
        //Given

        //Act
        //When
        int result = service.divide(2,2);

        //Assert
        //Then
        assertEquals(1, result);
    }
    @Test
    public void throwExceptionWhenDividingByZero() {
        //Act
        //When
        assertThrows(ZeroDividerException.class, () -> service.divide(1,0));
    }
}
