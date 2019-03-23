package sumthedigits;

import java.util.Scanner;

public class SumTheDigits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:\t");

        int inputValue = (int) input.nextDouble();
        int sum = 0;

        while (inputValue != 0) {

            sum += inputValue % 10;
            inputValue /= 10;

        }

        System.out.printf("The sum of the digits is:\n%d\n\n\n\n\n", sum);
    }

}
