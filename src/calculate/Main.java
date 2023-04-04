package calculate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char repeat = 'Y';
        while (repeat == 'Y') {
            System.out.println("Enter first number");
            int num1 = input.nextInt();
            System.out.println("Enter second number");
            int num2 = input.nextInt();
            System.out.println("Please enter one of the symbol +,-,*,/: ");
            char symbol = input.next().charAt(0);
            Calculator calculate = new Calculator();
            calculate.calculateResult(num1, num2, symbol);
            System.out.println("Would you like to do more calculation? Please enter 'Y' or 'N': ");
            repeat = input.next().charAt(0);
        }
        input.close();
    }
}
