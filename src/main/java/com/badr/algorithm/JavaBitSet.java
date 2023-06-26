package com.badr.algorithm;
import java.util.*;

public class JavaBitSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer N = scanner.nextInt();
        Integer M = scanner.nextInt();
        BitSet B1 = new BitSet(N);
        BitSet B2 = new BitSet(N);
        for(int i=0;i<M;i++){
            String s = scanner.next();
            Integer a = scanner.nextInt();
            Integer b = scanner.nextInt();
            switch(s){
                case "AND" :
                    if(a == 1){
                        B1.and(B2);
                    }
                    else if(a == 2){
                        B2.and(B1);
                    }
                    break;
                case "OR" :
                    if(a == 1){
                        B1.or(B2);
                    }
                    else if(a == 2){
                        B2.or(B1);
                    }
                    break;
                case "XOR" :
                    if(a == 1){
                        B1.xor(B2);
                    }
                    else if(a == 2){
                        B2.xor(B1);
                    }
                    break;
                case "FLIP" :
                    if(a == 1){
                        B1.flip(b);
                    }
                    else if(a == 2){
                        B2.flip(b);
                    }
                    break;
                case "SET" :
                    if(a == 1){
                        B1.set(b,true);
                    }
                    else if(a == 2){
                        B2.set(b,true);
                    }
                    break;
            }
            System.out.println(B1.cardinality()+" "+B2.cardinality());
        }
    }
}
