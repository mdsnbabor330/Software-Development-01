package Easy_Problems;

import java.util.Scanner;

public class avgMustInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int C = sc.nextInt();
		int B = (A + C) / 2;
		if (B % 2 == 0) {
			System.out.print("Integer");
		} else {
			System.out.print(" No Integer");
		}
	}
}

