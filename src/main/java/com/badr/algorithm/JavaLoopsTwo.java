package com.badr.algorithm;
import java.util.*;
import java.io.*;

public class JavaLoopsTwo {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0;j<n;j++){
                a = a+b;
                System.out.print(a +" ");
                b = b*2;
            }
            System.out.println("");
        }

        in.close();
    }
}