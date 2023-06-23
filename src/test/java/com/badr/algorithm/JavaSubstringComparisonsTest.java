package com.badr.algorithm;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class JavaSubstringComparisonsTest {

    JavaSubstringComparisons javaSubstringComparisons = new JavaSubstringComparisons();
    @Test
    public void getG() {
        Assert.assertEquals("ava wel",javaSubstringComparisons.getSmallestAndLargest("welcometojava",3));
    }
}

