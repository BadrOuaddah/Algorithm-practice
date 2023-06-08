package com.badr.algorithm;
import java.util.*;

public class JavaMap {
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        HashMap<String,Integer> book = new HashMap<String,Integer>();
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            book.put(name, phone);
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            book.containsKey(s);
            if(book.containsKey(s) == false){
                System.out.println("Not found");
            }else{
                System.out.println(s+"="+book.get(s));
            }
        }
    }
}
