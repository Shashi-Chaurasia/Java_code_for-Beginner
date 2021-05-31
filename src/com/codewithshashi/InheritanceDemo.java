package com.codewithshashi;

import java.util.Scanner;

class Calculatior{

    public int add(int i , int ... j){

        int sum = 0;
        for (int k : j){
            sum = sum + k;

        }
        return sum + i;
    }
}

class AdvCal extends Calculatior{

    public int sub(int i , int ... j){
        int sum = 0;
        for (int k : j){
            sum = -sum - k;

        }
        return i - sum;
    }
}

class ExAdvCal extends AdvCal
{
    public int mul(int i , int ... j){
        int multiply = 1;
        for (int k : j){
            multiply = multiply * k;

        }
        return i*multiply;
    }

}
class BestCal extends ExAdvCal{
    public int div(int a , int b){
        return a / b;
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        BestCal cal1 = new BestCal();
        System.out.println( "Substraction :  " + cal1.sub(5 , 4,4,3));

        System.out.println("Additions :"+cal1.add(4 , 3,4,5,6,7,8));

        System.out.println("Multiplication : "  + cal1.mul(2 , 2,2,2,2));

        System.out.println("Division  :" + cal1.div(10 , 5)  );

    }
}
