package osa.com.base;

import java.util.Random;
import java.util.Scanner;

public class MyMath {
    public static void main(String[] args) {
        int min = 10;
        int max = 30;
        int noq = 5;
        int count = 1;
        int correctAnswer = 0;
        int wrongAnswer = 0;

        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        System.out.println("What's your name?");
        String name = sc.nextLine();
        System.out.println("Number of Questions: ");
        noq = sc.nextInt();
        int actualResult;

        while (count <= noq) {
            int num1 = ran.nextInt(max - min) + min;
            int num2 = ran.nextInt(max - min) + min;
            actualResult = num1 + num2;

            System.out.println(count + ") " + num1 + " + " + num2 + " = ?");
            System.out.println("");
            int userRes = sc.nextInt();

            if (actualResult == userRes) {
                System.out.println("Correct!!");
                correctAnswer++;
            } else {
                System.out.println("Wrong");
                wrongAnswer++;
            }

            count++;
        }

        System.out.println("**** Thank You " + name + " For Taking the Quiz");
        System.out.println("Your Correct Answer: " + correctAnswer);
        System.out.println("Your Wrong Answer: " + wrongAnswer);

        // Additional section for calculator functionality
        System.out.println("\nNow, let's use this as a calculator:");

        // Addition
        System.out.println("Enter two numbers for addition: ");
        int numAdd1 = sc.nextInt();
        int numAdd2 = sc.nextInt();
        int resultAdd = numAdd1 + numAdd2;
        System.out.println("Result of addition: " + resultAdd);

        // Subtraction
        System.out.println("Enter two numbers for subtraction: ");
        int numSub1 = sc.nextInt();
        int numSub2 = sc.nextInt();
        int resultSub = numSub1 - numSub2;
        System.out.println("Result of subtraction: " + resultSub);

        // Multiplication
        System.out.println("Enter two numbers for multiplication: ");
        int numMul1 = sc.nextInt();
        int numMul2 = sc.nextInt();
        int resultMul = numMul1 * numMul2;
        System.out.println("Result of multiplication: " + resultMul);

        // Division
        System.out.println("Enter two numbers for division: ");
        int numDiv1 = sc.nextInt();
        int numDiv2 = sc.nextInt();
        if (numDiv2 != 0) {
            double resultDiv = (double) numDiv1 / numDiv2;
            System.out.println("Result of division: " + resultDiv);
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
}
