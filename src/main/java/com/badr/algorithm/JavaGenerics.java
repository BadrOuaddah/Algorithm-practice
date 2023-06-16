package com.badr.algorithm;

public class JavaGenerics {
    public static < T > void printArray( T[] element ) {
        for(T e : element) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Integer[] arrayIntegers = {1,2,3};
        String[] arrayStrings = {"Hello","World"};
        printArray(arrayIntegers);
        printArray(arrayStrings);
    }
}
