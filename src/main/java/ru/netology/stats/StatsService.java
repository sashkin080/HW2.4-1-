package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSum(int[] sales) {
        int avgSum = calculateSum(sales);
        int average = 0;
        int month = 0;
        for (int sale : sales) {
            month++;
        }
        average = avgSum / month;

        return average;
    }

    public int maxSales(int[] sales) {
        int maxMonth = sales[0];
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth;
    }

    public int minSales(int[] sales) {
        int minMonth = sales[0];
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth;
    }

    public int smallSales(int[] sales) {
        int averge = averageSum(sales);
        int amountMonth = 0;
        for (int sale : sales) {
            if (sale < averge) {
                amountMonth++;

            }
        }
        return amountMonth;
    }


    public int bigSales(int[] sales) {
        int averge = averageSum(sales);
        int amountMonth = 0;
        for (int sale : sales) {
            if (sale > averge) {
                amountMonth++;

            }
        }
        return amountMonth;
    }


}
