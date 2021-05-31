package com.codewithshashi;

import java.util.Scanner;

//class Student{
//    int roll = 0;
//    String name = "";
//}

public class ArrayDemo {
    public static void main(String[] args) {
//        int num[] = new int[4];
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("enter ist number :");
//        num[0] = scanner.nextByte();
//        System.out.print("Enter 2nd number :");
//        num[1] = scanner.nextByte();
//        System.out.print("Enter 3nd number :");
//        num[2] = scanner.nextByte();
//        System.out.print("Enter 4nd number :");
//        num[3] = scanner.nextByte();
//
//        for (int i = 0; i <4; i++){
//            System.out.println(num[i]);
//        }

//            Student s1 = new Student();
//            s1.roll = 1;
//            s1.name = "shashi";
//            Student s2 = new Student();
//            s2.roll = 2;
//            Student s3 = new Student();
//            s3.roll = 3;
//            Student s4 = new Student();
//            s4.roll = 4;
//            Student s5 = new Student();
//            s5.roll = 5;
//            Student s6 = new Student();
//            s6.roll = 6;
//
//            Student rollno[] = {s1 , s2 , s3 , s4  , s5 , s6};
//            for (int i = 0 ; i<6 ; i++){
//                System.out.println(rollno[i]);
//            }

       // 2d Array and Inhance loop


        int num[][] = {
                {2,3,4,5} , {3,5,7},{2,4,6,3,7,4,8}
        };

//        for (int i=0 ; i< num.length; i++){
//            for (int j = 0; j<num[i].length;j++){
//                System.out.print(" " + num[i][j]);
//
//            }
//            System.out.println();


        /// Enhance rool for looping.///  good programmer Practice:

        for (int k[] : num){
            for ( int l : k){
                System.out.print(" " + l);
            }
            System.out.println();

        }


    }
}
