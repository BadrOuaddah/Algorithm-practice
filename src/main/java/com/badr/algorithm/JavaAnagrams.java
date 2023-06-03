package com.badr.algorithm;
import java.io.*;
import java.util.*;

public class JavaAnagrams {
    static boolean isAnagram(String a, String b) {
        char[] charsA = a.toUpperCase().toCharArray();
        char[] charsB = b.toUpperCase().toCharArray();
        if(a.length() != b.length()){
            return false;
        }

        Arrays.sort(charsA);
        Arrays.sort(charsB);
        if(Arrays.equals(charsA,charsB)){
            return true;
        }else {
            return false;
        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
