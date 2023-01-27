import java.util.Scanner;

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
            Scanner scan = new Scanner(System.in);

            int i = scan.nextInt();
            double d = scan.nextDouble();
            //  This makes it so that you get the full line outputted
            scan.nextLine();
            String s = scan.nextLine();
    
            // Write your code here.
            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);
    


    }
} // End of hacker rank
