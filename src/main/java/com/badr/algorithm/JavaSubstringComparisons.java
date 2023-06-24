package com.badr.algorithm;
import java.util.Scanner;

public class JavaSubstringComparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest ="";
        String largest = "";
        if (k <= 0 || k > s.length()){
            return smallest + " " + largest;
        }
        if(s.length() != 0){
            smallest = s.substring(0,k);
        }
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
        return smallest + " " + largest;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int k = scanner.nextInt();
        scanner.close();
        System.out.println(getSmallestAndLargest(s, k));
    }
}
