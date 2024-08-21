package org.example;

public class SumCOmmandLine {
    public static void main (String[] args) {

        // Command Line Input
        // Stored in Variables
        int a= Integer.parseInt(args[0]);
        int b= Integer.parseInt(args[1]);

        // Printing Sum of variables
        System.out.println("Sum:"+(a+b));
    }
}
