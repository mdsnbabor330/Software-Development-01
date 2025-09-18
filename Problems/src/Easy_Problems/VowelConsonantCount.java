package Easy_Problems;

import java.util.Scanner;

public class VowelConsonantCount {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		int vowels = 0, consonants = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
				if (ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' ||
						ch=='I' || ch=='o' || ch=='O'|| ch=='u' || ch=='U') {
					vowels++;
				} else {
					consonants++;
				}
			}
		}
		System.out.println("Vowels: " + vowels + "\nConsonants: " + consonants);
		input.close();
	}
}
