package com.codewithshashi;

// Inner class
// Member class
///Static Class
// Anonymous Class



class Outer{
    static int a;

    public static void show(){
        System.out.println("In static class");
    }
    static class Inner{          // Outer$Innner.class
        public void display(){
            System.out.println("In inner class");
        }

    }
}



public class InnerDemo {
    public static void main(String[] args) {

        Outer obj = new Outer();
        obj.show();

        Outer.Inner obj1 = new Outer.Inner();
        obj1.display();
    }
}
