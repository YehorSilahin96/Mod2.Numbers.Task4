package com.company;

import java.util.HashSet;

public class Main {

    //output
    public static void main(String[] args) {
        System.out.println("First 10 Happy numbers:");
        for (long num = 1, count = 0; count < 8; num++) {
            if (happyNumber(num)) {
                System.out.println(num);
                count++;
            }
        }
    }

    //getting result
    public static boolean happyNumber(long num){
        long newnum = 0;
        int digit = 0;
        HashSet<Long> cycle = new HashSet<Long>();
        while(num != 1 && cycle.add(num)){
            newnum = 0;
            while(num > 0){
                digit = (int)(num % 10);
                newnum += digit*digit;
                num /= 10;
            }
            num = newnum;
        }
        return num == 1;
    }
}