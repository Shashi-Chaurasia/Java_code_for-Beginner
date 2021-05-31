package com.codewithshashi;

import java.util.Scanner;

public class Calculator {
    double num1;
    double num2;
    double result;

    public void add(){
        result = num1 + num2;
    }
    public void sub(){
        result = num1 - num2;
    }
    public void mul(){
        result = num1 * num2;
    }
    public void div(){
        result = num1 / num2;
    }

    public static void main(String[] args) {

        Calculator cal = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number1 : ");
        cal.num1 = scanner.nextDouble();
        System.out.print("Enter Number 2: ");
        cal.num2 = scanner.nextDouble();

        Scanner perform = new Scanner(System.in);
        System.out.print("Operation perform : ");
        String click = perform.nextLine();

        switch (click){
            case "+" :{
                cal.add();
                System.out.println("Addiction's Result :" + cal.result);
                break;
            }

            case "-" :{
                cal.sub();
                System.out.println("Sub's Result :" + cal.result);
                break;
            }

            case "*" :{
                cal.mul();
                System.out.println("Multiplication's Result :" + cal.result);
                break;
            }

            case "/" :{
                cal.div();
                System.out.println("Division Result :" + cal.result);
                break;
            }
        }

    }
}
