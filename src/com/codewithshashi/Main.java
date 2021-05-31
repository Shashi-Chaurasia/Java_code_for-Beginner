package com.codewithshashi;

import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.sql.Array;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        byte age = 30;
//        Date now = new Date();
//        System.out.println(now);

//        Point point1 = new Point(1,1);
//        Point point2 = point1;
//        point1.x = 2;
//        System.out.println(point2);

        // String
//        String message = "hellow ! I am Shashi Chaurasia";
////        System.out.println(message.length());
////        System.out.println(message.replace("Shashi" , "Vinita"));
//        System.out.println(message.toUpperCase(Locale.ROOT));


        /////-----------Array-----------
//        int[] numbers = new int[7];
//        numbers[0] = 5;
//        numbers[5] = 2;
//        numbers[6] = 3;
//        numbers[1] = 7;
//
//        System.out.println(Arrays.toString(numbers));
        //// MultiDemansion Arrays --------
//        int[][]  puzzels  = {{2,3,4} , {5,3,2,}};
//
//        System.out.println(Arrays.deepToString(puzzels));

        /// Print Area Of Circle

//        final float pi = 3.14F;
//        int r = 5;
//        float area = pi * (r * r);
//        System.out.println(area);
//
//        String winner = "1";
//        int y = Integer.parseInt(winner);
//        System.out.println(y);

            //  Numberformat - like currency types
//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String newcurrency = currency.format(12343313.331);
//        System.out.println(newcurrency);


        // Percentage  conversen

//        String newcurrency =  NumberFormat.getPercentInstance().format(0.1);
//        System.out.println(newcurrency);


        // read method from user
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Your Age : ");
//        byte age =  scanner.nextByte();
//        System.out.println("Your Age is " + age);


        /////////////Compount interest-----

//        final byte month_in_year = 12;
//        final  byte percent = 100;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter Principal : ");
//        int principal = scanner.nextInt();
//
//        System.out.print("Annual Interest rate : ");
//        float rate = scanner.nextFloat();
//        float monthlyInterestRate = rate / percent / month_in_year;
//
//        System.out.print("Period(Year) : ");
//        byte years = scanner.nextByte();
//        int paymentOfPerMonth = years * month_in_year;
//
//        double mortage = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate , paymentOfPerMonth)
//                /Math.pow(1 + monthlyInterestRate ,paymentOfPerMonth) - 1);
//        String finalMortage = NumberFormat.getCurrencyInstance().format(mortage);
//        System.out.println("Mortage :" + finalMortage);




//        boolean hasHighIncome = true;
//        boolean hasGoodCredit = true;
//        boolean hasNoCriminalRecord = false;
//
//        boolean eligibleForLoan = (hasGoodCredit || hasHighIncome) && ! hasNoCriminalRecord;
//        System.out.println(eligibleForLoan);


        // Conditional Operator

//
//        int temp = 6;
//        if (temp > 32){
//            System.out.println("Its a hot day");
//            System.out.println("Plaes drink a cup of water");
//
//        }else if (temp >20 && temp <32){
//            System.out.println("It a nice days");
//        }else {
//            System.out.println("its cold");
//        }

            // ternary operation

//        int income  = 10_000_000;
//        String  className = income > 1000000 ? "first class" : "economy Class";
//        System.out.println(className);


        /// --------- Switch operations
//
//        String role = "admin";
//        switch (role){
//            case "admin":
//                System.out.println("You Are admin");
//                break;
//            case "moderate":
//                System.out.println("You Are moderates");
//                break;
//            case "candiates":
//                System.out.println("You Are condiates");
//        }
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Number : ");
//        int number = scanner.nextInt();
//
//        if (number % 3 == 0 && number % 5  == 0)
//            System.out.println("BuzzFizz");
//        else if (number % 5 == 0)
//            System.out.println("Fizz");
//
//
//
//        else if (number % 3 == 0)
//            System.out.println("Buzz");
//
//
//        else
//            System.out.println(number);



        //  For Loop ------

        // Write a table program

//        for (int i = 1 ; i <=10; i++){
//            int expTable = 12;
//            System.out.println(expTable + " * " + i + "="  +  (expTable * i));
//        }



//
//        // ---------- While loop-----------
//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//        while (!input.equals("quit")){
//            System.out.print("Input : ");
//            input =  scanner.nextLine().toLowerCase(Locale.ROOT);
//            System.out.println(input);
//        }



        //----------pELINDROME--------------

//        String original, reverse = ""; // Objects of String class
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a string/number to check if it is a palindrome : ");
//        original = scanner.nextLine();
//        int length = original.length();
//        for ( int i = length - 1; i >= 0; i-- )
//            reverse = reverse + original.charAt(i);
//        if (original.equals(reverse))
//            System.out.println("Entered string/number is a palindrome.");
//        else
//            System.out.println("Entered string/number isn't a palindrome.");



        //------- Problem Staement -----

        final byte month_in_year = 12;
        final  byte percent = 100;
        int principal = 0;
        float monthlyInterestRate = 0;
        int paymentOfPerMonth = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Principal : ");
            principal =  scanner.nextInt();
            if ( principal >= 1000 && principal <= 1000000)
                break;
            System.out.println("Plz enter principle between 1000 to 1000000");
        }

        while (true){
            System.out.print("Annual Interest rate : ");

            float rate = scanner.nextFloat();
            if (rate >=1 && rate <= 30){
                monthlyInterestRate = rate / percent / month_in_year;
                break;
            }




            System.out.println("Plz enter monthlyInterestRate in between 1 and 30");
        }

        while (true){
            System.out.print("Period(Year) : ");
            byte years = scanner.nextByte();
            paymentOfPerMonth = years * month_in_year;
            if (years >= 1 && years <= 30)
                break;
            System.out.println("Please enter year between 1 and 30");

        }
        double mortage = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate , paymentOfPerMonth)
                /Math.pow(1 + monthlyInterestRate ,paymentOfPerMonth) - 1);
        String finalMortage = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println("Mortage :" + finalMortage);







    }
}
