
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jared
 */
public class Question11Demo {

    private static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

        double[] testScores = {88.98, 82.38, 93.45, 90.11, 76.89, 95.56, 85.56, 93.23, 91.67, 82.34};

        double totalValue = getTotal(testScores);

        double averageValue = getAverage(testScores);

        double highestValue = getHighest(testScores);

        double lowestValue = getLowest(testScores);

        System.out.println("Total Value = " + df.format(totalValue));
        System.out.println("Average Value = " + df.format(averageValue) + "%");
        System.out.println("Highest Value = " + df.format(highestValue) + "%");
        System.out.println("Lowest Value = " + df.format(lowestValue) + "%");

    }

    public static double getTotal(double[] values) {
        double totalValue = 0;
        for (int i = 0; i < values.length; i++) {
            totalValue += values[i];
        }
        return totalValue;
    }

    public static double getAverage(double[] values) {
        double total = 0;
        double averageValue = 0;
        for (int i = 0; i < values.length; i++) {
            total += values[i];
            averageValue = total / values.length;
        }
        return averageValue;
    }

    public static double getHighest(double[] values) {
        double highestValue = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > highestValue) {
                highestValue = values[i];
            }

        }
        return highestValue;
    }

    public static double getLowest(double[] values) {
        double lowestValue = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] < lowestValue) {
                lowestValue = values[i];
            }

        }
        return lowestValue;
    }
}
