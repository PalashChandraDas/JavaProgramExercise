package basic_exercise;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer:");
        int num = in.nextInt();

        if (num % 2 == 0) {
            System.out.printf("%d is even number.\n", num);
        } else {
            System.out.printf("%d is odd number.\n", num);
        }
    }
}
