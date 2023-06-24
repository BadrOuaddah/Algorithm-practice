package com.badr.algorithm;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class JavaSubstringComparisonsTest {

    JavaSubstringComparisons javaSubstringComparisons = new JavaSubstringComparisons();
    @Test
    public void getSmallestAndLargest() {
        Assert.assertEquals("ava wel",javaSubstringComparisons.getSmallestAndLargest("welcometojava",3));
    }

    @Test
    public void getSmallestAndLargestWhenStringIsEmpty(){
        Assert.assertEquals(" ",javaSubstringComparisons.getSmallestAndLargest("",3));
    }

    @Test
    public void getSmallestAndLargestWhenStringKIsZero(){
        Assert.assertEquals(" ",javaSubstringComparisons.getSmallestAndLargest("TestString",0));
    }

    @Test
    public void getSmallestAndLargestWhenStringKIsNegative(){
        Assert.assertEquals(" ",javaSubstringComparisons.getSmallestAndLargest("TestString",-1));
    }
    @Test
    public void getSmallestAndLargestWhenStringKIsBiggerThanLengthOfString(){
        Assert.assertEquals(" ",javaSubstringComparisons.getSmallestAndLargest("TestString",100));
    }

}

