
package Rated_Problems;

import java.util.Scanner;

public class Problems580_ {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int P=sc.nextInt(); //Company A
		int Q=sc.nextInt(); //Company B
		int R=sc.nextInt(); //Company C
		int S=sc.nextInt(); //Company D
		if(P>(Q+R+S) || Q>(P+R+S) || R>(Q+P+S) || S>(Q+R+P)){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
}