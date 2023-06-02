package com.badr.algorithm;
import java.util.*;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        if(s.isEmpty()){
            System.out.println("0");
        }else{
            String sSplit[] = s.split("[ \"!,?._'@\".{-}]+");
            System.out.println(sSplit.length);
            for (int i = 0; i < sSplit.length; i++) {
                System.out.println(sSplit[i]);
            }
        }
        scan.close();
    }
}
