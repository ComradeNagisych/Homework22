package tv.ksstream.calculator.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tv.ksstream.calculator.exception.ZeroDividerException;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceImplParametrisedTest {
    private CalculatorService service = new CalculatorServiceImpl();
    @ParameterizedTest
    @MethodSource("dataSourceForSumTest")
    public void returnValidResultWhenAddingTwoNumbers(int num1, int num2, int expected) {
        //Arrange
        //Given

        //Act
        //When
        int result = service.plus(num1, num2);

        //Assert
        //Then
        assertEquals(expected, result);
    }
    private static Stream<Arguments> dataSourceForSumTest() {
        return Stream.of(Arguments.of(2,2,4), Arguments.of(1,2,3), Arguments.of(2,4,6));
    }
    @ParameterizedTest
    @MethodSource("dataSourceForSubtractTest")
    public void returnValidResultWhenSubtractingTwoNumbers(int num1, int num2, int expected) {
        //Arrange
        //Given

        //Act
        //When
        int result = service.minus(num1, num2);

        //Assert
        //Then
        assertEquals(expected, result);
    }
    private static Stream<Arguments> dataSourceForSubtractTest() {
        return Stream.of(Arguments.of(2,2,0), Arguments.of(2,1,1), Arguments.of(6,4,2));
    }
    @ParameterizedTest
    @MethodSource("dataSourceForMultiplicationTest")
    public void returnValidResultWhenMultiplyingTwoNumbers(int num1, int num2, int expected) {
        //Arrange
        //Given

        //Act
        //When
        int result = service.multiply(num1, num2);

        //Assert
        //Then
        assertEquals(expected, result);
    }
    private static Stream<Arguments> dataSourceForMultiplicationTest() {
        return Stream.of(Arguments.of(2,2,4), Arguments.of(2,1,2), Arguments.of(6,4,24));
    }
    @ParameterizedTest
    @MethodSource("dataSourceForDivisionTest")
    public void returnValidResultWhenDividingTwoNumbers(int num1, int num2, int expected) {
        //Arrange
        //Given

        //Act
        //When
        int result = service.divide(num1, num2);

        //Assert
        //Then
        assertEquals(expected, result);
    }
    private static Stream<Arguments> dataSourceForDivisionTest() {
        return Stream.of(Arguments.of(2,2,1), Arguments.of(2,1,2), Arguments.of(9,3,3));
    }
}