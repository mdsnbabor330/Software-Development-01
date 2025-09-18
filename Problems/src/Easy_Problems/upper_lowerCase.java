package Easy_Problems;

import java.util.Scanner;

public class upper_lowerCase {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();

		String upper = str.toUpperCase();

		String lower = str.toLowerCase();

		System.out.println("Uppercase: " + upper);
		System.out.println("Lowercase: " + lower);

		input.close();
	}
}
