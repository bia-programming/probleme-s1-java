package com.company;

import java.util.Scanner;
public class p6 {
    public static void main(String[] args) {
        final Scanner myInput = new Scanner(System.in);
        final int nr = myInput.nextInt();
        System.out.println(divizor(nr));
    }

    static int divizor(int d){
        int i,sum=0;
        for(i=2;i<=d/2;i++)
            if(d%i==0)
                sum=sum+i;
            return sum;

    }
}
