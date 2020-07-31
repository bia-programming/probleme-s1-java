package com.company;

import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        final Scanner myInput = new Scanner(System.in);
        final int x = myInput.nextInt();
        suma(x);
    }
    static void suma(int nr){
        int sum=0;
        for(int i=1;i<=nr;i++)
            sum=sum+i;
        System.out.println(sum);
    }
}
