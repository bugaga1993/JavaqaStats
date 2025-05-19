package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;




public class StatsServiceTest {

    @Test
    public void test() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        long expected = 9;
        long actual = service.moreThanAvg(sales);
        Assertions.assertEquals(expected, actual);
    }
}
