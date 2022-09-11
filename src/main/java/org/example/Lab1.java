package org.example;

/**
 * Hello world!
 *
 */

public class Lab1
{
    public static void main( String[] args )
    {

        int[] arr = {0,1,2,3,4};
        int[] arr2 = {-23,-5,-4, 21, 33, 45};
        System.out.println("Sum of numbers after min el: " + Lab1.productAfterMinElement(arr));
        System.out.println("Amount of negative elements in array: " + Lab1.amountOfNegativeElements(arr2));
    }

    public static int amountOfNegativeElements(int[] arr) {
        int counter = 0;
        for (int el : arr) {
            if (el < 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int productAfterMinElement(int[] arr) {
        int min = Integer.MAX_VALUE;
        int indexOfMinElement = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min) {
                indexOfMinElement = i;
            }
        }

        for (int j = indexOfMinElement + 1; j < arr.length; j++) {
            sum += arr[j];
        }
        return sum;

    }
}
