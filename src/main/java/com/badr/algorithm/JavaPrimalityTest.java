package com.badr.algorithm;

import java.io.*;
import java.math.*;

public class JavaPrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger bigInteger = new BigInteger(n);
        if(bigInteger.isProbablePrime(100)){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }

        bufferedReader.close();
    }
}
