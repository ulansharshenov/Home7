package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rnd = new Random();
        int[] numbers = new int[5];
        System.out.print("Random numbers: ");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = rnd.nextInt(100);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.print("Even numbers: ");
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0){
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
