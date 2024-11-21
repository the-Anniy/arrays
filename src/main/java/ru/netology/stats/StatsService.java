package ru.netology.stats;

public class StatsService {

    public long TotalSales(long[] sales) {
        long totalSales = 0;
        for (long sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }

    public long AverageSales(long[] sales) {
        return TotalSales(sales) / sales.length;
    }

    public int MaxMonth(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxMonth) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int MinMonth(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int MonthsBelowAverage(long[] sales) {
        int sumMonths = 0;
        long averageSale = AverageSales(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                sumMonths++;
            }
        }
        return sumMonths;
    }

    public int MonthsAboveAverage(long[] sales) {
        int sumMonths = 0;
        long averageSale = AverageSales(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                sumMonths++;
            }
        }
        return sumMonths;
    }
}

