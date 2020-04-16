/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jared
 */
public class Question5Demo {

    public static void main(String[] args) {

        int[] integerArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int number = 6;

        int[] numbersGreaterThanNReturned = numbersGreaterThanN(integerArray, number);

        for (int i = 0; i < numbersGreaterThanNReturned.length; i++) {
            if (numbersGreaterThanNReturned[i] != 0) {
                System.out.println(numbersGreaterThanNReturned[i]);
            }
        }

    }

    public static int[] numbersGreaterThanN(int[] integerArray, int number) {
        int[] numbersToBeReturned = new int[integerArray.length];
        int numbersToBeReturned2 = 0;
        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] > number) {
                numbersToBeReturned[numbersToBeReturned2] = integerArray[i];
                numbersToBeReturned2 += 1;
            }
        }
        return numbersToBeReturned;
    }

}
