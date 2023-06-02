package com.badr.algorithm;
import java.util.Scanner;

public class JavaSubstringComparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = "";
        for(int i=0;i<s.length()-k+1;i++){
            String temp=s.substring(i,i+k);
            if(temp.compareTo(largest) > 0)
            {
                largest = temp;
            }
            if(temp.compareTo(smallest) < 0){
                smallest = temp;
            }
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }
}
