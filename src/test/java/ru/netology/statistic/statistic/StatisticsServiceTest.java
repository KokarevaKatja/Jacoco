package ru.netology.statistic.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxIfIncomeInThousands() {
        StatisticsService service = new StatisticsService();
        long[] incomesInThousands = {100, 90, 84, 66, 17, 99, 149, 85, 64, 10, 150};

        long expected = 150;
        long actual = service.findMax(incomesInThousands);

        Assertions.assertEquals(expected, actual);
    }
}
