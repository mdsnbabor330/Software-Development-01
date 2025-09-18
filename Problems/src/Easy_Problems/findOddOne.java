package Easy_Problems;

import java.util.Scanner;

public class findOddOne {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a==b && a!=c){
			System.out.println(c +" is unique");
		} else if (a==c  && b!=a) {
			System.out.println(b +" is unique");
		}
		else if (b==c  && a!=b) {
		System.out.println(a +" is unique");
		}
		else{
			System.out.println("invalid input");
		}
	}
}
