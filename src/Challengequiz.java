
import java.util.Random;
import java.util.Scanner;

public class Challengequiz {
    public static void main(String[] args) { // all method call will only work if all answers in every level of method is TRUE

finalRound();


    }

    public static void level1() {


        int count = 1;
        int noq = 5;


        Scanner input = new Scanner(System.in);
        System.out.print("Hello welcome to our quiz competition \n ");

        System.out.print("What is your name? \n");
        String name = input.next();
        System.out.print("Welcome " + " " + name + " \n");
        System.out.print("This is level 1 , you will have 3 questions \n \n");
        System.out.print("So lets Start!!!\n \n");
        int correctanswer = 0;
        int wronganswer = 0;

        Random ran = new Random();
        while (count <= noq) {
            int num1 = ran.nextInt(1, 10);
            int num2 = ran.nextInt(2, 20);
            int actualRes = num1 + num2;
            System.out.print(count + ") " + num1 + "+" + num2 + "=? \n");
            int userResult = input.nextInt();
            if (actualRes == userResult) {
                System.out.println("Awesome your answer is correct!!");
                correctanswer++;
            } else {
                System.out.println("wrong ");
                wronganswer++;

            }
            count++;
        }
        System.out.println("Your correct answer is: " + correctanswer);
        System.out.println("Your wrong answer is " + wronganswer);

        if (correctanswer > wronganswer) {
            System.out.println(" You proceed to the next round \n \n \n");
        } else {
            System.out.println(" Sorry,you do not proceed to the next round \n \n \n");

        }

    }


    public static void level2() {


        int count = 1;
        int noq = 5;
        Scanner input = new Scanner(System.in);
        String name = " MOHAMMED";
        System.out.print("Welcome to the level 2  -" + "\n");
        System.out.print(name + "\n");
        System.out.println("HERE YOU WILL  ALSO FACE 5 QUESTION \n");
        System.out.print("So lets Start!!!\n\n");
        int correctanswer = 0;
        int wronganswer = 0;

        Random ran = new Random();
        while (count <= noq) {
            int num1 = ran.nextInt(1, 10);
            int num2 = ran.nextInt(2, 20);
            int actualRes = num1 + num2;
            System.out.print(count + ") " + num1 + "+" + num2 + "=? \n");
            int userResult = input.nextInt();
            if (actualRes == userResult) {
                System.out.println("Awesome your answer is correct!!");
                correctanswer++;
            } else {
                System.out.println("wrong ");
                wronganswer++;

            }
            count++;


        }
    }

    public static void finalRound() {



        String yesNO;
        do {

            int correct = 0;
            Scanner input = new Scanner(System.in);
            String name = "MOHAMMED : -";
            System.out.print("Welcome to FINAL ROUND  -" + "\n");
            System.out.print(name + "\n");
            System.out.println("HERE YOU WILL HAVE MULTIPLE QUESTION :-\n");
            System.out.print("So lets Start!!!\n\n");

            Random ran = new Random();
                int randomNumber1 = ran.nextInt(20, 40);
                int randomnNumber2 = ran.nextInt(10, 20);

                int randomNumberAdd = randomNumber1 + randomnNumber2;
                int randomNumberMultiply = randomNumber1 * randomnNumber2;
                int randomNumberSubtract = randomNumber1 - randomnNumber2;

                  // ADD.........!
                System.out.print("1) " + randomNumber1 + "+" + randomnNumber2 + "=? \n");
                int userResult = input.nextInt();

                if (userResult == randomNumberAdd) {
                    System.out.println("Awesome This is Correct Answer ");
                    correct++;
                } else {
                    System.out.println("Sorry, This is Not Correct Answer:- \n" + "CORRECT ANSWER IS: " + (+randomNumberAdd + " \n"));

                }

                // MULTIPLICATION.......!!!!
                  System.out.print("2) " + +randomNumber1 + " * " + randomnNumber2 + "=? \n");
                    int userResult1 = input.nextInt();

                    if (userResult1 == randomNumberMultiply) {
                        System.out.println("Awesome This is Correct Answer");
                        correct++;
                    } else {
                        System.out.println("Sorry,This is Not Correct Answer:- \n" + "CORRECT ANSWER IS: " + (+randomNumberMultiply + " \n"));
                    }

                   // SUBTRACTION..........!!!

                    System.out.print("3) " + randomNumber1 + "-" + randomnNumber2 + "=? \n");
                    int userResult2 = input.nextInt();

                    if (userResult2 == randomNumberSubtract) {
                        System.out.println("Awesome This is Correct Answer");
                        correct++;
                    } else {
                        System.out.println("Sorry,This is Not Correct Answer:- \n" + "CORRECT ANSWER IS: " + (+randomNumberSubtract + " \n"));


                    }
                    System.out.println("You got  " + correct + " Correct Answers \n");
                System.out.print("Do you wish to play again: (Press yes or no) \n");
                yesNO = input.next();


            } while (yesNO.equals("yes") || yesNO.equals("YES")) ;
                System.out.println("THANK YOU FOR PARTICIPATING IN OUR QUIZ : -");




    }

}










     /*   do {

            if (correctanswer > wronganswer) {
                System.out.println("You proceed to the next round");
            } else {
                System.out.println(" Sorry, you do not proceed to the next round");

            }
            System.out.println(" Congratulation you proceed to the next round , Are you ready to play (press Yes or No) ");
            yn = input.next();

        }  while (yn.equals("Yes")) ;

*/





/*

if (symbol.equals("/")) {
result= firstNum / secondNum; // why i cant change double into integer by type casting ?

            System.out.println("You have chosen the Division operation, So the Answer is:" + " " +  result);
        } else if ( symbol.equals("-")) {
result = firstNum - secondNum;
            System.out.println("You have chosen the Subtraction operation, So the Answer is" + " " +  result);

        } else if (symbol.equals("*")) {
result = firstNum * secondNum;
            System.out.println("You have chosen the Multiplication operation, So the Answer is" + " " +  result);

        } else if ( symbol.equals("+")) {
result = firstNum + secondNum;
            System.out.println("You have chosen the Arithmetic operation, So the Answer is:" + " " +    result);
        } else {
                System.out.println( "You have Entered invalid Symbol , Try to put the right symbol:");

*/