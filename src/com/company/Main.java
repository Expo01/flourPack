package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,2,12));
    }

    public static boolean canPack (int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0|| goal < 0){
            return false;
        } else if ((bigCount * 5 + smallCount >= goal) && (smallCount >= goal % 5)){
            return true;
        } return false;
    }

    //the above was my solution. I'd like to see the run time on this, because I bet mine is faster... especially
    //with larger goals where the loop has to run 100 times or something

    public static boolean canPackWhileLoop(int bigCount, int smallCount, int goal){
        if (bigCount <0 || smallCount < 0 || goal < 0 ){
            return false;
        }
        while (bigCount > 0 && goal >= 5){
            goal -=5;
            bigCount--;
        }
        return (smallCount >= goal);
    }

    //while loop is another students solution
}
