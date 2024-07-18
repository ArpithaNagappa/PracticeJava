package org.example;

import java.util.Scanner;

public class AddNnumbers {
    public static void main(String[] args)
    {

        // N is the number if elements
        int N;

        // Initialising the Scanner Class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of elements:");

                // Taking the input of N
                N = sc.nextInt();
        int sum = 0;

        // Taking N inputs and find the sum
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();

            sum += a;
        }

        // Printing the sum of N numbers
        System.out.println("Sum of Input Numbers : " + sum);
    }
}
