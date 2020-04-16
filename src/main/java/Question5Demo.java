/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;

/**
 *
 * @author jared
 */
public class Question5Demo {

    public static void main(String[] args) {

        
        Random randomNumbers = new Random();
        int n = 55;
        
        int randomArray = randomNumbers.nextInt();
        int[] array = new int[randomArray];

        System.out.println("Numbers greater than " + n + "in the array are: " + getArrayExample(array, n));

    }

    public static void getArrayExample(int array[], int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > n) {
                System.out.println(array[i]);
            }
        }
    }

}
