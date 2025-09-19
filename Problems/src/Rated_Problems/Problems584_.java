
package Rated_Problems;

import java.util.Scanner;

public class Problems584_ {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		if((A>B && A>C) || (B>A && B>C ) || (C>A && C>B)) {
			System.out.println("Yes, Agree");
		}
		else {
			System.out.println("Not");
		}
	}
}