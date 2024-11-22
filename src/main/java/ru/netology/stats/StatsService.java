package ru.netology.stats;

public class StatsService {

    public long totalSales(long[] sales) {
        long totalSales = 0;
        for (long sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }

    public long averageSales(long[] sales) {
        return totalSales(sales) / sales.length;
    }

    public int maxMonth(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minMonth(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int monthsBelowAverage(long[] sales) {
        int sumMonths = 0;
        long averageSale = averageSales(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                sumMonths++;
            }
        }
        return sumMonths;
    }

    public int monthsAboveAverage(long[] sales) {
        int sumMonths = 0;
        long averageSale = averageSales(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                sumMonths++;
            }
        }
        return sumMonths;
    }
}

