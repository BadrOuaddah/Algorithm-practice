package com.badr.algorithm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class JavaHelloWorldTest {
    JavaHelloWorld javaHelloWorld = new JavaHelloWorld();

    @Test
    public void testLength() {
        Assert.assertEquals(13,javaHelloWorld.functionToTest("Hello, World."));
    }
}