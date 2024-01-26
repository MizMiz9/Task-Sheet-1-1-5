package Practice26;

public class Cumulativesum {

    public static void main(String[] args) {

        int sum = sumandCumulativeSum(9, 7, 8);
        System.out.println();
    }

    private static int sumandCumulativeSum(int... numbers) {

        int sum = 0;
        int cumulativesum = 0;

        for (int i = 0; i < numbers.length; i++) {
            cumulativesum += numbers[i];
            sum += cumulativesum;
            System.out.println("Cumulative sum for parameter" + (i + 1) + ": " + sum);
        }

        return sum;
    }
}
