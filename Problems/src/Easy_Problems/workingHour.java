package Easy_Problems;

import java.util.Scanner;

public class workingHour {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter hour each day from Saturday to Tuesday");
		int X=sc.nextInt();
		System.out.println("enter work hour for Wednesday");
		int Y=sc.nextInt();
		int totalHour=(X*4)+Y;
		System.out.println("The total number of working hours in one week: "+totalHour);
	}
}
