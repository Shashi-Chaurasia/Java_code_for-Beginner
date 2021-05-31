package com.codewithshashi;

public class IterationDemo {

    public static void main(String[] args) {
        ///**********
        //**********/
        //*********

//        for (int i = 1; i <=6; i++){
//
//
//            for(int j = 1; j <= 6; j++){
//
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }

//        for (int i = 1; i <=6; i++){
//
//
//            for(int j = 1; j <= i; j++){
//
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }

//        for (int j = 65; j <=75; j++){
//
//
//            for(int asciiValue = 65; asciiValue <= j; asciiValue++){
//                String convertedChar = Character.toString(asciiValue);
//                System.out.print(convertedChar+" ");
//            }
//            System.out.println();
//
//        }



        for (int i = 1; i <=6; i++){


            for(int j = 1; j <= 6; j++){
                if(i ==2) {
                    continue;
                }

                System.out.print("* ");
            }
            System.out.println();

        }


    }



}
