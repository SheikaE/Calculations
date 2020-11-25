package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number: ");
        Integer number = keyboard.nextInt();
        System.out.println(number);
        System.out.println("Enter another number:");
        Integer second_number = keyboard.nextInt();
        System.out.println(second_number);

        int sum = number + second_number;
        int product = number * second_number;
        System.out.println("Sum : " +sum);
        System.out.println("Product : " +product);


        System.out.print("Input: ");
        Integer input = keyboard.nextInt();
        int output = input*input;
        System.out.println("Output: " + output);

        System.out.println("Input: ");
        String stringone = keyboard.nextLine();
        System.out.println("Input: ");
        String stringtwo = keyboard.nextLine();
        System.out.println("Output: " + stringone + stringtwo);
    }
}
