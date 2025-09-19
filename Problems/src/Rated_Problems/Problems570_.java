
package Rated_Problems;

import java.util.Scanner;

public class Problems570_ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int required = N-X;
		int needPackets = (int) Math.ceil((double) required / 4);
		System.out.println("Minimum packets needed : "+needPackets);
	}
}
