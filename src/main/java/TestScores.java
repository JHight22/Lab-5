/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jared
 */
public class TestScores {

    private double[] scores;
    double total = 0;
 
    public TestScores(double array[])
    {
        for (int i = 0; i < array.length; i++)
        {
            scores = new double[array.length];
            if (array[i] < 0 || array[i] > 100)
            {
                throw new IllegalArgumentException("I'm sorry but all scores must be greater than a negative number and smaller than 100.");
            }
            else
            {
                scores[i] = array[i];
                total += array[i];
            }
        }
    }
 
    public double getAverageTestScores()
    {
        return total / scores.length;
    }
}
