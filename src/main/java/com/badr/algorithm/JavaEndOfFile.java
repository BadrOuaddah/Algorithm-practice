package com.badr.algorithm;
import java.util.*;

public class JavaEndOfFile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = 1;
        while(scanner.hasNext()){
            System.out.print(n++ + " "+ scanner.nextLine()+"\n");
        }
        scanner.close();
    }
}
