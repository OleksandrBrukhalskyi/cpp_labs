package org.example;

import org.junit.Assert;

/**
 * Unit test for simple App.
 */
public class Lab1Test {

    @org.junit.Test
    public void testAmountOfNegativeElements() {
        int[] arr = {-23,-5,-4, 21, 33, 45};
        int expected = 3;
        int actual = Lab1.amountOfNegativeElements(arr);

        Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void productAfterMinElement() {
        int[] arr = {0,1,2,3,4};
        int expected = 10;
        int actual = Lab1.productAfterMinElement(arr);

        Assert.assertEquals(actual, expected);
    }
}
