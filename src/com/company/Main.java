package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        System.out.println("First 10 Happy numbers:");
        for (long number = 1, count = 0; count < 8; number++) {
            if (happyNumber(number)) {
                System.out.println(number);
                count++;
            }
        }
    }

    public static boolean happyNumber(long number){
        long newNumber = 0;
        int digit = 0;
        HashSet<Long> setForHappy = new HashSet<Long>();
        while(number != 1 && setForHappy.add(number)){
            newNumber = 0;
            while(number > 0){
                digit = (int)(number % 10);
                newNumber += digit*digit;
                number /= 10;
            }
            number = newNumber;
        }
        return number == 1;
    }
}