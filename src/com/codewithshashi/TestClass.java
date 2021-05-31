package com.codewithshashi;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter name :");
        String name = s.nextLine();

        for (int i = 0; i <name.length(); i++){
            if (!(name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u'
                    || name.charAt(i) == 'I' || name.charAt(i) == 'E' || name.charAt(i) == 'A' || name.charAt(i) == 'O' || name.charAt(i) == 'U')){
                System.out.print("ugly number");


            }
            else {
                System.out.println("lovely String");
            }
        }



    }
}
