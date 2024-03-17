
import java.util.Scanner;



public class FirstAndLastSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of prices: ");
        int numberOfPrices = in.nextInt();

        if (numberOfPrices <= 0) {
            System.out.println("Invalid number of prices.");
            return;
        }

        double[] prices = new double[numberOfPrices];

        System.out.println("Enter the prices:");
        for (int i = 0; i < numberOfPrices; i++) {
            prices[i] = in.nextDouble();
        }

        double sum = prices[0] + prices[numberOfPrices - 1];
        System.out.println( sum);
    }
}
