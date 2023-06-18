package com.badr.algorithm;

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

        String a_1 = "Madam";
        String b_1 = "Madam";
        boolean ret_1 = isAnagram(a_1, b_1);
        System.out.println( (ret_1) ? "Anagrams" : "Not Anagrams" );
        String a_2 = "Hello";
        String b_2 = "Madam";
        boolean ret_2 = isAnagram(a_2, b_2);
        System.out.println( (ret_2) ? "Anagrams" : "Not Anagrams" );
    }
}
