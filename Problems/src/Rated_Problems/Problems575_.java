
package Rated_Problems;

import java.util.Scanner;

public class Problems575_ {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char ch=str.charAt(0);
		if(ch =='A' || ch == 'B' || ch == 'C'){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}
