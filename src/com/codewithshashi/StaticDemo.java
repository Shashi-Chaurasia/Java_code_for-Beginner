package com.codewithshashi;

class Emp{

    byte id;
    int salary;
    static String ceo;

    public Emp(){
        id = 3;
        salary = 30000;
        System.out.println("i constructor");
    }
    static {
        ceo = "larry";
        System.out.println("in statics");
    }

    public void show(){
        System.out.println(id + " " + salary + " " + ceo + "");
    }
}



public class StaticDemo {
    public static void main(String[] args) {

        Emp shashi = new Emp();


        Emp satsish = new Emp();

        shashi.show();
        satsish.show();




    }
}
