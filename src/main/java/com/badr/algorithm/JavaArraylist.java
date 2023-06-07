package com.badr.algorithm;

import java.util.*;
public class JavaArraylist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> list=new ArrayList();
            int index = scanner.nextInt();
            for(int j=0;j<index;j++){
                int element = scanner.nextInt();
                list.add(element);
            }
            arrayList.add(list);
        }

        int q = scanner.nextInt();
        for(int k=0;k<q;k++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            try {
                System.out.println(arrayList.get(x-1).get(y-1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
