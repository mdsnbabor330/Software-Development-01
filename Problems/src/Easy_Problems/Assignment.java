package Easy_Problems;

import java.util.Scanner;

public class Assignment {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int S_time=sc.nextInt();
		int C_time= S_time+3;
		if(C_time < 10){
			System.out.println("Complete all assignment on time");
		}
		else{
			System.out.println("Not");
		}

	}
}
