package com.badr.algorithm;
import java.util.*;

public class JavaStringReverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        firstSolution(A);
//        secondSolution(A);

    }

    private static void firstSolution(String A) {
        String reverse = new StringBuilder(A).reverse().toString();
        if (A.equals(reverse)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

    private static void secondSolution(String A) {
        int size = A.length();
        char normalA, reverseA;
        StringBuilder reverseBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            normalA = A.charAt(i);
        }
        for (int i = size - 1; i >= 0; i--) {
            reverseA = A.charAt(i);
            reverseBuilder.append(reverseA);
        }
        String reverseString = reverseBuilder.toString();
        boolean equalsOneTwo = A.equals(reverseString);
        if (equalsOneTwo) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

