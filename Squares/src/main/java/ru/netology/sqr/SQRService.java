package ru.netology.sqr;

public class SQRService {
    public int countSquares(int bottomLine, int upperBound) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i <= upperBound && i * i >= bottomLine) {
                count++;
            }

        }
        return count;
    }

}
