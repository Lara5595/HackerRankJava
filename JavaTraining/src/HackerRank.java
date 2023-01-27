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


    public static void main(String[] args) {
        
        // question 1 answer
        // System.out.println("Hello World.");

        // question 2 answer
        Scanner scanner = new Scanner(System.in);
        // String myString = scanner.next();
        
        // int myInt = scanner.nextInt();
        // // scanner.close();
        
        // System.out.println("myString is: " + myString);
        // System.out.println("myInt is: " + myInt);

        // question 3 answer
        
        int N = scanner.nextInt();
        if(N %2 != 0) {
            System.out.println("Weird");
        } else if(N %2 == 0 && N <= 5 && N >= 2 ){
            System.out.println("Not Weird");
        } else if(N %2 == 0 && N <= 20 && N >=6 ){
            System.out.println("Weird");   
        } else if(N %2 == 0 && N >= 20) {
            System.out.println("Not Weird");
        }
        



    }
}
