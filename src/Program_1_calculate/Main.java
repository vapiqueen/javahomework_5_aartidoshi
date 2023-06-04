package Program_1_calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner for user input
        Scanner S1 = new Scanner(System.in);
        String answer;

        do {
            System.out.println("Enter first Number:   ");
            int a = S1.nextInt();
            System.out.println("Enter second Number:  ");
            int b = S1.nextInt();
            System.out.println("Please enter one of symbol + ,- ,/ ,* :");
            char symbol = S1.next().charAt(0);
            Calculator calculator = new Calculator();
            calculator.calculateResult(a, b, symbol);
            System.out.println("Would you like to do more calculation,Please enter Y or N: ");
            answer = S1.next().toLowerCase();
        }
        while (answer.startsWith("y"));
        //Closing scanner object
        S1.close();

    }
}
