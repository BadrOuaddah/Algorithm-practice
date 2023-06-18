package com.badr.algorithm;

import org.junit.Assert;
import org.junit.Test;

public class JavaAnagramsTest {
    JavaAnagrams javaAnagrams = new JavaAnagrams();

    @Test
    public void testTwoStringAreAnagrams() {
        Assert.assertEquals(true,javaAnagrams.isAnagram("Madam","Madam"));
    }

    @Test
    public void testTwoStringsAreNotAnagrams() {
        Assert.assertEquals(false,javaAnagrams.isAnagram("Hello","Madam"));
    }

}