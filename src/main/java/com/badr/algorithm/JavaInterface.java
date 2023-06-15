package com.badr.algorithm;
import java.util.*;

interface AdvancedArithmetic{
    int divisor_sum(int n);
}

class MyCalculators implements AdvancedArithmetic{
    public int divisor_sum(int n){
        int result = 0;
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                result +=i;
            }
            else{
                continue;
            }
        }
        return result;
    }
}
public class JavaInterface {
    public static void main(String []args){
        MyCalculators my_calculators = new MyCalculators();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculators);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculators.divisor_sum(n) + "\n");
        sc.close();
    }
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}
