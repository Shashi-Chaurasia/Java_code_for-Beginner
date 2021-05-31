package com.codewithshashi;

import com.sun.jdi.ObjectReference;

import java.beans.ConstructorProperties;
import java.lang.reflect.Constructor;
import java.sql.SQLOutput;

public class Puppy {

    int puppyAge;

    public Puppy(String name){
        System.out.println("My puppy name is :"  + name);


    }

    public void setPuppyAge(int puppyAge) {
        System.out.println("/Set Pappy Age :");
        this.puppyAge = puppyAge;
    }

    public int getPuppyAge() {
        System.out.println(" My puppy age is  " + puppyAge);
        return puppyAge;
    }

    public static void main(String[] args) {
        Puppy myPuppy = new Puppy("Tommy");

        //  set value

        myPuppy.setPuppyAge(6);

        // Get Puppy Age
        myPuppy.getPuppyAge();
        System.out.println("  My puppy age is : " +myPuppy.puppyAge);
    }
}

