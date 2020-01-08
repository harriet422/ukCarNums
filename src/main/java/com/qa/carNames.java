package com.qa;

public class carNames {
    public int findNextNumber(int input){
       // <51 add 50, >50 minus49
        if (input < 51){
            System.out.println(input + 50);
        }
        else
            input = input - 49;
        return input;
    }
}