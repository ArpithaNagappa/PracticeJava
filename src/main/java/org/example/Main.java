package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Addition obj = new Addition();
        int result = obj.addTwoNum(4,3);
        System.out.println(result);

        int sum = obj.add3Numbers(2,3,4);
        System.out.println(sum);


    }

}