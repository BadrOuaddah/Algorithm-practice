package com.badr.algorithm;
import java.io.*;
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
    //TODO: implement to second solution !!!

    }
}