import java.util.Arrays;

public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int stat() {
        if (sales.length <= 2) {
            return 0;
        }

        Arrays.sort(sales);
        int average = 0;

        for (int i = 1; i < sales.length - 1; i++) {
            average += sales[i];
        }
        return average / (sales.length - 2);
    }
}