package Easy_Problems;

import java.util.Scanner;

public class simpleCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.print("which operation do you want to have(+, -, *, /, %)? ");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println("Answer is : " + (a + b));
                break;
            case '-':
                System.out.println("Answer is : " + (a - b));
                break;
            case '*':
                System.out.println("Answer is : " + (a * b));
                break;
            case '/':
                System.out.println("Answer is : " + (double) (a / b));
                break;
            default:
                System.out.println("Invalid!");
        }

    }
}
