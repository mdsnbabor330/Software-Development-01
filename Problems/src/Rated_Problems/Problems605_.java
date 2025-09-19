
package Rated_Problems;

import java.util.Scanner;

public class Problems605_ {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of People:");
		int n=sc.nextInt();
		int eligible=0;
		System.out.println("Enter minimum age to vote:");
		int x = sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]>=x) {
				eligible++;
			}
		}
		System.out.println("Number of eligible voters : " + eligible);
	}
}