package com.badr.algorithm;
import java.util.*;

public class JavaHashset {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        HashSet<String> T = new HashSet<String>();
        for(int j=0;j<t;j++){
            T.add(pair_left[j] + "," + pair_right[j]);
            System.out.println(T.size());
        }
    }
}
