package com.company;

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        final Scanner myInput = new Scanner(System.in);
        final int x = myInput.nextInt();
        method1(x);
        method2(x);
    }

    static void method1(int x){
        int sum=0,mod;
        while(x!=0){
            mod=x%10;
            if(mod%2==0)
                sum=sum+mod;
            x=x/10;
        }
        System.out.println("Suma cifrelor pare " +sum);
    }


    static void method2(int x){
        int sum=0,mod;
        while(x!=0){
            mod=x%10;
            if(mod%2==1)
                sum=sum+mod;
            x=x/10;
        }
        System.out.println("Suma cifrelor impare " +sum);
    }
}