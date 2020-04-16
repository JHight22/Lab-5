
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
public class TestScoresDemo {

    private static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

        double[] goodTestScores = {88.98, 82.38, 93.45, 90.11, 76.89, 95.56, 85.56, 93.23, 91.67, 82.34};
        double[] badTestScores = {88.98, 82.38, 93.45, 90.11, 76.89, 95.56, 85.56, 193.23, 91.67, 82.34};

        TestScores testScore = null;

        try {
            testScore = new TestScores(goodTestScores);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            testScore = new TestScores(badTestScores);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("------------------------------");

        System.out.println("The average of the good scores is: " + df.format(testScore.getAverageTestScores()) + "%");
    }

}
