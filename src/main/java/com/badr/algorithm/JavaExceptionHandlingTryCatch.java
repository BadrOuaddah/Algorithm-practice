package com.badr.algorithm;

import java.util.*;
public class JavaExceptionHandlingTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Integer division = x/y;
            System.out.println(division);
        }
        catch(InputMismatchException e){
            System.out.println(e.getClass().getName());
        }
        catch(ArithmeticException e){
            System.out.println(e.getClass().getName() + ": / by zero");
        }
    }
}
