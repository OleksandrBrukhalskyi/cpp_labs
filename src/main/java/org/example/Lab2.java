package org.example;

public class Lab2 {

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,13,15,17};
        System.out.println("The biggest odd element is " + Lab2.theBiggestOddElement(arr));
    }

    public static int theBiggestOddElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max && arr[i] % 2 == 1) {
                max = arr[i];
            }
        }
        return max;
    }
}
