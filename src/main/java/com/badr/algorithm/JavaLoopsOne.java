package com.badr.algorithm;
import java.io.*;

public class JavaLoopsOne {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for (int i = 1; i<= 10; i++){
            int result = i * N;
            System.out.print( N +" x " +i+ " = "+result +"\n");
        }
        bufferedReader.close();
    }
}
