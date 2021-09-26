package ru.netology.sqr;

public class SQRService {
    public int countSquares(int bottomLine, int upperBound) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr <= upperBound && sqr >= bottomLine) {
                count++;
            }

        }
        return count;
    }

}
