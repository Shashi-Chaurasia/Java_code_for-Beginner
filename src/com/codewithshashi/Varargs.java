package com.codewithshashi;

class Cal{
    public int add(int... n){   //// It behaves lika a array jorry array.
        int sum = 0;
        for (int i:n){
            sum = sum+i;
        }
        return sum;
    }
}


public class Varargs {
    public static void main(String[] args) {

        Cal obj = new Cal();
        int result = obj.add(2,3,4,5,2,4,5,34,5,4);
        System.out.println("Result :" + result);
    }
}
