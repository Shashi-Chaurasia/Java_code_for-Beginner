package com.codewithshashi;


class FreshJuice{
    enum FreshJuiceSize{Small , Medium , Large};
    FreshJuiceSize size;

}

public class javaTutorial {


    public static void main(String[] args) {
        FreshJuice juice= new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.Medium;
        System.out.println( "Size : " +  juice.size);
    }
}
