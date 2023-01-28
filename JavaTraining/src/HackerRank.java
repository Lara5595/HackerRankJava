import java.util.Scanner;

import javax.swing.SortingFocusTraversalPolicy;

public class HackerRank {
    //  Question 1 System.out.println("Hello World")

    // Question 2 Java Stdin and Stdout 1

    // Question 3 If else statement Given an integer, , perform the following conditional actions:
    // If  is odd, print Weird
    // If  is even and in the inclusive range of  to , print Not Weird
    // If  is even and in the inclusive range of  to , print Weird
    // If  is even and greater than , print Not Weird
    // Complete the stub code provided in your editor to print whether or not  is weird.

    // Question 4
//     There are three lines of output:

    // On the first line, print String: followed by the unaltered String read from stdin.
    // On the second line, print Double: followed by the unaltered double read from stdin.
    // On the third line, print Int: followed by the unaltered integer read from stdin.
    // To make the problem easier, a portion of the code is already provided in the editor.

    // Note: If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens; because of this, the last newline character for that line of integer input is still queued in the input buffer and the next nextLine() will be reading the remainder of the integer line (which is empty).


    // question 5 using souf
    // In each line of output there should be two columns:
    // The first column contains the String and is left justified using exactly  characters.
    // The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

    // question 6
    // Multiplication table for 2



    public static void main(String[] args) {
        
        // question 1 answer
        // System.out.println("Hello World.");

        // question 2 answer
        // Scanner scanner = new Scanner(System.in);
        // String myString = scanner.next();
        
        // int myInt = scanner.nextInt();
        // // scanner.close();
        
        // System.out.println("myString is: " + myString);
        // System.out.println("myInt is: " + myInt);

        // question 3 answer
        
        // System.out.println("Enter a number");
        // int N = scanner.nextInt();
        // if(N %2 != 0) {
        //     System.out.println("Weird");
        // } else if(N %2 == 0 && N <= 5 && N >= 2 ){
        //     System.out.println("Not Weird");
        // } else if(N %2 == 0 && N <= 20 && N >=6 ){
        //     System.out.println("Weird");   
        // } else if(N %2 == 0 && N >= 20) {
        //     System.out.println("Not Weird");
        // }
        
            // question 4 answer
            // Scanner scan = new Scanner(System.in);

            // int i = scan.nextInt();
            // double d = scan.nextDouble();
            // //  This makes it so that you get the full line outputted
            // scan.nextLine();
            // String s = scan.nextLine();
    
            // // Write your code here.
            // System.out.println("String: " + s);
            // System.out.println("Double: " + d);
            // System.out.println("Int: " + i);
    

            
            // question 5 answer
            // Scanner sc = new Scanner(System.in);
            // System.out.println("================================");

            // for(int i=0;i<3;i++){
            //     String s1=sc.next();
            //     int x=sc.nextInt();
            //     //Complete this line
            //      System.out.printf("%-15s%03d%n", s1,x);

                
            // }

            // System.out.println("================================");

            //  This is a better example for #5
            // Scanner scanf = new Scanner(System.in);
            // System.out.println("Enter something");
            // String hi = scanf.nextLine();
            // System.out.println("Enter a number");
            // int numberf = scanf.nextInt();

            // System.out.println("================================");

            // System.out.printf("%-15s%03d%n", hi, numberf);

            // System.out.println("================================");



            // question 6 answer

            // int N = Integer.parseInt(bufferedReader.readLine().trim());

            // for(int i = 1; i<=10; i++){
            // System.out.printf("%d x %d = %d%n", N, i, N*i);
            // }

            // better answer

            Scanner number = new Scanner(System.in);
            System.out.println("Enter a number to multiply");
            int numberWeAreMultiplying = number.nextInt();
            System.out.printf("You enter %d%n", numberWeAreMultiplying);


            for (int N = 1; N <=10; N++){
                int result = numberWeAreMultiplying * N;
                System.out.printf("%d x %d = %d%n", numberWeAreMultiplying, N, result);
            }
            



    } // end of main
} // End of hacker rank
