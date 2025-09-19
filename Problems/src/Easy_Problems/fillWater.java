package Easy_Problems;

import java.util.Scanner;

public class fillWater {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int B1=sc.nextInt();
		int B2=sc.nextInt();
		int B3=sc.nextInt();
		if(B1==0 && B2==0 || B1==0 && B3==0 || B2==0 && B3==0) {
			System.out.println("Water filling time");
		}
		else {
			System.out.println("Not now");
		}
	}
}
