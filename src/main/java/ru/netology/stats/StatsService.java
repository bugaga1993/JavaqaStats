package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {
        long sun = 0;
        for (int i = 0; i < sales.length; i++) {
            sun += sales[i];
        }

        return sun;
    }

    public long avgSales(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1;// месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int moreThanAvg(long[] sales) {
        int counter = 0;
        long avg = avgSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avg) {
                counter++;
            }
        }
        return counter;
    }

    public int lessThanAvg(long[] sales) {
        int counter = 0;
        long avg = avgSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avg) {
                counter++;
            }
        }
        return counter;
    }
}

