package org.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Lab2Test {

    @Test
    public void theBiggestOddElement() {
        int[] arr = {1,3,5,7,9,11,13,15,17};
        int expected = 17;
        int actual = Lab2.theBiggestOddElement(arr);

        Assert.assertEquals(actual, expected);
    }
}