package groupProject;

import java.util.Scanner;

public class E6SecondMethod {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner scan=new Scanner(System.in);
        int input=scan.nextInt();
        boolean isPrime=true;
        for (int i = 2; i <= input/2 ; ++i) {
            if (input % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println(input + " is a prime number");
        else
            System.out.println(input + " is NOT a prime number");
    }
}
