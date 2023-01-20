package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {
    SQRService sqrService = new SQRService();

    @Test
    void calculateSQR() {
        int expected = 3;
        int actual = sqrService.calculateSQR(200, 300);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberOfSquaresExceedingMinimumLimit() {

        int expected = 0;
        int minNumber = 10;
        int maxNumber = 99;

        int actual = sqrService.calculateSQR(minNumber, maxNumber);

        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateNumberOfSquaresMinimumLimit() {
        SQRService service = new SQRService();

        int expected = 1;
        int minNumber = 100;
        int maxNumber = 100;

        int actual = sqrService.calculateSQR(minNumber, maxNumber);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateNumberOfSquaresMaximumLimit() {
        SQRService service = new SQRService();

        int expected = 90;
        int minNumber = 100;
        int maxNumber = 9801;

        int actual = sqrService.calculateSQR(minNumber, maxNumber);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberOfSquaresExceedingMaximumLimit() {
        SQRService service = new SQRService();

        int expected = 90;
        int minNumber = 100;
        int maxNumber = 100_000;

        int actual = sqrService.calculateSQR(minNumber, maxNumber);

        assertEquals(expected, actual);
    }
}