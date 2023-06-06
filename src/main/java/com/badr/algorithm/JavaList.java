package com.badr.algorithm;
import java.util.*;

public class JavaList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> L = new ArrayList<Integer>(N);
        for(int i=0; i<N ; i++){
            int E = scanner.nextInt();
            L.add(E);
        }
        int Q = scanner.nextInt();
        for(int j=0 ; j<Q ; j++){
            String QS = scanner.next();
            if(QS.equals("Insert")){
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                L.add(x,y);
            }
            else if (QS.equals("Delete")){
                int x = scanner.nextInt();
                L.remove(x);
            }
        }
        for (Integer i : L) {
            System.out.print(i+" ");
        }
    }
}
