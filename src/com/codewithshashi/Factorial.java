package com.codewithshashi;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter factorial number :");
        int fact = scanner.nextInt();
        int factz = 1;

        for (int i = fact; i>=1; i--){
            factz = factz * i;
        }
        int result = factz;
        System.out.println(result);


    }
}
