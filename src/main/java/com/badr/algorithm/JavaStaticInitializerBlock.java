package com.badr.algorithm;
import java.util.*;

public class JavaStaticInitializerBlock {
    static int B,H;
    static boolean flag;

    static{
        Scanner scanner = new Scanner(System.in);
        int B = scanner.nextInt();
        int H = scanner.nextInt();

        if(B>0 && H>0 ){
            flag =true;
        }else{
            try{
                throw new Exception("Breadth and height must be positive");

            }catch(Exception e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args){
        System.out.println("This is H: "+H+"and this is B : "+B);
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }
}
