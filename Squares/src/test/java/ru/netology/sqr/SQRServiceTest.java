package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'count squares from bottom line to upper bound', 200, 300, 3",
            "'count squares when bottom line equals upper bound', 225, 225, 1",
            "'count Squares When bottom line and upper bound less ten', 1, 9, 0",
            "'count Squares when bottom line more upper bound', 300, 200, 0"})
    void countSquares(String testName, int bottomLine, int upperBound, int expected) {
        SQRService service = new SQRService();

        int result = service.countSquares(bottomLine, upperBound);

        assertEquals(expected, result);
    }
}