package com.badr.algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaHelloWorldTest {

    @Test
    void functionToTest() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        assertTrue(javaHelloWorld.functionToTest("Hello")==5);
    }
}